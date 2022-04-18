package br.edu.ifsul.cc.lpoo.cs.model;

import java.util.Calendar;
import java.util.List;

public class Jogador {

    private String nickname;
    private String senha;
    private Integer pontos;
    private Calendar dataCadastro;
    private Calendar dataUltimoLogin;
    private Endereco enderecoJogador; //associacao
    private List<Patente> listaPatentes; //agregacao
    private List<Artefato> listaArtefatos; //agregacao
    private List<Compra> listaCompras; //agregacao por composicao


    public Jogador() { //metodo construtor sem argumentos
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Calendar getDataUltimoLogin() {
        return dataUltimoLogin;
    }

    public void setDataUltimoLogin(Calendar dataUltimoLogin) {
        this.dataUltimoLogin = dataUltimoLogin;
    }

    public Endereco getEnderecoJogador() {
        return enderecoJogador;
    }

    public void setEnderecoJogador(Endereco enderecoJogador) {
        this.enderecoJogador = enderecoJogador;
    }

    public List<Patente> getListaPatentes() {
        return listaPatentes;
    }

    public void setListaPatentes(List<Patente> listaPatentes) {
        this.listaPatentes = listaPatentes;
    }

    public List<Artefato> getListaArtefatos() {
        return listaArtefatos;
    }

    public void setListaArtefatos(List<Artefato> listaArtefatos) {
        this.listaArtefatos = listaArtefatos;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }
}
