public class InsertionSort {
    public static void main(String []Sorting){
        int []Array = ArrayBuilder.getArray(14);
        System.out.print("Original Array: ");
        ArrayPrinter.PrintArray(Array);
        System.out.print("After Sorting : ");
        ArrayPrinter.PrintArray(ClassicInsertionSort.SortArray(Array));
        System.out.print("After Sort SLS: ");
        ArrayPrinter.PrintArray(InsertionSortLeftSide.SortArray(Array));
        System.out.print("After Sort SRS: ");
        ArrayPrinter.PrintArray(InsertionSortRightSide.SortArray(Array));
    }
}
