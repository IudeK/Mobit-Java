package br.com.mobitbrasil.ped.q8;

import java.util.List;

public class Ordenar {

    /**
     * Realizar a ordenação da listagem de pessoas utilizando o atributo idade de @Pessoa
     *
     * @param pessoas - Lista de pessoas
     *
     * @return
     */
    static int j;
    public static List<Pessoa> ordenar(List<Pessoa> pessoas){
        if (j == pessoas.size())
            return pessoas;
        for (int i=0; i<pessoas.size()-1; i++)
            if (pessoas.get(i).getIdade() > pessoas.get(i+1).getIdade()){
                Pessoa aux;
                aux = pessoas.get(i);
                pessoas.set(i, pessoas.get(i+1));
                pessoas.set(i+1, aux);
            }
        j++;    
        return ordenar(pessoas);        
    }

}
