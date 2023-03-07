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
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(4);
        l1.addMiddle(2,0);
        // l1.printList();
        // System.out.println("size :"+size);
        //l1.removeFirst();
        // l1.printList();
        // l1.removeLast();
        // System.out.println("remove last");
        // l1.printList();
        //System.out.println(tail.data);
        l1.printList();
        System.out.println(l1.search(1));
    }
}