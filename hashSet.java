import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        HashSet <ArrayList>hs=new HashSet<>();
        ArrayList <Integer>ar=new ArrayList<>();
        for(int i=0;i<10;i++){
            ar.add(i);
        }
        hs.add(ar);
        //System.out.println(hs);
        ArrayList <Integer>ar1=new ArrayList<>();
        for(int i=0;i<5;i++){
            ar1.add(i);
        }
        hs.add(ar1);
        System.out.println(hs);
        iterator(hs);
        TreeSet <Integer>ts=new TreeSet<>();
        for(int i=10;i>=0;i--){
            System.out.print(i+" ");
            ts.add(i);
        }
        System.out.println(ts);
    }
    public static void iterator(HashSet <ArrayList>hs){
        System.out.println("iterator");
        Iterator i=hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        //for each
        for(ArrayList <Integer>j: hs){
            System.out.println(j);
        }
    }
}
