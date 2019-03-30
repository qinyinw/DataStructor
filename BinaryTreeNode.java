   package data_structor;

public class BinaryTreeNode <T>{
	protected  T element;
	protected BinaryTreeNode<T> left,right;
	public BinaryTreeNode(T obj) {
		// TODO Auto-generated constructor stub
		element=obj;
		left=null;
		right=null;
	}
	public BinaryTreeNode(T obj,LinkedBinaryTree<T> left,LinkedBinaryTree<T> right) {
		element=obj;
		if(left==null)
			this.left=null;
		else
			this.left=left.root;
		if(right==null)
			this.left=null;
		else
			this.left=right.root;
	}
	public int numChildren() {
		int children=0;
		if(left!=null)
			children=1+left.numChildren();
		if(right!=null)
			children=children+1+right.numChildren();
		return children;
	}
	public T getElement() {
		return element;
	}
	public  BinaryTreeNode<T> getRight(){
		return right;
	}
	public BinaryTreeNode<T> getLeft(){
		return left;
	}
	public void setLeft(BinaryTreeNode<T> root) {
		// TODO Auto-generated method stub
		 left=root;
	}

	public void setRight(BinaryTreeNode<T> root) {
		// TODO Auto-generated method stub
		right=root;
	}
	
}
