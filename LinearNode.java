package data_structor;
public class LinearNode<T> {
	private LinearNode<T> next;
	private T element;
	String str=new String("abel");
	public LinearNode() {
		next=null;
		element=null;
	}
	public LinearNode(T elem) {
		next=null;
		element=elem;
	}
	public LinearNode<T> getNext(){
		return next;
	}
	public void setNext(LinearNode<T> node) {
		next=node;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T elem) {
		element=elem;
	}
}
