package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/*
		 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		 * 
		 */
		
		int number1, number2, number3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		number1 = input.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		number2 = input.nextInt();
		
		System.out.println("Digite o terceiro número inteiro: ");
		number3 = input.nextInt();
		
		input.close();
		
		System.out.println("\n");
		
		if((number1 > number2 && number1 > number3) || (number1 == number2 && number2 == number3)) {
			System.out.println("O maior numero digitado foi: " + number1);
		} else if(number2 > number3 || number2 == number3) {
			System.out.println("O maior numero digitado foi: " + number2);
		} else {
			System.out.println("O maior numero digitado foi: " + number3);
		}
		
	}

}
