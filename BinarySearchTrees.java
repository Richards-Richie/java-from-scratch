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
    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.val == key){
            return true;
        }
        
        if(root.val > key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }
    public static Node delete(Node root,int key){
        if(key < root.val){
            return delete(root.left,key);
        }else if(key > root.val){
            return delete(root.right,key);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            else{
                Node is=inorderSucessor(root.right);
                root.val=is.val;
                root.right=delete(root.right,is.val);
            }
        }
        return root;
    }
    public static Node inorderSucessor(Node root) {
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int []arr={1,9,2,8,3,7,4,6,5,0};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        //inorder(root);
        //System.out.println(search(root, 11));
        root=delete(root,8);
        inorder(root);
    }
    
}
