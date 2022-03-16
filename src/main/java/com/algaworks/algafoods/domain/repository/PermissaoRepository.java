package com.algaworks.algafoods.domain.repository;

import com.algaworks.algafoods.domain.Permissao;

import java.util.List;

public interface PermissaoRepository {

    public Permissao salvar(Permissao permissao);

    public List<Permissao> todas();

    public Permissao porId(Integer id);

    public void deletar(Integer id);

}
