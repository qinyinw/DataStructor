package data_structor;

public class ElementNotFoundException extends RuntimeException{
	public ElementNotFoundException(String collection) {
		super("the "+collection+"is NOT found");
	}
}
