import java.util.*;
public class leetcode1 {
    public static void main(String[] args){
        int []arr={1,7,3,6,5,6};
        // int target=9;
        // int []ans=two_sum(arr,target);
        // System.out.print(ans[0]+" "+ans[1]);
        //System.out.println(removeDuplicates1(arr));

        System.out.println(pivotIndex(arr));
        
    }
    public static int[]two_sum(int []nums,int target){
        //brute force approach
        // int []ans=new int[2];
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j] == target){
        //             ans[0]=i;
        //             ans[1]=j;
        //             return ans;
        //         }
        //     }
        // }
        // return ans;
        int []ans=new int[2];
            int []arr1=new int [nums.length];
            for(int i=0;i<arr1.length;i++){
                arr1[i]=target-nums[i];
            }
            Arrays.sort(nums);
            for(int i=0;i<arr1.length;i++){
                int j=Arrays.binarySearch(nums,i,nums.length,arr1[i]);
                if(j >=0 && j< nums.length){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        return ans;
        //wrong answer
    }
    public static int removeDuplicates(int[] arr){
        //brute force approach
        int k=0;
        for(int i=0;i<arr.length-1;i++){//O(n^2)
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[j]=Integer.MAX_VALUE;
                }
            }
        }
        Arrays.sort(arr);//O(nlogn)
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==Integer.MAX_VALUE ){
                k=i;
                break;
            }
        }
        return k;
    }//we can apply counting sort for this which makes less time complexity
    public static int removeDuplicates1(int[] nums){
        int j=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] != nums[i]){
                count++;
            }
        }
        if(count >= 1 && nums.length > 1){
            int k=1;
            for(int i=1;i<nums.length;i++){
                if(nums[i-1] == nums[i] || j==nums[i]){
                    if(nums[i-1] !=Integer.MAX_VALUE && nums[i-1] !=nums[i] ){
                        j=nums[i-1];
                    }
                    nums[i]=Integer.MAX_VALUE;
                }else{
                    k++;
                }
            }
            Arrays.sort(nums);
            return k;
        }
        if(nums.length == 1){
            return 1;
        }
        Arrays.sort(nums);
        return 0;
    }
    public static int pivotIndex(int []nums){
        int pivot=0;
        int leftsum=0;
        int rightsum=0;
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            pivot=i;
            if(i >0){
                leftsum=leftsum+nums[i-1];
            }else{
                leftsum=0;
            }
            if(i == nums.length-1){
                rightsum=0;
            }else{
                rightsum=totalsum-leftsum-nums[i];
            }
            if(rightsum == leftsum){
                return pivot;
            }
        }
        return -1;
    }
}
