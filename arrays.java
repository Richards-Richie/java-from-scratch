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
        prefixsumarray();
        kadans();
        trappingRainWater();
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
    public static void prefixsumarray(){
        int []arr={2,4,6,8,10};
        int []prefixarr=new int[arr.length];
        prefixarr[0]=2;
        int prefixsum=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        for(int i=1;i<prefixarr.length;i++){
            prefixarr[i]=prefixarr[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                // for(int k=i;k<=j;k++){
                //     System.out.print(arr[k]+" , ");
                // }
                //insted of the for loop we will use the prefix formula here 
                if(start == 0){
                    prefixsum=prefixarr[end];
                    maxsum=(maxsum<prefixsum)?prefixsum:maxsum;
                    minsum=(minsum > prefixsum)?prefixsum:minsum;
                }
                else{
                    prefixsum=prefixarr[end]-prefixarr[start-1];
                    maxsum=(maxsum<prefixsum)?prefixsum:maxsum;
                    minsum=(minsum > prefixsum)?prefixsum:minsum;
                }
                //the start and end values will get calculated in every iteratrions of i and j
                
            }
            System.out.println("prefixsum is "+prefixsum );
        }
    }
    public static void kadans(){
        int []arr={-2,-3,-4,-1,-2,-1,-5,-3};
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs= (cs+arr[i])>0?cs+arr[i]:0;
            ms=(ms > cs)?ms:cs;
        }
        if(ms == 0){
            ms=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                ms=(ms < arr[i])?arr[i]:ms;
            }
        }
        System.out.println(cs+" , "+ms);
    }
    public static void trappingRainWater(){
        int []arr={4,2,0,6,3,2,5};
        // let us take two arrays which calculates left and right boundaries
        int []lmb=new int[arr.length];
        int []rmb=new int[arr.length];
        //trapped water level initallly be 0
        int twl=0;
        //left max boundary is calculated from left to right with first left boundary
        //being arr[0]
        //the remaining lmx boundary is calculated by its immediate left value(lmb[i-1])
        //is compared with its value(arr[i]) 
        //the max between the are considered as lmb[i]
        //the same process repeats in rmb from right to left and i-1 changes to i+1
        for(int i=0;i<arr.length;i++){
            if(i == 0){
                lmb[i]=arr[0];
            }else{
                lmb[i]=(lmb[i-1] > arr[i])?lmb[i-1]:arr[i];
            }
        }
        //right max boundary
        for(int i=arr.length-1;i>=0;i--){
            if(i == arr.length-1){
                rmb[i]=arr[i];
            }else{
                rmb[i]=(rmb[i+1] > arr[i])?rmb[i+1]:arr[i];
            }
        }
        //trapped water level
        
        //trapped water level=
        //(maxwaterlevel - height)*width
        //water level =Math.min(lmb,rmb)
        
        for(int i=0;i<arr.length;i++){
            twl += ((Math.min(lmb[i],rmb[i]))-arr[i]);
        }
        System.out.println(" the trapped rain water level is : "+twl);
    }
}
