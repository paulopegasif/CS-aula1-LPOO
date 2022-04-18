package br.edu.ifsul.cc.lpoo.cs.model;

public class Endereco {
    //atributos seguindo a nomeclatura DC
    private Integer id;
    private String cep;
    private String complemento;


    public Endereco(){ //metodo construtor sem parametros.
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
