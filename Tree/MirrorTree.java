// Make mirror image of a binary tree
class MirrorTree{
    public static void main(String arg[]){
        Node root = buildTree();
        System.out.println("before mirror");
        inorder(root);
        mirror(root);
        System.out.println("after mirror");
        inorder(root);
    }
    //Build Tree
    public static Node buildTree(){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.right = new Node(24);
        return root;
    }
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node mirrorLeft = mirror(root.left);
        Node mirrorRight = mirror(root.right);
        
        root.left = mirrorRight;
        root.right = mirrorLeft;
        
        return root;
    }
    // Printing nodes in inorder fashion
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.key + " inorder");
        inorder(root.right);
    }
}