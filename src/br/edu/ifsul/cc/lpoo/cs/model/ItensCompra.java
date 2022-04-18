package br.edu.ifsul.cc.lpoo.cs.model;

public class ItensCompra {
    private Integer id;
    private String quantidade;
    private Float valor;
    private Artefato artefato; //agregacao por composicao // entidade forte
    private Compra compra; //agregacao por composicao // entidade forte


    public ItensCompra(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
