import java.util.Scanner;

public class BubbleSort {
    public static void main(String []Sorting){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();
        int []Array =  ArrayBuilder.getArray(size);
        System.out.print("Original Array: ");
        ArrayPrinter.PrintArray(Array);
        System.out.print("After Sorting : ");
        ArrayPrinter.PrintArray(ClassicBubbleSort.SortArray(Array));
        System.out.print("Array Sort FLS: ");
        ArrayPrinter.PrintArray(BubbleSortLeftSide.SortArray(Array));
        System.out.print("Array Sort FRS: ");
        ArrayPrinter.PrintArray(BubbleSortRightSide.SortArray(Array));
        sc.close();
    }
}
