package com.algaworks.algafoods.domain.repository;

import com.algaworks.algafoods.domain.Restaurante;

import java.util.List;

public interface RestauranteRepository {

    public Restaurante salvar(Restaurante restaurante);
    public List<Restaurante> todas();
    public Restaurante porId(Integer id);
    public void deletar(Integer id);
}
