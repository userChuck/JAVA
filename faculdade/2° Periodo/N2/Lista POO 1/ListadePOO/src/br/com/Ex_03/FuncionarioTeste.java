package br.com.Ex_03;

import java.util.Scanner;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da venda: ");
		double venda = in.nextDouble();
		Funcionario f1 = new  Funcionario(venda);
		
		System.out.println(f1.calculaSalario(f1.setSalario()));
		
		
	
	}

}
