package br.com.mobitbrasil.ped.JunitTestes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mobitbrasil.ped.q2.Palindromo;

public class PalindromoTeste {

	@Test
	public void testChecarPalindromo() {
		assertTrue(Palindromo.checarPalindromo("Hannah"));
		
	}

}
