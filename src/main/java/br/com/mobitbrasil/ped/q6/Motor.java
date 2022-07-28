package br.com.mobitbrasil.ped.q6;

public class Motor implements Exibivel {

    int potencia;
    int cilindrada;

    public Motor(int potencia, int cilindrada) {
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }

    public String exibir() {
        return  "Cilindrada: "+cilindrada +" , Potência: "+ potencia + "\n";
    }

}
