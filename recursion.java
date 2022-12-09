public class recursion {
    public static void main(String[] args) {
        increasingOrder(5);
        System.out.println();
        decreasingOrder(5);
        System.out.println();
        increasingOrder1(1);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(sumOfNaturals(5));
    }
    public static void increasingOrder(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        increasingOrder(n-1);
        System.out.print(n+" ");
    }
    public static void decreasingOrder(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        decreasingOrder(n-1);
    }
    public static void increasingOrder1(int n){
        if(n == 5){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        increasingOrder1(n+1);
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int sumOfNaturals(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNaturals(n-1);
    }
}
