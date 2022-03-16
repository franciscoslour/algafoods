package com.algaworks.algafoods.infastructure.repository;

import com.algaworks.algafoods.domain.Cozinha;
import com.algaworks.algafoods.domain.repository.CozinhaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Cozinha salvar(Cozinha cozinha) {
        return manager.merge(cozinha);
    }

    @Override
    public List<Cozinha> todas() {
        return manager.createQuery("from Cozinha").getResultList();
    }

    @Override
    public Cozinha porId(Integer id) {
        return manager.find(Cozinha.class,id);
    }

    @Override
    @Transactional
    public void deletar(Integer id) {
        Cozinha cozinha = this.porId(id);
        manager.remove(cozinha);
    }
}
