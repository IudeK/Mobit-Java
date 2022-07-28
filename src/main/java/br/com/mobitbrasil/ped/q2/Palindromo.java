package br.com.mobitbrasil.ped.q2;

public class Palindromo {

    /**
     * Checar palindromo
     *
     * @param texto - Texto palindromo
     *
     * @return
     */
    public static boolean checarPalindromo(String texto){
        texto = texto.toLowerCase();
        for (int i = 0, j = texto.length() -1; i <= j; i++,j--) {
            if (texto.charAt(i) != texto.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
