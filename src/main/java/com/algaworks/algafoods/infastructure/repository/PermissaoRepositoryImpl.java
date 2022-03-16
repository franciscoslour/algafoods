package com.algaworks.algafoods.infastructure.repository;

import com.algaworks.algafoods.domain.Permissao;
import com.algaworks.algafoods.domain.repository.PermissaoRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class PermissaoRepositoryImpl implements PermissaoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Permissao salvar(Permissao permissao) {
        return manager.merge(permissao);
    }

    @Override
    public List<Permissao> todas() {
        return manager.createQuery("from Permissao").getResultList();
    }

    @Override
    public Permissao porId(Integer id) {
        return manager.find(Permissao.class,id);
    }

    @Override
    @Transactional
    public void deletar(Integer id) {
        Permissao permissao = this.porId(id);
        this.manager.remove(permissao);
    }

}
