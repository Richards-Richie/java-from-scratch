import java.util.*;
public class bitwise {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~6);
        // System.out.println(5 >> 2);
        // evenorodd();
        // System.out.println(getIth());
        // System.out.println(setIth());
        // System.out.println(getIth());
        //System.out.println(clearIth()); 
        // System.out.println(getIth());
        // updateIthbit();
        System.out.println(clearAllIbits());
    }
    public static void evenorodd(){
        System.out.println("enter a value");
        int a=s.nextInt();

        if( (a&1) == 1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
    public static int getIth(){
        System.out.println("get ith");
        System.out.println("enter a number ");
        int n=s.nextInt();
        System.out.println("enter ith value");
        int i=s.nextInt();
        int bitmask=1 << i;
        return n= n&bitmask;
    }
    public static int setIth(){
        System.out.println("set ith");
        System.out.println("enter a value");
        int n=s.nextInt();
        System.out.println("enter ith value ");
        int i=s.nextInt();
        int bitmask=1 << i;
        n= n | bitmask;
        return n;
    }
    public static int clearIth(){
        System.out.println("enter n value");
        int n=s.nextInt();
        System.out.println("enter i th value");
        int i=s.nextInt();
        int bitmask=~(1 << i);
        return n & bitmask;
    }
    public static void updateIthbit(){
        System.out.println("update ith bitmask");
        System.out.println("enter n value");
        int n=s.nextInt();
        System.out.println("enter i th term");
        int i=s.nextInt();
        System.out.println("enter updating value");
        int j=s.nextInt();
        if(j == 0){
            int bitmask=~(1<<i);
            System.out.println( n&bitmask );
        }else{
            int bitmask=1 << i;
            System.out.println( n | bitmask);
        }
    }
    public static int clearAllIbits(){
        System.out.println("clear all i bits");
        System.out.println("enter n value");
        int n=s.nextInt();
        System.out.println("enter ith value");
        int i=s.nextInt();
        int bitmask=(~0 << i);
        return n&bitmask;
    }
}
