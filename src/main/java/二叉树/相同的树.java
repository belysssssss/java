package 二叉树;

public class 相同的树 {
    public static void main(String[] args) {
        TreeNode treeNode1=new TreeNode();
        TreeNode treeNode2=new TreeNode();
        int a[]={1,2,3};
        int c[]={1,2,3};
        treeNode1.creat(a);
        treeNode2.creat(c);
        boolean b=isSameTree(treeNode1,treeNode2);
        System.out.println(b);
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }else if(p==null||q==null){
            return false;
        }else if(q.val!=p.val){
            return false;
        }else{
            return isSameTree(q.left,p.left)&&isSameTree(p.right,q.right);
        }
    }
}
