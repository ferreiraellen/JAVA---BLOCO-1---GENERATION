package familia55;

import java.util.Scanner;

public class exercicio1 {
	
//exercício: faça um programa que receba três números inteiros e informe o maior número

	public static void main(String[] args) {
	
		int n1,n2,n3;
		double MaiorNumero;
		double MenorNumero;
		
		Scanner leia =new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		n1=leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		n2=leia.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		n3=leia.nextInt();
		
		if ((n1>n2) && (n1>n3))
		{
			MaiorNumero = n1;
			System.out.println("\nO maior número é: " + n1);
			
		}
		else if ((n2>n1) && (n2>n3))
		{
			MaiorNumero = n2;
			System.out.println("\nO maior número é: " + n2);
		}
		else if((n3>n1) && (n3>n2))
		{	
	        MaiorNumero= n3;
	        System.out.println("\nO maior número é: " + n3);
		}
}
}
