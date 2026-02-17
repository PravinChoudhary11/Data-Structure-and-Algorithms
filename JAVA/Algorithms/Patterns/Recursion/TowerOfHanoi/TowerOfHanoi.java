import java.util.Scanner;

public class TowerOfHanoi {
    private static int StepNumber = 1;
    public static int getDiskMoves(int n,int src,int helper,int Destination){
        if(n==1) {
            System.out.println("StepNumber : "+(StepNumber++)+" Moving: "+n+" from "+src+" to "+Destination);
            return 1;
        }

        int CountTop = getDiskMoves(n-1,src,Destination,helper);
        System.out.println("StepNumber : "+(StepNumber++)+" Moving: "+n+" from "+src+" to "+Destination);
        int CountBottom = getDiskMoves(n-1,src,helper,Destination);
        return CountTop+CountBottom+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Disk : ");
        int n = sc.nextInt();
        int diskMoves = getDiskMoves(n,1,2,3);
        System.out.print("Total Moves it Takes : "+diskMoves);
        sc.close();
    }
}
