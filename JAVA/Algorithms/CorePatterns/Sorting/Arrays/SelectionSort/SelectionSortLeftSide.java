public class SelectionSortLeftSide {
    public static int[] SortArray(int[] nums){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int MinIndex = i;
            for(int j=i+1;j<n;j++){
                if(nums[MinIndex]>nums[j]){
                    MinIndex = j;
                }
            }
            int Temp = nums[MinIndex];
            nums[MinIndex] = nums[i];
            nums[i] = Temp;
        }
        return nums;
    }
}
