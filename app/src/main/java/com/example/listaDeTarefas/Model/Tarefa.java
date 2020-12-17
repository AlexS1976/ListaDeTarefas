package com.example.listaDeTarefas.Model;

import java.io.Serializable;

public class Tarefa implements Serializable {

    private long id;
    private String nomeTarefa;

    public long getId() {
        return id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }
}
