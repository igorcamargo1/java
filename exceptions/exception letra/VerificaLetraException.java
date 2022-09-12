package ddd;

public class VerificaLetraException extends Exception {
	
	@Override
	public String getMessage(){
		return "letra não encontrada!";
	}
}