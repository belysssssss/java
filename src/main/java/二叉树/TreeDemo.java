package 二叉树;

import java.util.Scanner;

public class TreeDemo {
    public static void main(String[] args) {
        TreeDemo treeDemo=new TreeDemo();
        TreeDemo newtree=treeDemo.create("根节点");
        treeDemo.preprint(newtree);
        System.out.println();
        treeDemo.inprint(newtree);
        System.out.println();
        treeDemo.afterprint(newtree);
        System.out.println();

    }
    private TreeDemo left,right;
    private char data;
    public TreeDemo create(String des){
        Scanner sc=new Scanner(System.in);
        System.out.println("des:"+des);
        String str=sc.next();
        if(str.charAt(0)<'a')
            return null;
        TreeDemo treeDemo=new TreeDemo();
        treeDemo.data=str.charAt(0);
        treeDemo.left=create(str.charAt(0)+"左子树");
        treeDemo.right=create(str.charAt(0)+"右子树");
        return treeDemo;
    }
    //先序遍历
    public void preprint(TreeDemo treeDemo){
        System.out.println("先序遍历");
        if(treeDemo!=null){
            System.out.print(treeDemo.data+" ");
            preprint(treeDemo.left);
            preprint(treeDemo.right);
        }

    }
    //中序遍历
    public void inprint(TreeDemo treeDemo){
        System.out.println("中序遍历");
        if(treeDemo!=null){
            inprint(treeDemo.left);
            System.out.print(treeDemo.data+" ");
            inprint(treeDemo.right);
        }
    }
    //后序遍历
    public void afterprint(TreeDemo treeDemo){
        System.out.println("后序遍历");
        if(treeDemo!=null){
            System.out.print(treeDemo.data+" ");
            afterprint(treeDemo.left);
            afterprint(treeDemo.right);
        }
    }
}
