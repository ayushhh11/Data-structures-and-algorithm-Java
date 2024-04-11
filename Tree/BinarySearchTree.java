// In recussion solve small
// Like in below case try to insert only 3 values first
class BinarySearchTree {
    public static void main(String args[]) {
        Node root = null;
        root = insertNode(root, 10);
        insertNode(root, 20);
        insertNode(root, 22);
        insertNode(root, 24);
        insertNode(root, 2);
        insertNode(root, 3);
        inorder(root);
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

    // Inserting nodes so to maintain BST structure
    public static Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (root.key > key) {
            root.left = insertNode(root.left, key);
        }
        if (root.key < key) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }
}

class Node {
    int key;
    Node right;
    Node left;

    Node(int key) {
        this.key = key;
    }
}