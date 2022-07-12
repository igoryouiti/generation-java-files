package br.com.generation;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
			que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
			imprima a média aritmética dos lançamentos, contabilize e apresente também
			quantas foram as ocorrências da maior pontuação.
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
		
		System.out.println("\nA média aritmetica dos lancamentos é: " + average);
		
		System.out.println("O maior numero jogado foi: " + bigger);
		System.out.println("O maior numero teve a ocorrencia de: " + occurrenceBigger);
	}

}
