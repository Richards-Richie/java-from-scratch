import java.util.*;
public class leetcode {
    
    public static void main(String[] args){
        int[]arr={1,2,2,1,1,3};//2 2
        System.out.println(uniqueNumberOfOccurrences(arr));
    }
    public static boolean uniqueNumberOfOccurrences(int []arr){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(smallest > arr[i]){
                smallest =arr[i];
            }
        }
        int []count=new int[largest+1];
        int []count1=new int[smallest * -1 +1];
        for(int i=0;i<count.length;i++){
            if(arr[i] > 0){
                count[arr[i]]++;
            }else{
                count1[arr[i] *-1]++;
            }
        }
        Arrays.sort(count);
        Arrays.sort(count);
        for(int i=count.length-1;i>=1;i--){
            if(count[i] == count[i-1] && count[i] > 0){
                System.out.println("one");
                return false;
            }
            
        }
        for(int i=count1.length-1;i>=1;i--){
            if(count1[i] == count1[i-1] && count1[i] > 0){
                return false;
            }
        }
        for(int i=count.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(count[i] == count[j] && count[j]>0){
                    System.out.println("one");
                    return false;
                }
            }
        }
        return true;
    }
}
