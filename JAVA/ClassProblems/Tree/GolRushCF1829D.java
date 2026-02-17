import java.util.Scanner;

public class GolRushCF1829D {

    static class Solution{
        private int goldRushHelper(int n,int m){
            if(n==m) return m;
            if(n%3 != 0) return 0;
            if(n<2) return 0;
            int left = goldRushHelper(n/3,m);
            int right = goldRushHelper(2*(n/3),m);

            if(right == m || left == m) return m;
            return 0;
        }
        public String GoldRush(int n,int m){
            return (goldRushHelper(n,m) == m) ? "YES" : "NO";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Solution solver = new Solution();
        for(int i=0;i<T;i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String Result = solver.GoldRush(N,M);
            System.out.println(Result);
        }
    }
}
