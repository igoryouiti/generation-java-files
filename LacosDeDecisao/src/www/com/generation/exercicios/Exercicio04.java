package www.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		 *		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		 *		�mpar exiba o n�mero elevado ao quadrado.
		 */
		
		
		int number;
		double resultado;

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite um numero: ");
		number = input.nextInt();
		
		
		input.close();
		
		switch(number%2) {
			case 1:
				
				
				System.out.println("O numero digitado � �mpar.");
				
				resultado = Math.pow(number, 2);
				System.out.println("Sua raiz quadrada �: " + resultado );
				
				break;
				
			case 0: 
				
				System.out.println("O numero digitado � par.");
				
				resultado = Math.sqrt(number);
				System.out.println("Sua raiz quadrada �: " + resultado );
				
				
				break;
				
			default:
				break;
		}
		
		
	}

}
