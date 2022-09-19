package ddd;

public class ExemploInterface {

	public static void main(String[] args) {
		ModeloTV001 tv1 = new ModeloTV001(50);
		ModeloTV002 tv2 = new ModeloTV002(70);
		
		System.out.println("Status tv1:" + (tv1.isLigado()? "LIGADA" : "DESLIGADA"));
		tv1.ligar();
		System.out.println("Status tv1:" + (tv1.isLigado()? "LIGADA" : "DESLIGADA"));
		
		System.out.println("Status tv2:" + (tv2.isLigado()? "LIGADA" : "DESLIGADA"));
		tv2.ligar();
		System.out.println("Status tv2:" + (tv2.isLigado()? "LIGADA" : "DESLIGADA"));

		
	}

}
