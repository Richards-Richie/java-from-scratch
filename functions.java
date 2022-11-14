import java.util.*;

public class functions {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter values");
        int a=s.nextInt();
        int b=s.nextInt();
        sum(a,b);
        swap(a,b);
        int product=productof(a,b);
        System.out.println("product of vlaues:"+product);
        System.out.println("the factorial of the given numbers is :"+factorial(b));
        System.out.println("the binomial coefficient of n and r is :"+binomialCoefficient(a,b));
        System.out.println("the overloading function sum is : "+sum(a,b,10));
        System.out.println("the overloading sum with different data types : "+sum(5,1.2));
        System.out.println("check if the given number is prime or not :"+prime(1));
        primeRange(a);
    }
    public static int sum(int a,int b){
        System.out.println("the sum of number is "+(a+b));
        return (a+b);
    }
    public static void swap(int a,int b){
        System.out.println(" a :"+a+" b :"+b+" swap function");
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a :"+a+" b :"+b);
    }
    public static int productof(int a,int b){
        return (a*b); 
    }
    public static int factorial(int b){
        if((b==0 || b==1) ){
            return 1;
        }
        else{
            int fact=1;
            for(int i=1;i<=b;i++){
                fact*=i;
            }
            return fact;
        }
    }
    public static int  binomialCoefficient(int n,int r){
        //ncr=n!/r!*(n-r)!
        int c=0;
        int n1=factorial(n);
        System.out.println("n! : "+n1);
        int r1=factorial(r);
        System.out.println("r! : "+r1);
        int n_r=factorial(n-r);
        System.out.println("(n-r)! : "+n_r);
        c=n1/(r1*(n_r));
        return c;
    }
    public static int sum(int a,int b,int c){
        //this is an function overloading function in which no of parameters
        // are different form the other function.
        return a+b+c;
    }
    public static double sum(int a,double b){
        //this is a overloading function in which different data types are used for
        //rather than different no of parameters
        double sum=(double)a+b;
        return sum;
    }
    public static boolean prime(int n){
        if(n == 1 || n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            //the code editor says dead code i.e code can't be reached with
            //incrementing so incriment is removed to avoid warning from editor.
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int n){
        for(int i=2;i<n;i++){
            if(prime(i)){
                System.out.println("prime : "+i);
            }
        }
    }
}
