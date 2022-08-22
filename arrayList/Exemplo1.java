package arrayList;

import java.util.ArrayList;

public class Exemplo1 {
	
public static void main(String[] args) {
		
		//criando um ArrayList
		ArrayList<String> carros = new ArrayList<String>();

		//Adicionar elementos no ArrayList - método add()
		carros.add("BMW");
		carros.add("Volvo");
		carros.add("Mercedes");
		carros.add("Ferrari");
		carros.add("Ford");
		carros.add("FIAT");
		
		//Imprimindo todos os elementos da Lista
		System.out.println(carros);
		
		//Acessando um elemento do ArrayList - método get()
		System.out.println("Carro: " + carros.get(0));
		
		//Alterando um elemento do ArrayList - set()
		carros.set(4,"Jaguar");
		System.out.println(carros);
		carros.set(5, "Jeep");
		System.out.println(carros);
		
		//Removendo um elemento do ArrayList - remove()
		carros.remove(0);
		System.out.println(carros);
		
		//Apagando todos os elementos do ArrayList - clear()
		carros.clear();
		System.out.println(carros);
		
		//------------------------------------
		carros.add("BMW");
		carros.add("Volvo");
		carros.add("Mercedes");
		carros.add("Ferrari");
		carros.add("Ford");
		carros.add("FIAT");
		
		//Obtendo o tamanho do ArrayList - size()
		System.out.println("Tamanho: " + carros.size());
		
		//Percorrendo um ArrayList()
		for(int i=0; i < carros.size(); i++) {
			System.out.println("--------------");
			System.out.printf("%d - %s\n", i+1, carros.get(i));
			System.out.println("--------------");
		}
		
		//Percorredno um ArrayList com for each (para cada elemento da lista faça)
		int cont = 1;
		for(String i: carros){
			System.out.printf("%d - %s \n", cont, i);
			cont++;
		}
		
		
	}
}

