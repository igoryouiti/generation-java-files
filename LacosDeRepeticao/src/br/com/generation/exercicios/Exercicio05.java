package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		// 5- Crie um programa que leia um n�mero do teclado at� que encontre um
		//	n�mero igual a zero. No final, mostre a soma dos n�meros
		//	digitados.(DO...WHILE)
		
		int sum = 0;
		int number;
		
		Scanner input = new Scanner(System.in);
		
		do{
			
			System.out.println("Digite um n�mero inteiro: ");
			number = input.nextInt();
			
			sum+=number;
			
		}while(number != 0);
		
		System.out.println("\nA soma dos numeros digitado �: " + sum);
		
		input.close();
	}

}
