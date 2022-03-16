package com.algaworks.algafoods.infastructure.repository;

import com.algaworks.algafoods.domain.FormaPagamento;
import com.algaworks.algafoods.domain.repository.FormaPagamentoRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    @Transactional
    public FormaPagamento salvar(FormaPagamento formaPagamento) {
        return this.manager.merge(formaPagamento);
    }

    @Override
    public List<FormaPagamento> todas() {
        return this.manager.createQuery("from FormaPagamento").getResultList();
    }

    @Override
    public FormaPagamento porId(Integer id) {
        return this.manager.find(FormaPagamento.class,id);
    }

    @Override
    @Transactional
    public void deletar(Integer id) {
        FormaPagamento formaPagamento = this.porId(id);
        this.manager.remove(formaPagamento);
    }

}
