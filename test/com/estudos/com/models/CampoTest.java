package com.estudos.com.models;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTest {
	private Campo campo;
	
	
	@BeforeEach
	void iniciarCampo () {
		campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoRealDistancia1() {
		Campo vizinho = new Campo (3,2);
		boolean result = campo.adicionarVizinho(vizinho);
		assertTrue(result);
	}
	
	@Test
	void testeVizinhoRealDistancia2() {
		Campo vizinho = new Campo (2,2);
		boolean result = campo.adicionarVizinho(vizinho);
		assertTrue(result);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo (1,1);
		boolean result = campo.adicionarVizinho(vizinho);
		assertFalse(result);
	}
		
}
