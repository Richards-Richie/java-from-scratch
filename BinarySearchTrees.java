public class BinarySearchTrees {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val,Node left,Node right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            return new Node(val,null,null);
        }
        if(val < root.val){
            root.left=insert(root.left,val);
        }else if(val > root.val){
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val+" ");
        inorder(root.right);
    }
    public static Node search(Node root,int key){
        if(root == null){
            return null;
        }
        if(root.val == key){
            return root;
        }
        Node l=null;
        Node r=null;
        if(root.val > key){
            l=search(root.left,key);
        }
        else{
            r=search(root.right,key);
        }
        if(r!=null && r.val ==key){
            return r;
        }else if(l!=null && l.val == key){
            return l;
        }
        return null;
    }
    public static void main(String[] args) {
        int []arr={1,9,2,8,3,7,4,6,5,0};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(search(root, 6).val);
    }
    
}
