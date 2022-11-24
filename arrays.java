import java.util.*;
public class arrays {
    
    public static void main(String []args){
        //creatin arry in different ways
        int []names=new int [10];
        //int []names1={1,2,3,4,5};
        //String []names2={"Richards","Indra","Sai"};


        try (//inserting values to arrays 
        Scanner s = new Scanner(System.in)) {
            names[0]=1;
            names[1]=s.nextInt();
        }
        //output from the array
        System.out.println(" arrray names is "+names[0]);
        System.out.println(" arrray names is "+names[1]);

        //passing array as an arguement
        System.out.println("linear search for 10 element :"+linearsearch());
        System.out.println("the largest of array is : "+largestvalue());
        System.out.println("the minimum of array is : "+smallest());
        System.out.println("the position of 12 is using binary search "+ binarysearch());
        reverse();
        pairs();
        printSubarray();
    }
    public static int linearsearch(){
        int []arr={2,4,6,8,10,12,14,16};
        int key=20;
        int pos=-1;
        for(int i=0;i<arr.length;i++){
            if(key == arr[i]){
                return i;
            }
        }
        return pos;
    }
    public static int largestvalue(){
        int arr[]={1,2,6,3,5};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int smallest(){
        int min=Integer.MAX_VALUE;
        int []arr={1,7,8,9,4,6,4,1};
        for(int i=0;i<arr.length;i++){
            if(min >= arr[i] ){
                min=arr[i];
            }
        }
        return min;
    }
    public static int binarysearch(){
        int []arr={0,2,4,6,8,10,12,14,16};
        int start =0;
        int end=arr.length-1;
        int mid=-1;
        int key=12;
        //looping 
        while(start < end){
            mid=(start+end)/2;
            //checking if the value of middle in arr is equla to key
            if(arr[mid] == key){
                return mid;
            }
            // if middle value is less than key then all the values is the array
            //are lesser than middle to its left so we have to check 2nd half
            else if(mid < key){
                start=mid+1;
            }
            //if middle value is greater than key then all the values from the array are the array
            //greater than key to its right.so we have to check to middle value in next
            //iteration loop
            else{
                end=mid-1;
            }
        }
        return mid;
    }
    public static void reverse(){
        int []arr={0,2,4,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int start=0;
        int end=arr.length-1;
        while(start < end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void pairs(){
        int []arr={2,4,6,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+" , "+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void printSubarray(){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int []arr={2,4,6,8,10};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" , ");
                }
                if(maxsum<sum){
                    maxsum=sum;
                }
                if(minsum>sum){
                    minsum=sum;
                }
                System.out.println("sum : "+ sum);
                sum=0;
            }
            System.out.println();
        }
        System.out.println("the max sum and min sum is:"+maxsum+" , "+minsum);
    }
}
