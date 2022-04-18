package br.edu.ifsul.cc.lpoo.cs.model;

import java.util.Calendar;
import java.util.List;

public class Partida {
    private Integer id;
    private Calendar inicio;
    private Calendar fim;
    private Jogador jogador;
    private List<Round> listaRound; //agregacao por composicao

    public Partida(){
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public List<Round> getListaRound() {
        return listaRound;
    }

    public void setListaRound(List<Round> listaRound) {
        this.listaRound = listaRound;
    }
}
