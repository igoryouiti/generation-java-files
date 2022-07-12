package br.com.generation;

import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
				a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
				das matrizes N1 e N2;
				b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
				posição das matrizes N1 e N2.
		 */
		
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		
		//Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
		
		/*
		// Entrada manual
		System.out.println("Digite um valor inteiro para a matriz n1");
		for(int l = 0; l < n1.length; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				n1[l][c] = input.nextInt();
			}
		}
		
		System.out.println("Digite um valor inteiro maior que 0 para a matriz n2");
		for(int l = 0; l < n2.length; l++) {
			for(int c = 0; c < n2[l].length; c++) {
				n2[l][c] = input.nextInt();
			}
		}
		*/
		
		
		// Gerar valores aleatorios de 1 a 10 automaticamente
		for(int l = 0; l < n2.length; l++) {
			for(int c = 0; c < n2[l].length; c++) {
				n1[l][c] = rand.nextInt(9) + 1;
			}
		}
		
		for(int l = 0; l < n2.length; l++) {
			for(int c = 0; c < n2[l].length; c++) {
				n2[l][c] = rand.nextInt(9) + 1;
			}
		}
		
		
		
		for(int l = 0; l < n2.length; l++) {
			for(int c = 0; c < n2[l].length; c++) {
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] % n2[l][c];
			}
		}
		
		
		System.out.println("\nMatriz M1: ");
		for(int l = 0; l < m1.length; l++) {
			for(int c = 0; c < m1[l].length; c++) {
				System.out.print(m1[l][c] + " | " );
			}
			System.out.println();
		}
		
		System.out.println("\nMatriz M2: ");
		for(int l = 0; l < m2.length; l++) {
			for(int c = 0; c < m2[l].length; c++) {
				System.out.print(m2[l][c] + " | " );
			}
			System.out.println();
		}
		

	}

}
