package br.com.mobitbrasil.ped.q1;

public class Triangulo {

    /**
     * Validar triangulo
     *
     * @param a - Lado a
     * @param b - Lado b
     * @param c - Lado c
     *
     * @return
     */
    public static boolean checarTriangulo(int a, int b, int c){
        int A = Math.abs(b-c);
        int B = Math.abs(a-c);
        int C = Math.abs(a-b);

        if(A<a && a < b+c && B<b && b < a+c && C < c && c<a+b){
            return true;
        }
        else
         return false;
    }

}
