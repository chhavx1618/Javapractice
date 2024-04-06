class Node {
    int key;
    Node left;
    Node right;

    public Node (int item) {
        key=item;
        left = right = null;
    }
}

class binTree {
    Node root;
    
    public binTree() {
        root = null;
    }

    public void insert (int key) {
        root = insertRec(root, key);
    }

    Node insertRec (Node root, int key) {

        //if root is null, then the new note is added to the root, key is 1 or wtv the standard numbering was, but if not, then check the key for root's key. if key is smaller, add it as the left node and if key is larger add it as the right node?

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    /*Inorder Traversal
     * left then root then right
     */

    public void inorderRec (Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key + " ");
            inorderRec(root.right);
        }
    }

    public int heightRec (Node root) {
        if (root==null) {
            return 0;
        
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
        
    }

    public void height() {
        int treeHeight = height(root);
        System.out.println(treeHeight);
    }
}

class binarytree {
    public static void main(String[] args) {
        binTree MyTree = new binTree();
        MyTree.insert(10);
        MyTree.insert(20);
        MyTree.insert(50);
        MyTree.insert(40);
        MyTree.insert(30);

        MyTree.inorder();

        MyTree.height();

    }
}