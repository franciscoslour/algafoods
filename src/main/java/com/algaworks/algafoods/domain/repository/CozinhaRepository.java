package com.algaworks.algafoods.domain.repository;


import com.algaworks.algafoods.domain.Cozinha;

import java.util.List;

public interface CozinhaRepository {

    public Cozinha salvar(Cozinha cozinha);
    public List<Cozinha> todas();
    public Cozinha porId(Integer id);
    public void deletar(Integer id);

}
