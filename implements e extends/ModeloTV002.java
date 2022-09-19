package ddd;

public class ModeloTV002 extends TV implements ControleRemoto {
	private final String MODELO = "TV002";
	
	public ModeloTV002(int tamanho){
		super(tamanho);
	}
	
	public void ligar(){
		this.setLigado(true);
	}
	
	public void desligar(){
		this.setLigado(false);
	}
	
	public void aumentarVolume(int volume){
		this.setVolume(volume);
	}
	
	public void diminuirVolume(int volume){
		this.setVolume(volume);
	}
	
	public void mudarCanal(int canal){
		this.setCanal(canal);
	}
}