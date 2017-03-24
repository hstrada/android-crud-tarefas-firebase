package br.com.firebase.firebase.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by logonrm on 23/03/2017.
 */

@IgnoreExtraProperties
public class Tarefa {

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
