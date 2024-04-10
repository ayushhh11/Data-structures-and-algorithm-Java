class TreeTraversal{
    public static void main(String args[]){
        Node root = buildTree();
        //Printing the nodes of the k level
        int k=2;
        treeTraverse(root, k);
    }
    //Build Tree
    public static Node buildTree(){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(24);
        return root;
    }
    public static void treeTraverse(Node root, int k){
        if(root == null){
            return;
        }
        if(k == 1){
            System.out.println(root.key);
        } else {
        treeTraverse(root.left, k-1);
        treeTraverse(root.right, k-1);
        }
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