package ddd;

public class TesteException {
	
	public static void main(String[] args) throws VerificaLetraException{
		VerificaException ve = new VerificaException("FIAP");
		ve.verificaException();
	}

}