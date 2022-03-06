package 二叉树;

public class 对称二叉树 {
    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode();
        int a[]={1,2,2,3,4,4,3};
        treeNode1.creat(a);
        boolean b=isSymmetric(treeNode1);
        System.out.println(b);
    }
    public static boolean isSymmetric(TreeNode root) {
      return check(root,root);
    }

    private static boolean check(TreeNode root, TreeNode root1) {
    if(root==null&&root1==null)
        return true;
        if(root==null || root1==null){
            return false;
        }
       return (root.val==root1.val)&&(check(root.left,root1.right))&&
               (check(root.right,root1.left));
    }
}
