package familia55;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		double valor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();
		
		if(num % 2 == 0)
		{
			valor = Math.sqrt(num);
		}
		else
		{
			valor = Math.pow(num, 2);
		}
		System.out.printf("\nValor: %.2f",valor);
	
	}


	}


