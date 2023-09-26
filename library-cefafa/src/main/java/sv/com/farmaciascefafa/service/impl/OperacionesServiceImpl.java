package sv.com.farmaciascefafa.service.impl;

import sv.com.farmaciascefafa.service.IOperacionesService;

public class OperacionesServiceImpl implements IOperacionesService {

	@Override
	public double suma(double valor1, double valor2) {
		return valor1 + valor2;
	}

	@Override
	public double resta(double valor1, double valor2) {
		return valor1 - valor2;
	}

	@Override
	public double multiplicacion(double valor1, double valor2) {
		return valor1 * valor2;
	}

	@Override
	public double division(double valor1, double valor2) {
		return valor1 / valor2;
	}

}
