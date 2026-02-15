

public class ClassicBubbleSort {
    public static int [] SortArray(int []nums){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            boolean Swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int Temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = Temp;
                    Swapped = true;
                }
            }
            if(!Swapped) break;
        }
        return nums;
    }
}
