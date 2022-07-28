package br.com.mobitbrasil.ped.q6;

public class ClasseTeste {
    
public static void main(String[] args) {

Motor i = new Motor(150, 1);
Peça a = new Peça("T1", "Fiat");
Peça b = new Peça("T2", "Fiat");
Peça c = new Peça("T3", "Fiat");
Peça d = new Peça("T4", "Fiat");
Peça e = new Peça("T5", "Fiat");

CarroPasseio f = new CarroPasseio(i, a, b, c, d, e, "amarelo", "onix");

f.exibir();

}

}
