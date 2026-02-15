public class SelectionSortRightSide {
    public static int[] SortArray(int[] nums){
        int n = nums.length;
        for(int i = n-1;i>0;i--){
            int MaxIndex = i;
            for(int j=i-1;j>=0;j--){
                if(nums[MaxIndex]<nums[j]){
                    MaxIndex = j;
                }
            }
            int Temp = nums[MaxIndex];
            nums[MaxIndex] = nums[i];
            nums[i] = Temp;
        }
        return nums;
    }
}
