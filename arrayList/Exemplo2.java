package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exemplo2 {

	public static void main(String[] args) {
		// Criando um ArrayList de outros tipos (Integer)
		// wrapper class
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(7);
		numeros.add(-3);
		numeros.add(200);

		System.out.println("---------------");
		System.out.println(numeros);

		for (int i : numeros) {
			System.out.println(i);
		}
		System.out.println("-----------------------");
		for (int i = 0; i < numeros.size(); i++) {
			System.out.printf("%d: %d\n", i + 1, numeros.get(i));
		}
		System.out.println("============");
		System.out.println("Ordenando a lista...");
		Collections.sort(numeros);
		System.out.println(numeros);

		System.out.println("=================");
		ArrayList listaHet = new ArrayList();
		listaHet.add(10);// integer
		listaHet.add(true);// boolean
		listaHet.add("FIAP");// String
		System.out.println(listaHet);

		if (listaHet.isEmpty()) {
			System.out.println("Lista vazia");
		} else {
			System.out.println(listaHet);
		}
	}

}