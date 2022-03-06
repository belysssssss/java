package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的所有路径 {
    public static void main(String[] args) {

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        dfs(root,"",list);
        return list;

    }

    private void dfs(TreeNode root, String s, List<String> list) {
        if (root != null) {
            StringBuffer stringBuffer = new StringBuffer(s);
            stringBuffer.append(Integer.toString(root.val));
            //当前点为叶子节点
            if(root.left==null && root.right==null){
                //将第一组的路径加入结果集
                list.add(stringBuffer.toString());
            }else{
                //当前节点不是叶子节点，则继续递归
                stringBuffer.append("->");
                dfs(root.left,stringBuffer.toString(),list);
                dfs(root.right,stringBuffer.toString(),list);
            }
        }
    }
}



