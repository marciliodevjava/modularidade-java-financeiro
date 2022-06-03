package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class Teste {

	public static void main(String[] args){


		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		System.out.println(calc.soma(2,3,4));
		
		
//		Calculadoraimpl calc = new Calculadoraimpl();
//		System.out.println(calc.soma(2, 3, 4));
//	
//		OperacoesAritmeticas op = new OperacoesAritmeticas();
//		System.out.println(op.soma(4,5,6));
//		
		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
			fieldId.setAccessible(false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(calc.getId());
	
	}
}
