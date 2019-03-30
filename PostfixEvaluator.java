package data_structor;

import java.util.Stack;
import java.util.Scanner;

public class PostfixEvaluator {
	private final static char ADD = '+';
	private final static char SUBSTRACT = '-';
	private final static char MULTIPLY = '*';
	private final static char DIVIDE = '/';
	private LinkedStack stack;

	public PostfixEvaluator() {
		stack=new LinkedStack<Integer>();
		//stack = new ArrayStack<Integer>();
	}

	public int evaluate(String expr) throws CalculationOfPostfixException{
		int op1, op2, result = 0;
		String token;
		Scanner parser = new Scanner(expr);
		while (parser.hasNext()) {
			token = parser.next();
			if (isOperator(token)) {
				/*op2 = (stack.pop()).intValue();
				op1 = (stack.pop()).intValue();*/
				op2=(int) stack.pop();
				op1=(int) stack.pop();
				result = evaluateSingleOperator(token.charAt(0), op1, op2);
				stack.push(new Integer(result));
			} else
				stack.push(new Integer(Integer.parseInt(token)));
		}
		if (!stack.isEmpty())
			throw new CalculationOfPostfixException("Postfix");
		return result;
	}

	private boolean isOperator(String token) {
		return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
	}

	private int evaluateSingleOperator(char operation, int op1, int op2) {
		int result = 0;
		switch (operation) {
		case ADD:
			result = op1 + op2;
			break;
		case SUBSTRACT:
			result = op1 - op2;
			break;
		case MULTIPLY:
			result = op1 + op2;
			break;
		case DIVIDE:
			result = op1 / op2;
			break;
		}
		return result;
	}
}
