package br.com.mobitbrasil.ped.JunitTestes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mobitbrasil.ped.q3.Primo;

public class PrimoTeste {

	@Test
	public void testProximoPrimo() {
		int resultado_esperado = 13;
		
		assertEquals(Primo.proximoPrimo(11),resultado_esperado);
		
	}

}
