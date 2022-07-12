package br.com.generation;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
			que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
			imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
			quantas foram as ocorr�ncias da maior pontua��o.
		 */
		
		Random dice = new Random();
		
		int rows[] = new int[10];
		double sum = 0.0;
		double average;
		int bigger = 0;
		int occurrenceBigger = 0;
		
		for(int i = 0; i < rows.length; i++) {
			
			rows[i] = dice.nextInt(6) + 1;
			
			sum += rows[i];
			
			if(rows[i] > bigger) {
				bigger = rows[i];
				occurrenceBigger = 1;
			}else if(rows[i] == bigger)
				occurrenceBigger++;
			
		}
		
		average = sum/rows.length;
		
		System.out.println("Valor dos dados rolados: ");
		for(int i = 0; i < rows.length; i++) {
			System.out.print(rows[i] + " - ");
		}
		
		System.out.println("\nA m�dia aritmetica dos lancamentos �: " + average);
		
		System.out.println("O maior numero jogado foi: " + bigger);
		System.out.println("O maior numero teve a ocorrencia de: " + occurrenceBigger);
	}

}
