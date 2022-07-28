package br.com.mobitbrasil.ped.JunitTestes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mobitbrasil.ped.q4.Anagrama;

public class AnagramaTeste {

	@Test
	public void testChecarAnagramas() {
		assertTrue(Anagrama.checarAnagramas("pato", "topa"));
	}

}
