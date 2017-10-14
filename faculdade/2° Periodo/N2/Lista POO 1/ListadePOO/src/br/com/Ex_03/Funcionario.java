package br.com.Ex_03;

public class Funcionario {

	private double salario;
	private double venda ;
	
	
	public Funcionario (){
		
	}	
	public Funcionario (double venda){
		this.venda= venda;
	}
	public Funcionario (Double salario){
		this.salario = salario;	
	}	
	
	
	
	public double getVenda(){
		return venda;
	}
	public double setSalario(){
		return salario;
	}
		
	public double calculaSalario(double salario){
			
		
		if(this.venda > 8.000){
			salario = 382.33 +(venda * 0.08675);		
		}else{
			salario = 177.12 +(venda * 00.387);
		}
			
		System.out.println("O seu sel�rio ser� de: ");
		return salario;
		
	}
	
}
