package data_structor;

public interface BinarySearchTreeADT<T> extends BinaryTreeADT<T>{
	public void addElement(T element);
	public T removeElement(T targetElement);
	public void removeAllOccurences(T targetelement);
	public T removeMin();
	public T removeMax();
	public T findMin();
	public T findMax();
	
}
