package data_structor;
import java.util.*;
public class LinkedBinaryTree<T> implements BinaryTreeADT<T>,Iterable<T> {
	protected BinaryTreeNode<T> root;
	protected int modCount;
	public  LinkedBinaryTree() {
		// TODO Auto-generated constructor stub
		root=null;
	}
	public LinkedBinaryTree(T element) {
		root=new BinaryTreeNode<T>(element);
	}
	public LinkedBinaryTree(T element,LinkedBinaryTree<T> left,LinkedBinaryTree<T> right) {
		root=new BinaryTreeNode<T>(element);
		root.setLeft(left.root);
		root.setRight(right.root);
	}
	@Override
	public T getRootElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(T targetElement) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T find(T targetElement) throws ElementNotFoundException{
		// TODO Auto-generated method stub
		BinaryTreeNode<T> current=findAgain(targetElement,root);
		if(current==null)
			throw new ElementNotFoundException("binary tree");
		return (current.element);
	}

	private BinaryTreeNode<T> findAgain(T targetElement, BinaryTreeNode<T> next) {
		// TODO Auto-generated method stub
		if(next==null)
			return null;
		if (next.element.equals(targetElement))
			return next;
		BinaryTreeNode<T> temp=findAgain(targetElement, next.left);
		if(temp==null)
			temp=findAgain(targetElement, next.right);
		return temp;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> iteratorInOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> iteratorPreOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> iteratorPostOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<T> iteratorLevelOrder() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
