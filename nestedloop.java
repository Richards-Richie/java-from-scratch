import java.util.*;
public class nestedloop {
    public Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        pattern1();
        pattern2();
        pattern22();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
    }
    public static void pattern1(){
        System.out.println("pattern1");
        for(int i=0;i<4;i++){
            //4 time the outer loop should run
            for(int j=0;j<i+1;j++){
                //how many no of stars in each line should
                System.out.print(" * ");
                //what to print
            }
            System.out.println();
        }
    }
    public static void pattern2(){
        System.out.println("pattern2");
        for(int i=4;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void pattern22(){
        System.out.println("pattern22");
        for(int i=0;i<4;i++){
            for(int j=4;j>i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void pattern3(){
        System.out.println("pattern3");
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+(j+1)+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(){
        System.out.println("pattern4");
        int number=65;
        for(int i=0;i<4;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" "+(char)(number)+" ");
                number++;
            }
            
            System.out.println();
        }
        
    }
    public static void pattern5(){
        int n=5;
        System.out.println("pattern5");
        for(int i=0;i<n;i++){
            System.out.print(" * ");
        }
        System.out.println();
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print(" * ");
        }
    }
    public static void pattern6(){
        int n=5;
        System.out.println();
        System.out.println("pattern6");
        for(int i=0;i<n;i++){
            for(int j=n-2;j>=i;j--){
                System.out.print("   ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void pattern7(){
        System.out.println("pattern7");
        int n=5;
        int k=1;
        for(int i=0;i<5;i++){
            for(int j=n;j>i;j--){
                System.out.print(" "+k+" ");
                k++;
            }
            k=1;
            System.out.println();
        }
    }
    public static void pattern8(){
        System.out.println("pattern8");
        int n=5;
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void pattern9(){
        int n=5;
        boolean b=true;
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                b=true;
            }
            for(int j=0;j<=i;j++){
                if(b){
                    System.out.print(" 1 ");
                    b=false;
                }
                else{
                    System.out.print(" 0 ");
                    b=true;
                }
            }
            System.out.println();
        }
    }
}
