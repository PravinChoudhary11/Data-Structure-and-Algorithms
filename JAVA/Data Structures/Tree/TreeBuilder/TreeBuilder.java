/*
*  This is Tree Builder Class .
* */

import java.util.LinkedList;
import java.util.Queue;


public class TreeBuilder<T>{
    public TreeNode<T> BuildTree(T []Array){
        if(Array == null || Array.length==0 || Array[0]==null) return null;
        TreeNode<T> root = new TreeNode<T>(Array[0]);
        Queue<TreeNode<T>> Container = new LinkedList<>();
        TreeNode<T> Runner = root;
        Container.add(root);
        int i=1;
        while(!Container.isEmpty() && i<Array.length){
            Runner = Container.poll();
            if(i<Array.length && Array[i]!=null){
                Runner.left = new TreeNode<T>(Array[i]);
                Container.add(Runner.left);
            }
            i++;
            if(i<Array.length && Array[i]!=null){
                Runner.right = new TreeNode<T>(Array[i]);
                Container.add(Runner.right);
            }
            i++;
        }
        return root;
    }
}
