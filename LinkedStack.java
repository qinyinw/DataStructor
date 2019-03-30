package data_structor;
import java.util.ArrayList;
import java.util.List;
public class LinkedStack <T> implements StackADT<T>{
	private int count;
	private LinearNode<T> top;
	public  LinkedStack() {
		// TODO Auto-generated constructor stub
		count=0;
		top=null;
	}
	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		LinearNode<T> temp=new LinearNode<T>(element);
		temp.setNext(top);
		top=temp;
		count++;
	}

	@Override
	public T pop() throws EmptyCollectionException{
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new EmptyCollectionException("Stack");
		T result=top.getElement();
		top=top.getNext();
		count--;
		return result;
	}

	@Override
	public T peek() throws EmptyCollectionException{
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new EmptyCollectionException("Stack");
		return top.getElement();
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub\
		if (count>=0)
			return false;
		return true;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

}
