public class BubbleSortRightSide {
    public static int [] SortArray(int []nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            boolean IsSwapped = false;
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int Temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = Temp;
                    IsSwapped = true;
                }
            }
            if(!IsSwapped) break;
        }
        return nums;
    }
}
