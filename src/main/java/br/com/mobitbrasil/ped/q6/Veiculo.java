package br.com.mobitbrasil.ped.q6;

public class Veiculo {
    
    Motor Motor;

    Peça Pastilhas_dos_freios;
    Peça Velas_de_ignição;
    Peça Embreagem;
    Peça Radiador;
    Peça Amortecedor;

    public Veiculo() {
    }

    public Veiculo(Motor motor, Peça pastilhas_dos_freios, Peça velas_de_ignição, Peça embreagem, Peça radiador,
            Peça amortecedor) {
        Motor = motor;
        Pastilhas_dos_freios = pastilhas_dos_freios;
        Velas_de_ignição = velas_de_ignição;
        Embreagem = embreagem;
        Radiador = radiador;
        Amortecedor = amortecedor;
    }

    public void exibir() {
        
        System.out.print("Amortecedor - " + Amortecedor.exibir() + "Motor - " + Motor.exibir() + "Embreagem - " + Embreagem.exibir()
                + "Pastilhas dos freios - " + Pastilhas_dos_freios.exibir() + "Radiador - " + Radiador.exibir() + "Velas de ignição - "
                + Velas_de_ignição.exibir());
    }

    
 
        
}
