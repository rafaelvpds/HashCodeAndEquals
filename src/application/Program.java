package application;

public class Program {

	public static void main(String[] args) {
		// EQUALS E UM METODO QUE COMPARA SE O OBJETO E IGUAL AO OUTRO

		String a = "Maria";

		String b = "Alex";

		// String a nao e igual a B
		System.out.println(a.equals(b));

		// HashCode e um metodos que retorna um numero inteiro representando um codigo
		// gerado a partir das informações dos objetos
		String c = "Maria";

		String d = "Alex";

		// String a nao e igual a B
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());

	}

}
