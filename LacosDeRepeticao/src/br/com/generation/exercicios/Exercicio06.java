package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		// 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		// final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		// 0(zero).(DO...WHILE)
		
		
		int number;
		double average;
		double sum = 0.0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um numero inteiro ou zero para sair: ");
			number = input.nextInt();
			if(number % 3 == 0 && number != 0) {
				sum += number;
				count++;
			}
		}while(number != 0);
		
		average = sum/count;
		System.out.println("\nA m�dia dos n�meros m�tiplos de 3: " + average);
		
		input.close();
		
	}

}
