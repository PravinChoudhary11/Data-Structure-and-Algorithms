import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InversionCount {
    static class Solution{
        public long MergeSort(int[] nums,int start,int end,int[] Temp){
            if(start>=end) return 0;
            int mid = start+(end-start)/2;
            long countleft = MergeSort(nums,start,mid,Temp);
            long countright = MergeSort(nums,mid+1,end,Temp);
            return Merge(nums,start,mid,end,Temp)+countleft+countright;
        }
        public long Merge(int[] nums,int start,int mid,int end,int[] Temp){
            int i=start;
            int j=mid+1;
            long count = 0;
            int k=start;
            while(i<=mid && j<=end){
                if(nums[i]<=nums[j]){
                    Temp[k] = nums[i];
                    i++;
                    k++;
                }else{
                    Temp[k] = nums[j];
                    j++;
                    k++;
                    count+=(mid-i+1);
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
            for(int idx = start;idx<=end;idx++) nums[idx] = Temp[idx];
            return count;
        }
        public long getCount(int[] nums){
            int[] Temp = new int[nums.length];
           return MergeSort(nums,0,nums.length-1,Temp);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine().trim());
            int[] Array = new int[N];
            StringTokenizer st=new StringTokenizer(br.readLine());
            Solution solver = new Solution();
            for(int j=0;j<N;j++){
                Array[j] = Integer.parseInt(st.nextToken());
            }
            result.append(solver.getCount(Array)).append('\n');
        }
        System.out.print(result.toString());
    }
}
