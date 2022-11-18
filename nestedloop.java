import java.util.*;
public class nestedloop {
    public static Scanner s=new Scanner(System.in);
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
        pattern5_1();
        patter6_1();
        patter9_2();
        pattern10();
        pattern11();
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
    public static void pattern5_1(){
        System.out.println("pattern 5.1");
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if(i == 0 || i == 3 || j==0 || j==4  ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void patter6_1(){
        System.out.println("pattern 6.1");
        System.out.println("enter rows and cols");
        int rows=s.nextInt();
        int cols=s.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=cols-1;j>=i;j--){
                System.out.print(" - ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void patter9_2(){
        boolean b=true;
        for(int i=1;i<=5;i++){
            if(i%2 != 0){
                b=true;
            }
            for(int j=1;j<=i;j++){
                if(b){
                    System.out.print(" 1 ");
                    b=false;
                }else{
                    System.out.print(" 0 ");
                    b=true;
                }
            }
            System.out.println();
        }
    }
    public static void pattern10(){
        System.out.println("pattern 10");
        int n=5;
        int rows=6;
        for(int i=0;i<rows/2;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j=0;j<n-1;j++){
                System.out.print("   ");
            }
            n-=2;
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=0;i<rows/2;i++){
            for(int j=3;j>i;j--){
                System.out.print(" * ");
            }
            for(int j=0;j<=n;j++){
                System.out.print("   ");
            }
            n+=2;
            for(int j=3;j>i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void pattern11(){
        for(int i=0;i<5;i++){
            for(int j=4;j>=i+1;j--){
                System.out.print("   ");
            }
            
            for(int j=0;j<5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
