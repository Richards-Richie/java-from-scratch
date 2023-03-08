public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node n1=new Node(data);
        size++;
        if(head == null){
            head=tail=n1;
            //System.out.println(n1.data);
            return;
        }
        n1.next=head;
        head=n1;
        //System.out.println(n1.data);
    }
    public void addLast(int data){
        Node n1=new Node(data);
        size++;
        if(head == null){
            head=tail=n1;
            return;
        }
        tail.next=n1;
        tail=n1;
        //System.out.println(n1.data);
    }
    public void printList(){
        if(head == null){
            System.out.println("linked list is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void addMiddle(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        
        Node temp=head;
        int counter=0;
        while( counter< index-1){
            temp=temp.next;
            counter++;
        }
        Node n1=new Node(data);
        n1.next=temp.next;
        temp.next=n1;
        size++;
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("no elemensts ");
            return;
        }
        if(size ==1){
            head=tail=null;
            size--;
        }
        head=head.next;
        size--;
        
    }
    public void removeLast(){
        if(size == 0){
            System.out.println("no elements");
            return;
        }
        if(size == 1){
            head=tail=null;
            size--;
            return;
        }
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    public int search(int key){
        int position=0;
        Node temp=head;
        while(temp !=null){
            if(key == temp.data){
                return position;
            }
            temp=temp.next;
            position++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index=helper(head.next,key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public void reverseList(){
        Node p=null;
        Node c=tail=head;
        Node n;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        head=p;
    }
    public void remove(int n){
        int size=0;
        Node temp=head;
        while(temp !=null){
            temp=temp.next;
            size++;
        }
        if(size==n){
            head=head.next;
            return;
        }
        int i=0;
        int index=size-n-1;
        Node prev=head;
        while(i<index){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next !=null && fast!=null){
            slow=slow.next; 
            fast=fast.next.next; 
        }
        return slow;
    }
    public boolean palindrome(Node mid){
        if(head==null || head.next==null){
            return false;
        }
        Node left=head;
        Node right=tail;
        Node prev=null;
        Node cur=tail=mid;
        Node next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
        mid.next=null;
        while(left!=null && right!=null){
            if(left.data == right.data){
                left=left.next;
                right=right.next;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.addFirst(5);
        l1.addFirst(1);
        l1.addLast(5);
        l1.addLast(1);
        l1.addMiddle(2,0);
        // l1.printList();
        // System.out.println("size :"+size);
        //l1.removeFirst();
        // l1.printList();
        // l1.removeLast();
        // System.out.println("remove last");
        // l1.printList();
        //System.out.println(tail.data);
        //l1.printList();
        //System.out.println(l1.search(1));
        //System.out.println(l1.recSearch(11));
        //l1.reverseList();
        //l1.remove(3);
        System.out.println(l1.findMid(head).data);
        l1.printList();
        System.out.println(l1.palindrome(l1.findMid(head)));
        
    }

}