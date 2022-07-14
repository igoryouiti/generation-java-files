package exercicios;

public abstract class Animal implements IntefaceAnimal{
	String nome;
	int idade;
	
	@Override
	public void emitirSom() {
		System.out.println("Som de Animal...");
	}
}
