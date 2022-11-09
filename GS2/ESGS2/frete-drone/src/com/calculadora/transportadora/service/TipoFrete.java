package com.calculadora.transportadora.service;

import com.calculadora.transportadora.service.frete.Pac;
import com.calculadora.transportadora.service.frete.Sedex;
import com.calculadora.transportadora.service.frete.Jatinho;

public enum TipoFrete {

	PAC {
		@Override
		public Frete obterFrete() {
			return new Pac();
		}
	},
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
		
	},
	JATINHO {
		@Override
		public Frete obterFrete() {
			return new Jatinho();
		}
		
	};
	
	public abstract Frete obterFrete();
	
}
