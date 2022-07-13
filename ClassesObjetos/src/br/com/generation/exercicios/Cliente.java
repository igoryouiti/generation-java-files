package br.com.generation.exercicios;

public class Cliente {
	
	/*
	 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
	 *	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	 *	objeto e apresente as informações deste objeto no console.
	 */
	
	private String id;
	private String name;
	private int age;
	private String sex;
	private String cpf;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
}
