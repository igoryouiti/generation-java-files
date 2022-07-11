package br.com.generation.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/*
		 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		 *	obtemos resto = 5. (FOR)
		 */
		
		for(int i = 1000; i <= 1999; i++) {
			if(i%11 == 5)
				System.out.println(i + " tem resto de 5 se dividido por 11.");
		}

	}

}
