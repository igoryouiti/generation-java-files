package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
		 *	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		 *	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		 *	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		 *	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		 *	pessoas, calcule e mostre: (WHILE)
		 *	 o número de pessoas calmas;
		 *	 o número de mulheres nervosas;
		 *	 o número de homens agressivos;
		 *	 o número de outros calmos;
		 *	 o número de pessoas nervosas com mais de 40 anos;
		 *	 o número de pessoas calmas com menos de 18 anos.
		*/
		
		int age, sex, behavior;
		int calmPeople = 0;
		int nervousWomen = 0;
		int agressiveMen = 0;
		int calmOthers = 0;
		int nervousPlusForty = 0;
		int calmLessEighteen = 0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(count <= 150) {
			
			System.out.println("Digite a idade da pessoa: ");
			age = input.nextInt();
			
			do {
				System.out.println("Digite uma opção válida para sexo: ");
				System.out.println("1 - Feminino");
				System.out.println("2 - Masculino");
				System.out.println("3 - Outres");
				sex = input.nextInt();
			}while(sex < 1 || sex >3);
			
			do {
				System.out.println("Digite uma opção válida para comportamento: ");
				System.out.println("1 - Calme");
				System.out.println("2 - Nervose");
				System.out.println("3 - Agressive");
				behavior = input.nextInt();
			}while(behavior < 1 || behavior >3);
			
			if(behavior == 1) 
				calmPeople++;
			if(sex == 1 && behavior == 2)
				nervousWomen++;
			if(sex == 2 && behavior == 3)
				agressiveMen++;
			if(sex == 3 && behavior == 1)
				calmOthers++;
			if(age > 40 && behavior == 2)
				nervousPlusForty++;
			if(age < 21 && behavior == 1)
				calmLessEighteen++;
			
			count++;
		}
		
		System.out.println("\nO numero de pessoas calmes: " + calmPeople);
		System.out.println("O numero de mulheres nervoses: " + nervousWomen);
		System.out.println("O numero de homens agressives: " + agressiveMen);
		System.out.println("O numero de outres calmos: " + calmOthers);
		System.out.println("O numero de pessoas com mais de 40 anos e nervoses: " + nervousPlusForty);
		System.out.println("O numero de pessoas com menos de 18 anos e calmes: " + calmLessEighteen);

		input.close();

	}

}
