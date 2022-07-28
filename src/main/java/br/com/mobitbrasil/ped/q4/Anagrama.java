package br.com.mobitbrasil.ped.q4;

public class Anagrama {

    /**
     * Checar se dois textos são anagramas
     *
     * @param a - Primeiro texto
     * @param b - Segundo texto
     *
     * @return
     */
    public static boolean checarAnagramas(String a, String b){
        a=a.toLowerCase();
        b=b.toLowerCase();
        int aux = 0;
        if(a.length()!=b.length())
            return false;
        for(int i=0;i<a.length();i++){
            for(int j=0;j<a.length();j++){
                if(a.charAt(i)==b.charAt(j))
                    aux++;
            }
        }
        if(aux==a.length())
            return true;
        else
            return false; 
    }
}
