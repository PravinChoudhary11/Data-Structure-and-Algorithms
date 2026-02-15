import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Enter a Array size greater than 0.");
            return;
        }

        System.out.print("Enter Choice 1 if No Space else 2 for Extra Space: ");
        int choice = sc.nextInt();

        int[] Array = ArrayBuilder.getArray(size);

        System.out.print("Original Array:  ");
        ArrayPrinter.PrintArray(Array);

        if(choice==1){
            ClassicMergeSort.mergeSort(Array,0,Array.length-1);
        }else if(choice==2){
            Array = MergeSortTopDown.MergeSort(Array,0,Array.length-1);
        }else{
            System.out.println("Invalid Input");
            return;
        }

        System.out.print("After MergeSort: ");
        ArrayPrinter.PrintArray(Array);

        sc.close();
    }
}
