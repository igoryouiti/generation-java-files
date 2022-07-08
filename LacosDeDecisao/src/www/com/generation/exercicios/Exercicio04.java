package www.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		 *		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		 *		ímpar exiba o número elevado ao quadrado.
		 */
		
		
		int number;
		double resultado;

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite um numero: ");
		number = input.nextInt();
		
		
		input.close();
		
		switch(number%2) {
			case 1:
				
				
				System.out.println("O numero digitado é ímpar.");
				
				resultado = Math.pow(number, 2);
				System.out.println("Sua raiz quadrada é: " + resultado );
				
				break;
				
			case 0: 
				
				System.out.println("O numero digitado é par.");
				
				resultado = Math.sqrt(number);
				System.out.println("Sua raiz quadrada é: " + resultado );
				
				
				break;
				
			default:
				break;
		}
		
		
	}

}
