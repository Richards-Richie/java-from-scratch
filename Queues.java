public class Queues {
    static class queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;
        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            //circular queue
            return (rear+1)%size == front;
        }
        public static void add(int val){
            if(rear < size-1){
                rear++;
                arr[rear]=val;
            }else{
                System.out.println("queue full");
            }
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }else{
                front=arr[0];
                for(int i=0;i<arr.length-1;i++){
                    arr[i]=arr[i+1];
                }
                rear--;
                return front;
            }
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }
    static class circularque{
        int front;
        int rear;
        int arr[];
        int size;
        circularque(int sz){
            arr=new int[sz];
            size=sz;
            rear=-1;
            front=-1;
        }
        public boolean isEmptyC(){
            if(rear == -1 && front == -1){
                return true;
            }
            return false;
        }
        public boolean isFullC(){
            if((rear+1)%size == front){
                return true;
            }
            return false;
        }
        public void enque(int val){
            if(isFullC()){
                return;
            }
            if(front == -1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=val;
            
        }
        public int deque(){
            if(isEmptyC()){
                return -1;
            }
            int res=arr[front];
            if(rear == front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return res;
        }
        public int peekC(){
            if(isEmptyC()){
                return -1;
            }
            return arr[front];

        }
    }
    
    public static void main(String[] args){
        // queue a=new queue(5);
        // a.add(1);
        // a.add(2);
        // a.add(4);
        // while(!a.isEmpty()){
        //     System.out.println(a.peek());
        //     a.remove();
        // }
        circularque c=new circularque(5);
        c.enque(1);
        c.enque(2);
        c.enque(3);
        while(!c.isEmptyC()){
            System.out.println(c.deque());
        }
    }
}
