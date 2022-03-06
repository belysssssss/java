package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

        int val;//数据域
        TreeNode left;
        TreeNode right;
        TreeNode root;
        List<TreeNode> datas;
        TreeNode() {

        }

        TreeNode(int val,TreeNode left,TreeNode right) {
            this.left = left;
            this.right = right;
            this.val = val;
    }

    //将初始化的左右孩子值为空
    public TreeNode(int val){
            this(val,null,null);
    }

    public void creat(int[] objs){
            datas=new ArrayList<TreeNode>();
            //将一个数组的值依次转化为Node节点
        for (int o:objs){
            datas.add(new TreeNode(o));
        }
        //第一个数为根节点
        root=datas.get(0);
        //建立二叉树
        for(int i=0;i<objs.length/2;i++){
            //左孩子
            datas.get(i).left=datas.get(i*2+1);
            //右孩子
            if(i*2+2<datas.size()){
                //避免偶数的时候，下标越界
                datas.get(i).right=datas.get(i*2+2);
            }
        }
    }
    //先序遍历
    public void preorder(TreeNode root){
            if(root!=null){
                System.out.println(root.val);
                preorder(root.left);
                preorder(root.right);
            }
    }
    //中序遍历
    public void inorder(TreeNode root){
        if(root!=null){

            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }
    //后序遍历
    public void afterorder(TreeNode root){
        if(root!=null){
            afterorder(root.left);
            afterorder(root.right);
            System.out.println(root.val);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode();
        int[] a={2,4,5,7,1,6,12,32,51,22};
        treeNode.creat(a);
        treeNode.preorder(treeNode.root);
    }
}
