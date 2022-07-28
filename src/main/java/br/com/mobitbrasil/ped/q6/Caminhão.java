package br.com.mobitbrasil.ped.q6;

public class Caminhão extends Veiculo {
    
int toneladas;
int alturaMax;
int comprimento;

public Caminhão() {
}

public Caminhão(Motor carro, Peça pastilhas_dos_freios, Peça velas_de_ignição, Peça embreagem, Peça radiador,
        Peça amortecedor, int toneladas, int alturaMax, int comprimento) {
    super(carro, pastilhas_dos_freios, velas_de_ignição, embreagem, radiador, amortecedor);
    this.toneladas = toneladas;
    this.alturaMax = alturaMax;
    this.comprimento = comprimento;
}

public int getToneladas() {
    return toneladas;
}

public void setToneladas(int toneladas) {
    this.toneladas = toneladas;
}

public int getAlturaMax() {
    return alturaMax;
}

public void setAlturaMax(int alturaMax) {
    this.alturaMax = alturaMax;
}

public int getComprimento() {
    return comprimento;
}

public void setComprimento(int comprimento) {
    this.comprimento = comprimento;
}

public void exibir() {
    super.exibir();
    System.out.print("Altura Máxima: " + alturaMax + ", Comprimento: " + comprimento + ", Peso: " + toneladas);
    
}

}
