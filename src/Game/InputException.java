package Game;

public class InputException extends RuntimeException{
	
	String message="Hatal� tu�lama yapt�n�z";
	public InputException(String message)
	{
		super(message);
	}
	

}
