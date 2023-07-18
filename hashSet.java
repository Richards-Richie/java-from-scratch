import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        HashSet <Integer>hs=new HashSet<>();
        hs.add(1);
        System.out.println(hs.contains(1));
        hs.remove(1);
        System.out.println(hs.contains(1));
        ;
    }
}
