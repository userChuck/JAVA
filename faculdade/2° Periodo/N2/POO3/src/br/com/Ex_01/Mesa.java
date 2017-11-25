package br.com.Ex_01;

import java.util.ArrayList;

public class Mesa {
	private int numero;
	private String cliente;
	private ArrayList <Pedido> pedido;
	public Mesa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mesa(int numero, String cliente, ArrayList<Pedido> pedido) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.pedido = pedido;
	}
	public Mesa(int numero, String cliente) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Pedido> getPedido() {
		return pedido;
	}
	public void setPedido(ArrayList<Pedido> pedido) {
		this.pedido = pedido;
	}
	
	
	
}
