package com.algaworks.algafoods.infastructure.repository;

import com.algaworks.algafoods.domain.Estado;
import com.algaworks.algafoods.domain.repository.EstadoRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Estado salvar(Estado estado) {
        return manager.merge(estado);
    }

    @Override
    public List<Estado> todos() {
        return manager.createQuery("from Estado").getResultList();
    }

    @Override
    public Estado porId(Integer id) {
        return manager.find(Estado.class, id);
    }

    @Override
    @Transactional
    public void deletar(Integer id) {
        Estado estado = this.porId(id);
        manager.remove(estado);
    }
}
