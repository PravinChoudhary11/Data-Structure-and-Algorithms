public class BubbleSortLeftSide {
    public static int [] SortArray(int []nums){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            boolean Swapped = false;
            for(int j=n-1;j>i;j--){
                if(nums[j]<nums[j-1]){
                    int Temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = Temp;
                    Swapped = true;
                }
            }
            if(!Swapped) break;
        }
        return nums;
    }
}
