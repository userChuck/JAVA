package br.com.Objetos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		Lampada o1 = new Lampada ( wolts, garantia);
		
		System.out.println("Digite a cor da Lampada: ");
		int cor = in.nextInt();

		System.out.println("Digite o Valor da Lampada: ");
		double valor = in.nextDouble();

		System.out.println("Digite a Voltagem da Lampada: ");
		int wolts = in.nextInt();

		System.out.println("Digite quanto tempo de garantia: ");
		int garantia = in.nextInt();
		
		
		
		

	}

}