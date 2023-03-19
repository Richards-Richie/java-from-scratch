import java.util.*;
public class stacks {
    public static class stack{
        static ArrayList <Integer> st=new ArrayList<>();
        public static boolean isEmpty(){
            if(st.size() == 0 ){
                return true;
            }else{
                return false;
            }
        }
        public static void push(int val){
            st.add(val);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int tos=st.get(st.size()-1);
            st.remove(st.size()-1);
            return tos;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int tos=st.get(st.size()-1);
            return tos;
        }
    }
    public static void main(String[] args) {
        //stack s=new stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
