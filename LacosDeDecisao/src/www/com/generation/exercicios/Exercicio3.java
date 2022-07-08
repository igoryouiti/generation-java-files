package www.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*
		 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		 *	  categoria ela se encontra:
		 *	 	10-14 infantil
		 *	 	15-17 juvenil
		 *	 	18-25 adulto
		 */
		
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		age = input.nextInt();
		
		input.close();
		
		if(age < 10 || age > 25){
			System.out.println("Não definido pelo sistema");
		} else if (age >= 10 && age <= 14) {
			System.out.println("Infantil, idade: " + age);
			
		}else if (age >= 15 && age <= 17) {
			System.out.println("Juvenil, idade: " + age);
		} else {
			System.out.println("Adulto, idade: " + age);
		}
	}
}
