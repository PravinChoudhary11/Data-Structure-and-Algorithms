import java.util.Scanner;

public class MergeSort {
    public static void main(String[] MergeSort){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();
        int[] Array = ArrayBuilder.getArray(size);
        System.out.print("Original Array:  ");
        ArrayPrinter.PrintArray(Array);
        ClassicMergeSort.mergeSort(Array,0,Array.length-1);
        System.out.print("After MergeSort: ");
        ArrayPrinter.PrintArray(MergeSortTopDown.MergeSort(Array,0,Array.length-1));
    }
}
