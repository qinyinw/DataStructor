package data_structor;
/**   
* TreeNode: ��ͨ�����ڵ� 
* @author wjx  jpxue@travelsky.com  
* create in 2015-11-19 ����5:30:31   
*     
*/  
public class TreeNode<T> {  
    T value;  
          
    TreeNode<T> leftChild;  
    TreeNode<T> rightChild;  
  
    TreeNode(T value) {  
        this.value = value;  
    }  
    TreeNode() {  
    }  
      
    /**   �������ӽڵ� 
    * addLeft:  
    * @param value  
    * void  ��������    
    */  
    public void addLeft(T value){  
        TreeNode<T> leftChild = new TreeNode<T>(value);  
        this.leftChild = leftChild;  
    }  
    /**   
    * addRight: �������ӽڵ� 
    * @param value  
    * void  ��������    
    */  
    public void addRight(T value){  
        TreeNode<T> rightChild = new TreeNode<T>(value);  
        this.rightChild = rightChild;  
    }  
    /* (non-Javadoc) 
     * @see java.lang.Object#equals(java.lang.Object) 
     * ����equal���� 
     */  
    @Override  
    public boolean equals(Object obj) {  
        // TODO Auto-generated method stub  
        if(!(obj instanceof TreeNode)){  
            return false;  
        }  
        return this.value.equals(((TreeNode<?>)obj).value);  
    }  
    /* (non-Javadoc) 
     * @see java.lang.Object#hashCode() 
     * ����hashCode���� 
     */  
    @Override  
    public int hashCode() {  
        // TODO Auto-generated method stub  
        return this.value.hashCode();  
    }  
    @Override  
    public String toString(){  
        return this.value==null?"":this.value.toString();  
    }  
      
      
}