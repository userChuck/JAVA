package br.com.Lista;

	import java.util.Scanner;

public class EX_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int[] vetor = new int[10];
	
		
		for(int i = 0; i<vetor.length; i++){
		
		do{
			
			System.out.printf("Digite %d� numero: ",i+1);
			vetor[i] = in.nextInt();
		}while(vetor[i] != vetor[i] );
		
		}
	}

}
