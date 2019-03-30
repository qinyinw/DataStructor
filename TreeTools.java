package data_structor;
import java.util.ArrayList;  
import java.util.LinkedList;  
import java.util.List;  
import java.util.Queue;  
  
/** 
 * TreeTools:���Ĳ����� 
 *  
 * @author xuejupo jpxue@travelsky.com 
 *  
 *         create in 2015-11-19 ����5:31:05 
 *  
 */  
public class TreeTools {  
  
    /** 
     * getTreeNum: �ж����нڵ���� 
     *  
     * @param root 
     *            ���ڵ� 
     * @return int �������� 
     */  
    public static <T> int getTreeNum(TreeNode<T> root) {  
        if (root == null) {  
            return 0;  
        }  
        return getTreeNum(root.leftChild) + getTreeNum(root.rightChild) + 1;  
    }  
  
    /** 
     * getTreeDepth: �ж�������� 
     *  
     * @param root 
     *            ���ڵ� 
     * @return int �������� 
     */  
    public static <T> int getTreeDepth(TreeNode<T> root) {  
        if (root == null) {  
            return 0;  
        }  
        int leftDepth = getTreeDepth(root.leftChild) + 1;  
        int rightDepth = getTreeDepth(root.rightChild) + 1;  
        return Math.max(leftDepth, rightDepth);  
    }  
  
    /** 
     * preOrderTravel: ǰ����� 
     *  
     * @param root 
     *            void �������� 
     */  
    public static <T> void preOrderTravel(TreeNode<T> root) {  
        if (root == null) {  
            return;  
        }  
        visitNode(root);  
        preOrderTravel(root.leftChild);  
        preOrderTravel(root.rightChild);  
    }  
  
    /** 
     * midOrderTravel: ������� 
     *  
     * @param root 
     *            void �������� 
     */  
    public static <T> void midOrderTravel(TreeNode<T> root) {  
        if (root == null) {  
            return;  
        }  
        midOrderTravel(root.leftChild);  
        visitNode(root);  
        midOrderTravel(root.rightChild);  
    }  
  
    /** 
     * backOrderTravel: ������� 
     *  
     * @param root 
     *            void �������� 
     */  
    public static <T> void backOrderTravel(TreeNode<T> root) {  
        if (root == null) {  
            return;  
        }  
        backOrderTravel(root.leftChild);  
        backOrderTravel(root.rightChild);  
        visitNode(root);  
    }  
  
    /** 
     * visitNode: ����node�ڵ� 
     *  
     * @param node 
     *            void �������� 
     */  
    private static <T> void visitNode(TreeNode<T> node) {  
        System.out.print(node.value + "\t");  
    }  
  
    /** 
     * levelTravel: �ֲ���� 
     *  
     * @param root 
     *            void �������� 
     */  
    public static <T> void levelTravel(TreeNode<T> root) {  
        Queue<TreeNode<T>> q = new LinkedList<TreeNode<T>>();  
        q.offer(root);  
        while (!q.isEmpty()) {  
            TreeNode<T> temp = q.poll();  
            visitNode(temp);  
            if (temp.leftChild != null) {  
                q.offer(temp.leftChild);  
            }  
            if (temp.rightChild != null) {  
                q.offer(temp.rightChild);  
            }  
        }  
    }  
  
    /** 
     * getNumForKlevel: ���K��ڵ���� 
     *  
     * @param root 
     * @param k 
     * @return int �������� 
     */  
    public static <T> int getNumForKlevel(TreeNode<T> root, int k) {  
        if (root == null || k < 1) {  
            return 0;  
        }  
        if (k == 1) {  
            return 1;  
        }  
        int leftNum = getNumForKlevel(root.leftChild, k - 1);  
        int rightNum = getNumForKlevel(root.rightChild, k - 1);  
        return leftNum + rightNum;  
    }  
  
    /** 
     * getLeafNum: ���������Ҷ�ӽڵ�ĸ��� 
     *  
     * @param root 
     * @return int �������� 
     */  
    public static <T> int getLeafNum(TreeNode<T> root) {  
        if (root == null) {  
            return 0;  
        }  
        if (root.leftChild == null && root.rightChild == null) {  
            return 1;  
        }  
        int leftNum = getLeafNum(root.leftChild);  
        int rightNum = getLeafNum(root.rightChild);  
        return leftNum + rightNum;  
    }  
  
    /** 
     * exchange: �������ڵ���������� 
     *  
     * @param root 
     * @return TreeNode �������� 
     */  
    public static <T> TreeNode<T> exchange(TreeNode<T> root) {  
        if (root == null) {  
            return null;  
        }  
        TreeNode<T> left = exchange(root.leftChild);  
        TreeNode<T> right = exchange(root.rightChild);  
        root.leftChild = right;  
        root.rightChild = left;  
        return root;  
    }  
  
    /** 
     * nodeIsChild: �鿴node�Ƿ���root���ӽڵ� 
     *  
     * @param root 
     * @param node 
     * @return boolean �������� 
     */  
    public static <T> boolean nodeIsChild(TreeNode<T> root, TreeNode<T> node) {  
        if (root == null || node == null) {  
            return false;  
        }  
        if (root == node) {  
            return true;  
        }  
        boolean isFind = nodeIsChild(root.leftChild, node);  
        if (!isFind) {  
            isFind = nodeIsChild(root.rightChild, node);  
        }  
        return isFind;  
    }  
  
    /** 
     * findAllFatherNode: ���������ڵ�lnode��rnode����rootΪ���ڵ�Ĺ������ڵ� 
     *  
     * @param root 
     *            ���ڵ� 
     * @param lNode 
     * @param rNode 
     * @return TreeNode �������� 
     */  
    public static <T> TreeNode<T> findAllFatherNode(TreeNode<T> root,  
            TreeNode<T> lNode, TreeNode<T> rNode) {  
        if (lNode == root || rNode == root) {  
            return root;  
        }  
        if (root == null || lNode == null || rNode == null) {  
            return null;  
        }  
        // ���lNode���������Ľڵ�  
        if (nodeIsChild(root.leftChild, lNode)) {  
            if (nodeIsChild(root.rightChild, rNode)) {  
                return root;  
            } else {  
                return findAllFatherNode(root.leftChild, lNode, rNode);  
            }  
        } else {  
            if (nodeIsChild(root.leftChild, rNode)) {  
                return root;  
            } else {  
                return findAllFatherNode(root.rightChild, lNode, rNode);  
            }  
        }  
    }  
  
    /** 
     * getTreeFromPreAndMid: ����ǰ������򹹽������� 
     *  
     * @param pre 
     *            ǰ������ 
     * @param mid 
     *            �������� 
     * @return TreeNode �������� 
     */  
    public static <T> TreeNode<T> getTreeFromPreAndMid(List<T> pre, List<T> mid) {  
        if (pre == null || mid == null || pre.size() == 0 || mid.size() == 0) {  
            return null;  
        }  
        if (pre.size() == 1) {  
            return new TreeNode<T>(pre.get(0));  
        }  
        TreeNode<T> root = new TreeNode<T>(pre.get(0));  
        // �ҳ����ڵ��������е�λ��  
        int index = 0;  
        while (!mid.get(index++).equals(pre.get(0))) {  
        }  
        // ������������ǰ��  
        List<T> preLeft = new ArrayList<T>(index);  
        // ������������  
        List<T> midLeft = new ArrayList<T>(index);  
        for (int i = 1; i < index; i++) {  
            preLeft.add(pre.get(i));  
        }  
        for (int i = 0; i < index - 1; i++) {  
            midLeft.add(mid.get(i));  
        }  
  
        // �ؽ�������  
        root.leftChild = getTreeFromPreAndMid(preLeft, midLeft);  
        // ��������ǰ��  
        List<T> preRight = new ArrayList<T>(pre.size() - index - 1);  
        // ������������  
        List<T> midRight = new ArrayList<T>(pre.size() - index - 1);  
        for (int i = 0; i <= pre.size() - index - 1; i++) {  
            preRight.add(pre.get(index + i));  
        }  
        for (int i = 0; i <= pre.size() - index - 1; i++) {  
            midRight.add(mid.get(index + i));  
        }  
        // �ؽ�������  
        root.rightChild = getTreeFromPreAndMid(preRight, midRight);  
        return root;  
    }  
  
    /** 
     * equals: �鿴node1��node2�������Ƿ����(���������нڵ㶼���) 
     *  
     * @param node1 
     *            node2 �����ڵ� 
     * @return boolean �������� 
     */  
    public static <T> boolean equals(TreeNode<T> node1, TreeNode<T> node2) {  
        // TODO Auto-generated method stub  
        if (node1 == null && node2 == null) {  
            return true;  
        } else if (node1 == null || node2 == null) {  
            return false;  
        }  
        boolean isEqual = node1.value.equals(node2.value);  
        boolean isLeftEqual = equals(node1.leftChild, node2.leftChild);  
        boolean isRightEqual = equals(node1.rightChild, node2.rightChild);  
        return isEqual && isLeftEqual && isRightEqual;  
    }  
}
