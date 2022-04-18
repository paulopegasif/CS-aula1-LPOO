package br.edu.ifsul.cc.lpoo.cs.model;

import java.util.Calendar;
import java.util.List;

public class Compra {
    private Integer id;
    private Calendar data;
    private Float total;
    private Jogador jogador; //agregacao por composicao
    private List<ItensCompra> listaItensCompra; //agregacao

    public Compra(){
    }


}
