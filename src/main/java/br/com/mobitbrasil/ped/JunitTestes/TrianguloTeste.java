package br.com.mobitbrasil.ped.JunitTestes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mobitbrasil.ped.q1.Triangulo;

public class TrianguloTeste {

	@Test
	public void testChecarTriangulo() {
		assertTrue(Triangulo.checarTriangulo(5, 9, 10));
	
	}

}
