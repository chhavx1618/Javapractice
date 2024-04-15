class Node {
    int key;
    Node left;
    Node right;

    public Node (int item) {
        key=item;
        left = right = null;
    }
}

class bst_col {
    Node root;

    public bst_col() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public void removeIndex() {

    }

    public void print() {
        
    }

    public void size() {
            
    }

    public static void main(String[] args) {
        bst_col bst = new bst_col();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
    }
}

//bst has smaller values on left of node and bigger on right of node