package ddd;

public class VerificaException {
	private String texto;
	
	public VerificaException(String t){
		texto = t;
	}
	
	public void verificaException() throws VerificaLetraException{
		if(!texto.contains("F") && texto.contains("f")){
			throw new VerificaLetraException();
		}else{
			System.out.println("Letra encontrada!");
		}
	}
}