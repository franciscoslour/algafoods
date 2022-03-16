package com.algaworks.algafoods.infastructure.repository;

import com.algaworks.algafoods.domain.Restaurante;
import com.algaworks.algafoods.domain.repository.RestauranteRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public Restaurante salvar(Restaurante restaurante) {
        return manager.merge(restaurante);
    }

    @Override
    public List<Restaurante> todas() {
        return manager.createQuery("from Restaurante").getResultList();
    }

    @Override
    public Restaurante porId(Integer id) {
        return manager.find(Restaurante.class, id);
    }

    @Override
    @Transactional
    public void deletar(Integer id) {
        Restaurante restaurante = this.porId(id);
        manager.remove(restaurante);
    }
}
