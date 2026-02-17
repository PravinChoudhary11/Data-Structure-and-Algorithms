

public class BreadthFirstSearch {
    public static void main(String[] args){
        Integer []InputTree = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        TreeBuilder<Integer> Builder = new TreeBuilder<Integer>();
        TreeNode<Integer> root = Builder.BuildTree(InputTree);
        TreePrinter<Integer> Printer = new TreePrinter<Integer>();
        Printer.BreadthFirstSearch(root);
        Printer.BFSZigZacTraverse(root);
    }
}
