package data_structor;
public class LinkedBinarySearchTree<T> extends LinkedBinaryTree<T> {
	public LinkedBinarySearchTree() {
		super();
	}
	public LinkedBinarySearchTree(T element) throws NonCompaarableElementException {
		super(element);
		if (!(element instanceof Comparable))
			throw new NonCompaarableElementException("LinkedbinarySearchTree");
	}
	public void addElement(T element) throws NonCompaarableElementException {
		if(!(element instanceof Comparable))
			throw new NonCompaarableElementException("Linkedbinarytree");
		Comparable<T> comparableElement=(Comparable<T>)element;
		if(isEmpty())
			root=new BinaryTreeNode<T>(element);
		else {
			if(comparableElement.compareTo(root.getElement())<0)
			{
				if (root.getLeft()==null)
					this.root.setLeft(new BinaryTreeNode<T>(element));
				else
					addElement(element,root.getLeft());
			}
			else {
				if(root.getRight()==null)
					this.root.setRight(new BinaryTreeNode<T>(element));
				else
					addElement(element,root.getRight());
			}
		}
		modCount++;
	}
	private void addElement(T element, BinaryTreeNode<T> node) {
		// TODO Auto-generated method stub
		Comparable<T> comparableElement=(Comparable<T>) element;
		if(comparableElement.compareTo(node.getElement())<0)
		{
			if (node.getLeft()==null)
				node.setLeft(new BinaryTreeNode<T>(element));
			else
				addElement(element,node.getLeft());
		}
		else {
			if(node.getRight()==null)
				node.setRight(new BinaryTreeNode<T>(element));
			else
				addElement(element,node.getRight());
		}
		
	}
	public T removeElement(T targetElement) throws ElementNotFoundException{
		T result=null;
		if(isEmpty())
			throw new ElementNotFoundException("LinkedBinarySearch");
		else {
			BinaryTreeNode<T> parent=null;
			if(((Comparable <T>) targetElement).equals(root.element)) {
				result=root.element;
				BinaryTreeNode<T> temp=Replacements(root);
				if(temp==null)
					root=null;
				else {
					root.element=temp.element;
					root.setRight(temp.right);
					root.setLeft(temp.left);
				}
				modCount--;
			}
			else {
				parent=root;
				if(((Comparable<T>) targetElement).compareTo(root.element)<0)
					result=removeElement(targetElement,root.getLeft(),parent);
				else {
					result=removeElement(targetElement, root.getRight(), parent);
				}
			}
		}
		return result;
		
	}
	private T removeElement (T targetElement, BinaryTreeNode<T> node, BinaryTreeNode<T> parent) throws ElementNotFoundException{
		// TODO Auto-generated method stub
		T result=null;
		if(node==null)
			throw new ElementNotFoundException("LinkedBinarySearchTree");
		else {
			if (((Comparable<T>) targetElement).equals(node.element)) {
				result=node.element;
				BinaryTreeNode<T> temp=Replacements(node);
				if(parent.right==node)
					parent.right=temp;
				else
					parent.left=temp;
				modCount--;
			}
			else {
				parent=node;
				if(((Comparable<T>) targetElement).compareTo(node.element)<0)
					result=removeElement(targetElement,node.getLeft(),parent);
				else
					result=removeElement(targetElement,node.getRight(),parent);
			}
		}
		return result;
	}
	private BinaryTreeNode<T> Replacements(BinaryTreeNode<T> node) {
		// TODO Auto-generated method stub
		BinaryTreeNode<T> result=null;
		if((node.left==null)&&(node.right==null))
			result=null;
		else if((node.left!=null)&&node.right==null)
			result=node.left;
		else if((node.left==null)&&(node.right!=null))
			result=node.right;
		else {
			BinaryTreeNode<T> current=node.right;
			BinaryTreeNode<T> parent=node;
			while(current.left!=null) {
				parent=current;
				current=current.left;
			}
			current.left=node.left;
			if(node.right!=current) {
				parent.left=current.right;
				current.right=node.right;
			}
			result=current;
		}
		return result;
	}
}
