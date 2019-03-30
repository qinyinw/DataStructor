package data_structor;
public class LinkedQueue <T> implements QueueADT<T>{
	private int count;
	private LinearNode<T> head,tail;
	public  LinkedQueue() {
		// TODO Auto-generated constructor stub
		count=0;
		head=tail=null;
	}
	@Override
	public void enqueue(T element) {
		// TODO Auto-generated method stub
		LinearNode<T> node=new LinearNode<T>(element);
		if(isEmpty()) {
			head=node;
		}
		else
			tail.setNext(node);
		tail=node;
		count++;
	}

	@Override
	public T dequeue() throws EmptyCollectionException{
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new EmptyCollectionException("queue");
		T result=head.getElement();
		head=head.getNext();
		count--;
		if(isEmpty())
			tail=null;
		return result;
	}

	@Override
	public T first() throws EmptyCollectionException{
		// TODO Auto-generated method stub
		if (isEmpty())
			throw new EmptyCollectionException("queue");
		return head.getElement();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
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
