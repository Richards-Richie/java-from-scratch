public class DivideAndConquer {
    public static void main(String[] args) {
        int []arr2={9,8,7,6,5,4,3,2,1};
        printArray(arr2);
        mergeSort(arr2,0,arr2.length-1);
        printArray(arr2);
        int []arr1={9,8,7,6,5,4,3,2,1};
        printArray(arr1);
        quickSort(arr1,0,arr1.length-1);
        printArray(arr1);
        int []arr={4,5,6,7,0,1,2};
        System.out.println(rotatedSearch(arr,0,arr.length,0));
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int []arr,int start,int end){
        if(start >= end){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
        
    }
    public static void merge(int []arr,int start,int mid,int end){
        int []temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }else{
                temp[k]=arr[j];
                j++;k++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            k++;i++;
        }
        while(j<=end){
            temp[k]=arr[j];
            j++;k++;
        }
        for(k=0,i=start;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void quickSort(int []arr,int start,int end){
        if(start >= end){
            return;
        } 
        int pindex=partition(arr,start,end);
        quickSort(arr,start,pindex-1);
        quickSort(arr,pindex+1,end);
    }
    public static int partition(int []arr,int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<=end;j++){
            if(arr[j] < pivot){
                i++;
                int temp=arr[j];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[end];
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static int rotatedSearch(int []arr,int start,int end,int target){
        int mid=start+(end-start)/2;
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(arr[start] <= target && target <=arr[mid] ){
                return rotatedSearch(arr,start,mid-1,target);
            }else{
                return rotatedSearch(arr,mid+1,end,target);
            }
        }else{
            if(arr[mid] <= target && target <= arr[end]){
                return rotatedSearch(arr,mid+1,end,target);
            }else{
                return rotatedSearch(arr,start,mid-1,target);
            }
        }
    }
}
