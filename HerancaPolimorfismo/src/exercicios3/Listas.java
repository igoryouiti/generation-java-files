package exercicios3;

import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		/*
		 * 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		 *	trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		 *	programa deverá atender as seguintes funcionalidades:
		 *	Armazenar dados da List
		 *	Remover dados da list;
		 *	Atualizar dados da list.
		 *	Apresentar todos os dados da list.
		 */
		
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Geladeira", "Consul"));
		produtos.add(new Produto("Maquina de Lavar", "Dako"));
		produtos.add(new Produto("Forno Eletrico", "Wallita"));
		produtos.add(new Produto("Televisao", "Sony"));
		
		System.out.println("Produtos Cadastrados: ");
		for(Produto prod : produtos) {
			System.out.println(prod.getNome() + ": " + prod.getMarca());
		}
		
		System.out.println();
		
		
		for(int i = 0; i < produtos.size(); i++) {
			if(produtos.get(i).getNome().contentEquals("Geladeira"))
				produtos.remove(i);		
		}
		
		System.out.println("Produto Geladeira Removido: ");
		for(Produto prod : produtos) {
			System.out.println(prod.getNome() + ": " + prod.getMarca());
		}
		
		System.out.println();
		for(Produto prod : produtos) {
			if(prod.getMarca().contentEquals("Sony"))
				prod.setMarca("Positivo");
		}
		
		System.out.println("Produto Modificado");
		for(Produto prod : produtos) {
			System.out.println(prod.getNome() + ": " + prod.getMarca());
		}
		
	}

}
