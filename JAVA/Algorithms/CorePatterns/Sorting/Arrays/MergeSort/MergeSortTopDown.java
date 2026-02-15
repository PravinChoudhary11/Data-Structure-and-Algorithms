public class MergeSortTopDown {
    public static int[] MergeSort(int[] nums,int start,int end){
        if(start>=end) return new int[]{nums[start]};
        int mid = start+(end-start)/2;
        //Left Array;
        int[] ArrayLeft = MergeSort(nums,start,mid);
        //Right Array;
        int[] ArrayRight = MergeSort(nums,mid+1,end);
        return Merge(ArrayLeft,ArrayRight);
    }

    public static int[] Merge(int[] nums1,int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] MergedArray = new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                MergedArray[k++] = nums1[i++];
            }else{
                MergedArray[k++] = nums2[j++];
            }
        }
        while(i<n1){
            MergedArray[k++] = nums1[i++];
        }
        while(j<n2){
            MergedArray[k++] = nums2[j++];
        }
        return MergedArray;
    }
}
