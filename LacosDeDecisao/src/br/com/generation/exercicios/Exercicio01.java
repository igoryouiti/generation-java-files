package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/*
		 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 * 
		 */
		
		int number1, number2, number3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero inteiro: ");
		number1 = input.nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro: ");
		number2 = input.nextInt();
		
		System.out.println("Digite o terceiro n�mero inteiro: ");
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
