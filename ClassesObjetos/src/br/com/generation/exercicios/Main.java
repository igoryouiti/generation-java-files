package br.com.generation.exercicios;

public class Main {

	public static void main(String[] args) {
		// Criar 2 classes, estanciar, atribuir valores e mostrar
		
		Cliente cliente = new Cliente();
		
		cliente.setId("564a5sda5fa84a");
		cliente.setName("Jhon");
		cliente.setAge(45);
		cliente.setSex("Masculino");
		cliente.setCpf("231.033.350-67");
		
		System.out.println("Dados do Cliente: ");
		System.out.println("Nome: " + cliente.getName());
		System.out.println("ID: " + cliente.getId());
		System.out.println("Idade: " + cliente.getAge());
		System.out.println("Sexo: " + cliente.getSex());
		System.out.println("CPF: " + cliente.getCpf());
		
		System.out.println("\n-----------------------------\n");
		
		
		Patinete patinete = new Patinete();

		patinete.setName("Patinetera");
		patinete.setMaterial("aço");
		patinete.setBrand("Caloi");
		patinete.setWeight(5.0);
		patinete.setWheels(2);
		
		System.out.println("Dados do Patinete: ");
		System.out.println("Nome: " + patinete.getName());
		System.out.println("Material: " + patinete.getMaterial());
		System.out.println("Marca: " + patinete.getBrand());
		System.out.println("Peso: " + patinete.getWeight() + "kg");
		System.out.println("Numero de rodas: " + patinete.getWheels());
	}

}
