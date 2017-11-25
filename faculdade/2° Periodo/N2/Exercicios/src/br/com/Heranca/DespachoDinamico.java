package br.com.Heranca;

import br.com.Heranca.DespachoDinamico.A;
import br.com.Heranca.DespachoDinamico.B;

public class DespachoDinamico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new B();
		obj1.chameme();
	}
	
	
	public static class A {
		void chameme() {
			System.out.println("Dentro do m�todo chameme de A");
		}
	}

	public static class B extends A {
		void chameme( ) {
		   System.out.println("Dentro do m�todo chameme de B");
		 }
	}


}

