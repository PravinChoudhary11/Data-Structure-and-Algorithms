
import java.util.ArrayList;
import java.util.Arrays;


public class TreeBuilderDFS {
    public static void main(String[] args){
        ArrayList<Integer> preOrder = new ArrayList<>(Arrays.asList(3,9,20,15,7));
        ArrayList<Integer> inOrder = new ArrayList<>(Arrays.asList(9,3,15,20,7));

        TreePrinter<Integer> printer = new TreePrinter<>();
        BuildTree builder = new BuildTree();
        printer.BFSLevelByLevel(builder.BuildUsingPreAndInOrder(preOrder,inOrder));
    }
    static class BuildTree{
        public int getrootIndex(ArrayList<Integer> inOrder,int val,int start,int end){
            for(int i=start;i<=end;i++){
                if(inOrder.get(i) == val) return i;
            }
            return -1;
        }
        public TreeNode<Integer> Builder(ArrayList<Integer> preOrder,ArrayList<Integer> inOrder,int[] preOrderIndex,int Searchstart,int Searchend){
            if(Searchstart>Searchend) return null;
            int Nodeval = preOrder.get(preOrderIndex[0]);
            preOrderIndex[0]++;
            TreeNode<Integer> root = new TreeNode<>(Nodeval);
            int index = getrootIndex(inOrder,Nodeval,Searchstart,Searchend);
            root.left = Builder(preOrder,inOrder,preOrderIndex,Searchstart,index-1);
            root.right = Builder(preOrder,inOrder,preOrderIndex,index+1,Searchend);
            return root;
        }
        public TreeNode<Integer> BuildUsingPreAndInOrder(ArrayList<Integer> preOrder,ArrayList<Integer> inOrder){
            return Builder(preOrder,inOrder,new int[]{0},0,preOrder.size()-1);
        }
    }
}
