package com.algaworks.algafoods;

import com.algaworks.algafoods.domain.Cozinha;
import com.algaworks.algafoods.domain.FormaPagamento;
import com.algaworks.algafoods.domain.repository.CozinhaRepository;
import com.algaworks.algafoods.domain.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class AlgafoodsApplication {

    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    public static void main(String[] args) {
        SpringApplication.run(AlgafoodsApplication.class, args);
    }

    @EventListener
    public void Testando(ApplicationReadyEvent event){
        FormaPagamento formaPagamento = new FormaPagamento();
        formaPagamento.setDescricao("Transferência");

        formaPagamento = this.formaPagamentoRepository.salvar(formaPagamento);

        List<FormaPagamento> formas = this.formaPagamentoRepository.todas();
        formas.forEach(System.err::println);
    }

}
