package www.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * 	2- Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		
		int number1, number2, number3;
		int biggestNumber, middleNumber, smallestNumber;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		number1 = input.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		number2 = input.nextInt();
		
		System.out.println("Digite o terceiro número inteiro: ");
		number3 = input.nextInt();
		
		input.close();
		
		System.out.println("\n");
		
		if((number1 > number2 && number1 > number3) || (number1 == number2 && number2 == number3)) {
			System.out.println("O maior numero digitado foi: " + number1);
			biggestNumber = number1;
		} else if(number2 > number3 || number2 == number3) {
			System.out.println("O maior numero digitado foi: " + number2);
			biggestNumber = number2;
		} else {
			System.out.println("O maior numero digitado foi: " + number3);
			biggestNumber = number3;
		}
		
		if((number1 < number2 && number1 < number3) || (number1 == number2 && number2 == number3)) {
			System.out.println("O menor numero digitado foi: " + number1);
			smallestNumber = number1;
		} else if(number2 < number3 || number2 == number3) {
			System.out.println("O menor numero digitado foi: " + number2);
			smallestNumber = number2;
		} else {
			System.out.println("O menor numero digitado foi: " + number3);
			smallestNumber = number3;
		}
		
		
		if((number1 < number2 && number1 > number3) || (number1 > number2 && number1 < number3) ||
			(number1 == number2 && number2 == number3)) {
			System.out.println("O numero do meio digitado foi: " + number1);
			middleNumber = number1;
		} else if((number2 < number3 && number2 > number1) || (number2 > number3 && number2 < number1) ||
				number2 == number3) {
			System.out.println("O numero do meio digitado foi: " + number2);
			middleNumber = number2;
		} else{
			System.out.println("O numero do meio digitado foi: " + number3);
			middleNumber = number3;
		}
		
		
		if(number1 < number2) {
			if(number2 < number3) {
				System.out.println("Numeros em ordem: " + number1 + " - " + number2 + " - " + number3);
			} else if(number1 < number3) {
				System.out.println("Numeros em ordem: " + number1 + " - " + number3 + " - " + number2);
			} else {
				System.out.println("Numeros em ordem: " + number3 + " - " + number1 + " - " + number2);
			}
		} else if(number2 < number3) {
			if(number1 < number3) {
				System.out.println("Numeros em ordem: " + number2 + " - " + number1 + " - " + number3);
			} else {
				System.out.println("Numeros em ordem: " + number2 + " - " + number3 + " - " + number1);
			}
			
		} else {
			System.out.println("Numeros em ordem: " + number3 + " - " + number2 + " - " + number1);
		}
		
	
		
		
	}

}
