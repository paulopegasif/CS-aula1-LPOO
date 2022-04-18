package br.edu.ifsul.cc.lpoo.cs.model;

import java.util.Calendar;
import java.util.List;

public class Round {
    private Integer id;
    private Integer numero;
    private Calendar inicio;
    private Calendar fim;
    private Modo modo;
    private List<Objetivo> listaObjetivo; //agregacao por composicao
    //private ResuldadoID resultadoId;


    public Round(){
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getFim() {
        return fim;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public List<Objetivo> getListaObjetivo() {
        return listaObjetivo;
    }

    public void setListaObjetivo(List<Objetivo> listaObjetivo) {
        this.listaObjetivo = listaObjetivo;
    }

    public Modo getModo() {
        return modo;
    }

    public void setModo(Modo modo) {
        this.modo = modo;
    }



}
