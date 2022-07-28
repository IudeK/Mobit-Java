package br.com.mobitbrasil.ped.q3;

public class Primo {

    /**
     * Retornar o proximo numero primo após um valor numerico.
     *
     * @param numero - Valor numerico
     *
     * @return
     */
    public static long proximoPrimo(long numero){
      long aux = numero + 1;
      while(true) { 
        for (int i = 2; i < aux; i++) {
            if (aux % i == 0){
                aux+=1;
            }   
        }
        return aux; 
        } 
    }
}


