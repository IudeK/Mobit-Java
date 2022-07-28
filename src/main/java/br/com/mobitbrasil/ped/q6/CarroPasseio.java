package br.com.mobitbrasil.ped.q6;

public class CarroPasseio extends Veiculo{

String cor;
String modelo;

public CarroPasseio(){
}

public CarroPasseio(Motor motor, Peça pastilhas_dos_freios, Peça velas_de_ignição, Peça embreagem, Peça radiador,
        Peça amortecedor, String cor, String modelo) {
    super(motor, pastilhas_dos_freios, velas_de_ignição, embreagem, radiador, amortecedor);
    this.cor = cor;
    this.modelo = modelo;
}

public String getCor() {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}

public void exibir() {
    super.exibir();
    System.out.print("Cor: " + cor + ", Modelo: " + modelo);
}

}