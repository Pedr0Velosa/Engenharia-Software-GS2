package com.calculadora.transportadora.service.frete;

import com.calculadora.transportadora.service.Frete;

public class Sedex implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 0.45 + 12;
	}
	
}
