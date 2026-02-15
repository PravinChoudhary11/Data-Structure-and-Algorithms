public class SelectionSort {
    public static void main(String[] Sorting){
        int[] Array = ArrayBuilder.getArray(13);
        System.out.print("Original Array : ");
        ArrayPrinter.PrintArray(Array);
        System.out.print("After Sorting  : ");
        ArrayPrinter.PrintArray(ClassicSelectionSort.SortArray(Array));
        System.out.print("After Sort SLS : ");
        ArrayPrinter.PrintArray(SelectionSortLeftSide.SortArray(Array));
        System.out.print("After Sort SRS : ");
        ArrayPrinter.PrintArray(SelectionSortRightSide.SortArray(Array));
    }
}
