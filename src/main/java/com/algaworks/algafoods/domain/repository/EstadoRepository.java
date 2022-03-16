package com.algaworks.algafoods.domain.repository;

import com.algaworks.algafoods.domain.Estado;

import java.util.List;

public interface EstadoRepository {

    public Estado salvar(Estado estado);
    public List<Estado> todos();
    public Estado porId(Integer id);
    public void deletar(Integer id);

}
