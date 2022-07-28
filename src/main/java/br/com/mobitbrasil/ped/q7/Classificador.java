package br.com.mobitbrasil.ped.q7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Classificador {

    /**
     * Verificar a quantidade de ocorrências de uma palavra em um arquivo texto.
     *
     * Arquivo: palavras.txt em src/main/resources/
     *
     * @param palavra - Palavra para pesquisa
     *
     * @return
     * @throws IOException
     */
    public static long contarPalavras(String palavra) throws IOException{
        int palavrasIguais=0;
        String linhaAtual;
        try (BufferedReader in = new BufferedReader(new FileReader("src/main/resources/palavras.txt"))) {
            while ((linhaAtual = in.readLine()) != null)
              {
                StringTokenizer tokens = new StringTokenizer(linhaAtual);
                   while (tokens.hasMoreTokens())
                   {
                      if (tokens.nextToken().contains(palavra))
                            palavrasIguais++;
                   }
              }
        }
        return palavrasIguais;
    }

}
