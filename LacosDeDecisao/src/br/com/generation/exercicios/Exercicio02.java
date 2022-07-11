package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * 	2- Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		
		int number1, number2, number3;

		
		
		Scanner input = new Scanner(System.in);
		
		do {
		
			System.out.println("Digite o primeiro número inteiro ou zero para sair: ");
			number1 = input.nextInt();
			
			System.out.println("Digite o segundo número inteiro ou zero para sair: ");
			number2 = input.nextInt();
			
			System.out.println("Digite o terceiro número inteiro ou zero para sair: ");
			number3 = input.nextInt();
			
			
			
			System.out.println("\n");
			
			if(number1 != 0 && number2 != 0 && number3 != 0) {
				if(number1 < number2) {
					if(number2 < number3) {
						System.out.println("Numeros em ordem: " + number1 + " - " + number2 + " - " + number3);
					} else if(number1 < number3) {
						System.out.println("Numeros em ordem: " + number1 + " - " + number3 + " - " + number2);
					} else {
						System.out.println("Numeros em ordem: " + number3 + " - " + number1 + " - " + number2);
					}
				} else if(number2 < number3) {
					if(number1 < number3) {
						System.out.println("Numeros em ordem: " + number2 + " - " + number1 + " - " + number3);
					} else {
						System.out.println("Numeros em ordem: " + number2 + " - " + number3 + " - " + number1);
					}
					
				} else {
					System.out.println("Numeros em ordem: " + number3 + " - " + number2 + " - " + number1);
				}
			}
		}while(number1 != 0 && number2 != 0 && number3 != 0);
		input.close();
		System.out.println("Fechando...");
	}

}
