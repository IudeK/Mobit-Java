package br.com.mobitbrasil.ped.q6;

public class Peça implements Exibivel{
    
    String descricao;
    String marca;
    
    public Peça(String descricao, String marca) {
        this.descricao = descricao;
        this.marca = marca;
    }

    public String exibir() {
        return "Descrição: "+descricao +", Marca: "+ marca+"\n";
    }
}
