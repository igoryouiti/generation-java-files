package br.com.generation;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		// 1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
		// atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		
		int numbers[] = new int[5];
		int bigger = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero inteiro: ");
			numbers[i] = input.nextInt();
			if(numbers[i] > bigger)
				bigger = numbers[i];
		}
		
		System.out.println("Os n�meros digitados foram: ");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " - ");
		}
		
		System.out.println("\nO maior n�mero digitado foi: " + bigger);
	}

}
