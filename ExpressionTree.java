package data_structor;
import java.util.*;
public class ExpressionTree extends LinkedBinaryTree<ExpressionTreeOp>{
	/*public ExpressionTree() {
		super();
	}
	public ExpressionTree(ExpressionTreeOp element,ExpressionTree leftSubtree,ExpressionTree rightSubtree) {
		root=new BinaryTreeNode<ExpressionTreeOp>(element,leftSubtree,rightSubtree);
	}
	public int evaluateTree() {
		return evaluateNode(root);
	}
	private int evaluateNode(BinaryTreeNode<ExpressionTreeOp> root) {
		// TODO Auto-generated method stub
		//?????????此处类型要不要加上 书上没加
		int result,operand1,operand2;
		ExpressionTreeOp temp;
		if(root==null)
			result=0;
		else
		{
			temp=(ExpressionTreeOp)root.getElement();
			if(temp.isOperator()) {
				operand1=evaluateNode(root.getLeft());
				operand2=evaluateNode(root.getRight());
				result=computeTerm(temp.getOperator(),operand1,operand2);
			}
			else
				result=temp.getValue();
		}
		return result;
	}
	private static int computeTerm(char operator, int operand1, int operand2) {
		// TODO Auto-generated method stub
		int result=0;
		if(operator=='+')
			result=operand1+operand2;
		else if (operator=='-')
			result=operand1-operand2;
		else if(operator=='*')
			result=operand1*operand2;
		else {
			result=operand1/operand2;
		}
		return result;
	}
	public String printTree() {
		UnorderedListADT<BinaryTreeNode<ExpressionTreeOp>> nodes=new 
	}*/
}
