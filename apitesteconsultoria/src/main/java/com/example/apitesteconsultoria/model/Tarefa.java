package com.example.apitesteconsultoria.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String titulo;
    private String descricao;
    private Timestamp prazo;
    private String departamento;
    private int duracao;
    private int id_pessoa;
    private Boolean finalizado;
}
