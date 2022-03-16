package com.algaworks.algafoods.infastructure.repository;

import com.algaworks.algafoods.domain.Cidade;
import com.algaworks.algafoods.domain.repository.CidadeRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class CidadeRepositoryImpl implements CidadeRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Cidade salvar(Cidade cidade) {
        return manager.merge(cidade);
    }

    @Override
    public List<Cidade> todas() {
        return manager.createQuery("from Cidade").getResultList();
    }

    @Override
    public Cidade porId(Integer id) {
        return manager.find(Cidade.class,id);
    }

    @Override
    public void deletar(Integer id) {
        Cidade cidade = this.porId(id);
        manager.remove(cidade);
    }
}
