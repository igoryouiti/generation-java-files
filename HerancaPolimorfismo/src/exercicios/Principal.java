package exercicios;

public class Principal {

	public static void main(String[] args) {

		/*
		 * 1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
		 *	comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
		 *	caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe
		 *	Animal:	Animal, Cachorro, Cavalo, Preguica
		 *
		 *2-
		 *
		 *	Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
		 *	anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
		 *	�, independente do tipo de animal.
		 */
		
		TesteAnimal  t = new TesteAnimal();
		
		Animal cachorro = new Cachorro();
		Animal cavalo = new Cavalo();
		Animal preguica = new Preguica();
		
		
		t.fazerAnimalBarulho(cachorro);
		t.fazerAnimalBarulho(cavalo);
		t.fazerAnimalBarulho(preguica);
		
		


	}

}
