package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;

import br.com.cod3r.app.calculo.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

public class Teste {

	public static void main(String[] args){

		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2, 3, 4));
	
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(4,5,6));
		
		try {
			Field fieldId = Calculadora.class.getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
			fieldId.setAccessible(false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Calculadora.class.getName());
	}
	
}