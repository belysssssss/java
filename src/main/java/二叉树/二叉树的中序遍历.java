package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的中序遍历 {
    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode();
        int[] a={1,2,3};
         treeNode.creat(a);
        List<Integer> ans=inorderTraversal(treeNode);
        System.out.println(ans);
    }
    public static  List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> list=new ArrayList<>();
       dfs(root,list);
       return list;
    }
    private static void dfs(TreeNode root,List<Integer> list) {
    if(root!= null){
       return;
    }
    dfs(root.left,list);
    list.add(root.val);
    dfs(root.right,list);
    }
}



