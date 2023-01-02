import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        for(int i=0;i<al.size();i++) {
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        al.remove(2);
        for(Integer i=0;i<al.size();i++){
            al.set(i,i);
        }
        System.out.println(al);
        System.out.println(al.contains(5));
        System.out.println(al);
        reverseList(al);
        System.out.println();
        maxInteger(al);
        System.out.println(al);
        swap(al,0,1);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);
        mld();
    }
    public static void reverseList(ArrayList<Integer> al){
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(al.size()-i-1)+" ");
        }
    }
    public static void maxInteger(ArrayList<Integer> al){
        Integer max=Integer.MIN_VALUE;
        for(int i=0;i<al.size();i++){
            if(max < al.get(i)){
                max=al.get(i);
            }
        }
        System.out.println(max);
    }
    public static void swap(ArrayList<Integer> al,int a,int b){
        Integer temp=al.get(a);
        al.set(a,al.get(b));
        al.set(b,temp);
    }
    public static void mld(){
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(1);al1.add(2);al1.add(3);
        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(2);al2.add(4);al2.add(6);
        ArrayList<Integer> al3=new ArrayList<>();
        al3.add(3);al3.add(6);al3.add(9);
        al.add(al1);al.add(al2);al.add(al3);
        System.out.println(al);
    }
}
