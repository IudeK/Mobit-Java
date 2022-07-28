package br.com.mobitbrasil.ped.JunitTestes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mobitbrasil.ped.q5.SomaRecursiva;

public class SomaTeste {

	@Test
	public void testSomar() {
		int resultado_esperado = 21;
		
		assertEquals(SomaRecursiva.somar(6),resultado_esperado);
	}

}
