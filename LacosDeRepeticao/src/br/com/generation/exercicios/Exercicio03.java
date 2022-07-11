package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 *	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 *	idade for =-99. (WHILE)
		 */
		
		
		int age = 0;
		int minor21 = 0;
		int plus50 = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(age != -99) {
			System.out.println("Digite a sua idade ou -99 para terminar: ");
			age = input.nextInt();
			
			if(age < 21 && age >= 0)
				minor21++;
			else if(age > 50)
				plus50++;
		}
		
		
		System.out.println("Quantidade de pessoas com menos de 21 anos: " + minor21);
		System.out.println("Quantidade de pessoas com mais de 50 anos: " + plus50);
		
	}

}
