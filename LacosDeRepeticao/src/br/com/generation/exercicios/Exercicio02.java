package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		// 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		Scanner input = new Scanner(System.in);
		
		int number, odd = 0, even = 0;
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.println("Digite um numero inteiro positivo: ");
			number = input.nextInt();
			
			if(number%2 == 0)
				even++;
			else
				odd++;
		}
		
		System.out.println("Quantidade de numeros pares digitados: " + even);
		System.out.println("Quantidade de numeros �mpares digitados: " + odd);
	}

}
