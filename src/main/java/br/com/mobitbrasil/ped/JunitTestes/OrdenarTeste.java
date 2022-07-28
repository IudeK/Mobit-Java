package br.com.mobitbrasil.ped.JunitTestes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.mobitbrasil.ped.q8.Ordenar;
import br.com.mobitbrasil.ped.q8.Pessoa;

public class OrdenarTeste {

	@Test
	public void testOrdenar() {
		
		 	Pessoa a = new Pessoa(12);
	        Pessoa b = new Pessoa(15);
	        Pessoa c = new Pessoa(32);
	        Pessoa d = new Pessoa(2);
	        Pessoa e = new Pessoa(9);
	        Pessoa f = new Pessoa(12);
	        Pessoa g = new Pessoa(27);
	        Pessoa h = new Pessoa(92);
	        Pessoa i = new Pessoa(3);

	        List<Pessoa> listaTeste = new ArrayList<Pessoa>();
	        List<Pessoa> listaResultado = new ArrayList<Pessoa>();
	        
	        listaTeste.add(a);
	        listaTeste.add(b);
	        listaTeste.add(c);
	        listaTeste.add(d);
	        listaTeste.add(e);
	        listaTeste.add(f);
	        listaTeste.add(g);
	        listaTeste.add(h);
	        listaTeste.add(i);
	        
	        listaResultado.add(d);
	        listaResultado.add(i);
	        listaResultado.add(e);
	        listaResultado.add(a);
	        listaResultado.add(f);
	        listaResultado.add(b);
	        listaResultado.add(g);
	        listaResultado.add(c);
	        listaResultado.add(h);
	        
	        Ordenar.ordenar(listaTeste);

	        assertEquals(listaTeste,listaResultado);
	        
	    }
		
	

}
