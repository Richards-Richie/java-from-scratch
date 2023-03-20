import java.util.*;
public class Stack1 {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }else{
            int tos=s.pop();
            pushAtBottom(s, data);
            s.push(tos);
        }
        return;
    }
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        //push to the stack first
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        //pop from the stack and append to the string
        StringBuilder res=new StringBuilder("");
        while(!s.isEmpty()){
            res=res.append(s.pop());
        }
        return res.toString();
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int tos=s.pop();
        reverseStack(s);
        pushAtBottom(s, tos);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        printStack(s);
        // pushAtBottom(s, 5);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        // String a="hello world";
        // System.out.println(reverseString(a));
    }
}