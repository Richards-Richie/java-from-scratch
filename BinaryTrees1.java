import java.util.*;
public class BinaryTrees1{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree{
        static int index=-1;
        public static Node create(int []data){
            index++;
            if(data[index] == -1){
                return null;
            }
            Node root=new Node(data[index]);
            root.left=create(data);
            root.right=create(data);
            return root;
        }
        public static void preorder(Node root){
            if(root== null){
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root == null){
                System.out.print("-1 ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root == null){
                System.out.print("-1 ");
                return;
                
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelorder(Node root){
            
            if(root == null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            int counter=1;
            while(!q.isEmpty()){
                Node cur=q.remove();
                if(cur!=null){
                    System.out.print(cur.data+" ");
                    if(cur.left!=null){
                        q.add(cur.left);
                    }
                    if(cur.right!=null){
                        q.add(cur.right);
                    }
                }else{
                    if(!q.isEmpty()){
                        System.out.println();
                        q.add(null);
                        counter++;
                    }else{

                        break;
                    }
                }
            }
            System.out.println();
            System.out.println(counter+" ");
        }
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }
        public static int count(Node root){
            if(root == null){
                return 0;
            }
            int lc=count(root.left);
            int rc=count(root.right);
            return lc+rc+1;
        }
        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int ls=sumOfNodes(root.left);
            int rs=sumOfNodes(root.right);
            return ls+rs+root.data;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.create(nodes);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelorder(root);
        System.out.println();
        System.out.println(tree.height(root));
        System.out.println();
        System.out.println(tree.count(root));
        System.out.println();
        System.out.println(tree.sumOfNodes(root));
    }
}