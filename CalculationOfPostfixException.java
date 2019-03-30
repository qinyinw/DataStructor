package data_structor;

public class CalculationOfPostfixException extends RuntimeException{
	 public CalculationOfPostfixException(String collection) {
		// TODO Auto-generated constructor stub
		 super("Input Expression Of "+collection+"is error");
	}
}
