package data_structor;

import java.util.Scanner;

public class btree {
    private btree left,right;
    private char data;
    public btree creat(String des){
        Scanner scanner=new Scanner(System.in);
        System.out.println("des:"+des);
        String str=scanner.next();
        if(str.charAt(0)<'a')return null;
        btree root=new btree();
        root.data=str.charAt(0);
        root.left=creat(str.charAt(0)+"������");
        root.right=creat(str.charAt(0)+"������");
        return root;
    }
    public void midprint(btree btree){
//        �������
        if(btree!=null){
            midprint(btree.left);
            System.out.print(btree.data+"  ");
            midprint(btree.right);
        }
    }
    public void firprint(btree btree){
//        �������
        if(btree!=null){
            System.out.print(btree.data+" ");
            firprint(btree.left);
            firprint(btree.right);
        }
    }
    public void lastprint(btree btree){
//        �������
        if(btree!=null){
            lastprint(btree.left);
            lastprint(btree.right);
            System.out.print(btree.data+"  ");
        }
    }
    public static void main(String[] args) {
        btree tree = new btree();
        btree newtree=tree.creat("���ڵ�");
        tree.firprint(newtree);
        System.out.println();
        tree.midprint(newtree);
        System.out.println();
        tree.lastprint(newtree);
    }
}

