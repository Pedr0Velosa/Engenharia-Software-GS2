package com.calculadora.transportadora.service.frete;

import com.calculadora.transportadora.service.Frete;

public class Jatinho implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 20 + 15.75 ;
	}
	
}
