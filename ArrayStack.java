package data_structor;

import java.util.Arrays;

public class ArrayStack<T> implements StackADT<T> {
	private final int DEFAULT_CAPACITY = 100;
	private int top;
	private T[] stack;

	public ArrayStack() {
		// TODO Auto-generated constructor stub
		top = 0;
		stack = (T[]) (new Object[DEFAULT_CAPACITY]);
	}

	public ArrayStack(int initialCapacity) {
		top = 0;
		stack = (T[]) (new Object[initialCapacity]);
	}

	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		if (size() == stack.length) {
			expandCapacity();
		}
		stack[top] = element;
		top++;
	}

	private void expandCapacity() {
		// TODO Auto-generated method stub
		stack = Arrays.copyOf(stack, stack.length * 2);
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (isEmpty())
			throw new EmptyCollectionException("Stack");
		top--;
		T result=stack[top];
		stack[top]=null;
		return result;
	}

	@Override
	public T peek() throws EmptyCollectionException{
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new EmptyCollectionException("stack");
		return stack[top-1];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean a;
		if (top==0)
			a=true;
		else
			a=false;
		return a;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top;
	}

}
