public class MergeSortBottomUp {
    public static void MergeSort(int[] nums){
        int n = nums.length;
        int[] TempStorage = new int[n];
        for(int size=1;size<n;size*=2){
            for(int start=0;start<n-size;start+=size*2){

                int mid = start+size-1;
                int end = Math.min(start+2*size-1,n-1);
                Merge(nums,TempStorage,start,mid,end);
            }
        }

    }
    private static void Merge(int[] nums,int[] Temp,int start,int mid,int end){
        int i=start;
        int j=mid+1;
        int k=start;
        while(i<=mid && j<=end){
            if(nums[i]<=nums[j]){
                Temp[k++] = nums[i++];
            }else{
                Temp[k++] = nums[j++];
            }
        }

        while(i<=mid) Temp[k++]=nums[i++];
        while(j<=end) Temp[k++]=nums[j++];

        if (end + 1 - start >= 0) System.arraycopy(Temp, start, nums, start, end + 1 - start);
    }
}
