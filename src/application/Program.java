package application;

import entities.Clients;

public class Program {

	public static void main(String[] args) {
		// EQUALS E UM METODO QUE COMPARA SE O OBJETO E IGUAL AO OUTRO

		Clients c1 = new Clients("Rafael", "rafaelvpds@gmail.com");
		Clients c2 = new Clients("Rafael", "rafael.dev@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

		System.out.println(c1.equals(c2));

	}

}
