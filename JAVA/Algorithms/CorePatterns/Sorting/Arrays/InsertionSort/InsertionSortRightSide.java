public class InsertionSortRightSide {
    public  static int[] SortArray(int[] nums){
        int n = nums.length;
        for(int i = n-2;i>=0;i--){
            int key = nums[i];
            int j=i+1;
            while(j<n && key>nums[j]){
                nums[j-1] = nums[j];
                j++;
            }
            nums[j-1] = key;
        }
        return nums;
    }
}
