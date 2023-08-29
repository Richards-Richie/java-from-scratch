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
}
