package br.com.Ex_03;

public class Produto {

	private long codigo;
	private String nomeProduto;
	
	
	public Produto (long codigo, String nomeProduto) {
		
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
	}
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	
	public String consultaNomeProduto() {
		
		return nomeProduto;
		
	}
	
	
}
