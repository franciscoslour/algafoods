package com.algaworks.algafoods.domain.repository;

import com.algaworks.algafoods.domain.FormaPagamento;

import java.util.List;

public interface FormaPagamentoRepository {

    public FormaPagamento salvar(FormaPagamento formaPagamento);
    public List<FormaPagamento> todas();
    public FormaPagamento porId(Integer id);
    public void deletar(Integer id);
}
