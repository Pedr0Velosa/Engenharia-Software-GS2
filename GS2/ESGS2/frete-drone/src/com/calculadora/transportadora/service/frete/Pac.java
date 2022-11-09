package com.calculadora.transportadora.service.frete;

import com.calculadora.transportadora.service.Frete;

public class Pac implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 0.25 + 10;
	}
	
}
