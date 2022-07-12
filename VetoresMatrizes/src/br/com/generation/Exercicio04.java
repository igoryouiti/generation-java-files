package br.com.generation;

import java.util.Random;
import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		/*
		 * 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
				em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
				diagonal, ou seja, diagonal principal.
		 */
		
		int table[][] = new int[3][3];
		int sum = 0;
		int mainDiagonal = 0;
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		
		/*
		// Entrada manual
		System.out.println("Digite um valor inteiro para a matriz: ");
		for(int l = 0; l < table.length; l++) {
			for(int c = 0; c < table[l].length; c++) {
				table[l][c] = input.nextInt();
				sum += table[l][c];
				if(l == c)
					mainDiagonal += table[l][c];
			}
		}
		*/
		
		// Gerar valores aleatorios de 0 a 9 automaticamente
		for(int l = 0; l < table.length; l++) {
			for(int c = 0; c < table[l].length; c++) {
				table[l][c] = rand.nextInt(10);
				sum += table[l][c];
				if(l == c)
					mainDiagonal += table[l][c];
			}
		}
		
		System.out.println("\nMatriz : ");
		for(int l = 0; l < table.length; l++) {
			for(int c = 0; c < table[l].length; c++) {
				System.out.print(table[l][c] + " | " );
			}
			System.out.println();
		}
		
		System.out.println("Soma dos elementos da Matriz: " + sum);
		System.out.println("Soma da diagonal principal: " + mainDiagonal);
		
	}
}
