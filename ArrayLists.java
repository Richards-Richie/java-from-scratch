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
        ArrayList<Integer> containsRainWater=new ArrayList<Integer>();
        containsRainWater.add(1);
        containsRainWater.add(8);
        containsRainWater.add(6);
        containsRainWater.add(2);
        containsRainWater.add(5);
        containsRainWater.add(4);
        containsRainWater.add(8);
        containsRainWater.add(3);
        containsRainWater.add(7);
        System.out.println(containsMoreWater(containsRainWater));
        System.out.println(storeWater(containsRainWater));
        ArrayList<Integer> pairs=new ArrayList<>();
        pairs.add(1);
        pairs.add(2);
        pairs.add(3);
        pairs.add(4);
        pairs.add(5);
        pairs.add(6);
        System.out.println(pairSum(pairs, 3));


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
    public static int containsMoreWater(ArrayList<Integer> al){
        int max=0;
        for(int i=0;i<al.size()-1;i++){
            for(int j=i+1;j<al.size();j++){
                int height=Math.min(al.get(i),al.get(j));
                int width=j-i;
                int water=height*width;
                max=Math.max(water,max);
            }
        }
        return max;
    }
    public static int storeWater(ArrayList<Integer> al){
        int max=0;
        int left=0;
        int right=al.size()-1;
        while(left < right){
            int height=Math.min(al.get(left),al.get(right));
            int width=right-left;
            int water=height*width;
            max=Math.max(max,water);
            if(al.get(left) < al.get(right)){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
    public static boolean pairSum(ArrayList<Integer> al,int target){
        int left=0;
        int right=al.size()-1;
        while(left < right){
            int sum=al.get(left)+al.get(right);
            if(sum == target){
                return true;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}
