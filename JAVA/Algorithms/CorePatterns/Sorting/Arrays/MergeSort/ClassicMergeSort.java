public class ClassicMergeSort {
    public static void mergeSort(int[] nums,int start,int end){
        if(start>=end) return;
        int mid = start+(end-start)/2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);
    }
    public static void merge(int[] nums,int start,int mid,int end){
        int[] Temp = new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(nums[i]<=nums[j]){
                Temp[k] = nums[i];
                k++;
                i++;
            }else{
                Temp[k] = nums[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            Temp[k] = nums[i];
            k++;
            i++;
        }
        while(j<=end){
            Temp[k] = nums[j];
            k++;
            j++;
        }
        System.arraycopy(Temp, 0, nums, start, Temp.length);
    }
}
