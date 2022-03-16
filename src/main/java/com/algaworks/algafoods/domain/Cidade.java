package com.algaworks.algafoods.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cidade {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private String cidade;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Estado estado;

}
