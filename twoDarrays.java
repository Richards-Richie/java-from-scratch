import java.util.*;
public class twoDarrays {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        //creatingArray();
        spiralMatrix();
    }
    public static void creatingArray(){
        int [][]arr=new int[2][2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        search(arr,5);
        largestAndSmallest(arr);
    }
    public static void search(int [][]arr,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == key){
                    System.out.println("key found at "+i+" "+j);
                    break;
                }
            }
        }
    }
    public static void largestAndSmallest(int [][]arr){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(largest < arr[i][j]){
                    largest=arr[i][j];
                }
                if(smallest > arr[i][j]){
                    smallest=arr[i][j];
                }
            }
        }
        System.out.println("largest : "+largest+" smallest : "+smallest);
    }
    public static void spiralMatrix(){
        int [][]arr={
                    {1,2,3},
                    {2,3,6},
                    {2,3,1}
                };
        int startrow=0;
        int endrow=arr.length-1; 
        int startcol=0;
        int endcol=arr[0].length-1;
        while(startrow <= endrow && startcol <= endcol){
            //top
            for(int i=startcol;i<=endcol;i++){
                System.out.print(arr[startrow][i]+" ");
                System.out.println("top");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]+" ");
                System.out.println("right");
            }
            //bottom
            for(int i=endcol-1;i>=startcol;i--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(arr[endrow][i]+" ");
                System.out.println("bottom");
            }
            //left
            for(int i=endrow-1;i>startrow;i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(arr[startcol][i]+" ");
                System.out.println("left");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
            System.out.println();
        }
    }
}
