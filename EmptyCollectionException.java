package data_structor;

public class EmptyCollectionException extends RuntimeException{
	public EmptyCollectionException(String collection) {
		super("the "+collection+"is empty");
	}
}
