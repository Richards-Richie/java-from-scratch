public class BackTracking {
    public static void main(String[] args) {
        int []arr=new int[5];
        printArray(arr);
        onArray(arr,0);
        printArray(arr);
        subSets("abc","",0);
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void onArray(int []arr,int index){
        if(index == arr.length){
            return ;
        }
        arr[index]=index+1;
        onArray(arr,index+1);
        arr[index]=index-1;
    }
    public static void subSets(String str,String ans,int i){
        //base case for
        if(i == str.length()){
            if(ans.length()!=0){
                System.out.print(ans + "  ");
            }else{
                System.out.print("null");
            }
            return;
        }
        //recursion
        //yes
        subSets(str,ans+str.charAt(i),i+1);
        //no
        subSets(str,ans,i+1);
    }
}
