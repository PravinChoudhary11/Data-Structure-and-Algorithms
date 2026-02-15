import java.util.LinkedList;
import java.util.Queue;

public class TreePrinter<T>{
    public void BreadthFirstSearch(TreeNode<T>   root){
        // Printing the Tree in the BFS Order [Level-By-Level Order]
        System.out.println("BFS Order :");
        Queue<TreeNode<T>> Container = new LinkedList<>();
        Container.add(root);

        while(!Container.isEmpty()){
            TreeNode<T> Runner = Container.poll();
            System.out.print(Runner.val+" ");

            if(Runner.left!=null){
                Container.add(Runner.left);
            }
            if(Runner.right!=null){
                Container.add(Runner.right);
            }
        }
        System.out.println();
    }

    public void BFSZigZacTraverse(TreeNode<T> root){
        System.out.println("BFS Zig-Zac Order: ");

        Queue<TreeNode<T>> Container = new LinkedList<>();
        Container.add(root);
        int levelNumber = 1;
        while(!Container.isEmpty()){
            int levelSize = Container.size();
            for(int i=0;i<levelSize;i++){

                if(levelNumber%2==0){
                    TreeNode<T> Runner = Container.poll();
                    if(Runner==null) break;
                    System.out.print(Runner.val+" ");
                    if(Runner.left!=null){
                        Container.add(Runner.left);
                    }
                    if(Runner.right != null){
                        Container.add(Runner.right);
                    }
                }else{
                    TreeNode<T> Runner = Container.poll();
                    if(Runner==null) break;
                    System.out.print(Runner.val+" ");
                    if(Runner.left!=null){
                        Container.offer(Runner.left);
                    }
                    if(Runner.right!=null){
                        Container.offer(Runner.right);
                    }
                }
            }
            System.out.println();
            levelNumber++;
        }
    }
}
