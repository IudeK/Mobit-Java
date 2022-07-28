package br.com.mobitbrasil.ped.q8;

public class Pessoa {

    private String nome;
    private Integer idade;
    private String email;
    private String telefone;

    
    public Pessoa(Integer idade) {
        this.idade = idade;
    }


    public Integer getIdade() {
        return idade;
    }
}
