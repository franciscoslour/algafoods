package com.algaworks.algafoods.domain.repository;

import com.algaworks.algafoods.domain.Cidade;

import java.util.List;

public interface CidadeRepository {

    public Cidade salvar(Cidade cidade);
    public List<Cidade> todas();
    public Cidade porId(Integer id);
    public void deletar(Integer id);

}
