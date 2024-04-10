//Find Maximum width of tree
import java.util.*;
class MaxWidth{
    public static void main(String args[]){
        Node root = buildTree();
        System.out.println(maxWidth(root));
    }
    //Build Tree
    public static Node buildTree(){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(24);
        root.left.right = new Node(24);
        root.right.right = new Node(24);
        root.right.left = new Node(24);
        root.right.left.left = new Node(100);
        return root;
    }
    public static int maxWidth(Node root){
        if(root==null){
            return 0;
        }
        int res; int max=0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(q.isEmpty() == false){ 
            res = q.size();
            max = Math.max(res, max);
            for(int i=0; i< res; i++){
                //Make sure to have curr out from the queue
                Node curr=q.poll();
                if(curr.left != null){
                    //Use curr only @ here
                    q.add(curr.left);  
                }
                if(curr.right != null){
                    //Use curr only @ here
                    q.add(curr.right);
                }
            }
        }
        return max;
    }
}
//Create Tree Node
class Node{
    int key;
    Node right;
    Node left;
    Node(int key){
        this.key = key;
    }
}