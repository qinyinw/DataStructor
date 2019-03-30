package data_structor;

import java.util.Scanner;

public class PostfixTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression, again;
		int result;
		Scanner in = new Scanner(System.in);
		do {
			PostfixEvaluator evaluator = new PostfixEvaluator();
			System.out.println("Enter a valid post-fix expression one token"
					+ "at a time with a space between each token(e.g 5 4 + 3 2 1 - + *)");
			expression = in.nextLine();
			result = evaluator.evaluate(expression);
			System.out.println();
			System.out.println("that ecpression equals" + result);
			System.out.println("Evaluate another expresssion[Y/N]?");
			again = in.nextLine();
			System.out.println();
		} while (again.equalsIgnoreCase("y"));
	}

}
