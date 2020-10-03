package Game;

public class InputException extends RuntimeException{
	
	String message="Hatalý tuþlama yaptýnýz";
	public InputException(String message)
	{
		super(message);
	}
	

}
