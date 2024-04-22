//implement BinarySearchTree, insert delete and search, find diameter, exam
 4

//202351023, Chhavi Arora

class TreeNode {  //this is a class for defining nodres of the tree called treenodes

    int key;
    TreeNode left;
    TreeNode right;

    public TreeNode(int item) { //this is a constructor for the trenode class
        key = item;
        left = right = null;
    }
}


class exam
 { //this is the main class it is used to define the tree
    TreeNode root;

    public exam
    () {
        root = null;
    }

    //printing the tree using inorder os the tree is printed properly
    public void print() {
        printInorder(root);
    }
    public void printInorder(TreeNode node) {
        if (node != null) {
            printInorder(node.left);
            System.out.println(node.key);
            printInorder(node.right);
        }
    }


    //using recursion to insert for each node we are checking the value and arranging it properly
    public void insert(int key) {
        root = insertRecursive(root, key);
    }
    public TreeNode insertRecursive(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        if (key < root.key){
            root.left = insertRecursive(root.left, key);
        } else if (key > root.key) {
            root.right = insertRecursive(root.right, key);
        }return root;
    }


    //fo rdeleting we are using recursion to find the key value and remove the elemnt according to it
    public void delete(int key) {
        root = deleteRecursive(root, key);
    }
    public TreeNode deleteRecursive(TreeNode root, int key) {
        if (root == null) {
        return root;
        }
        if (key < root.key){
            root.left = deleteRecursive(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRecursive(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.key = minValue(root.right);
            root.right = deleteRecursive(root.right, root.key);
        }
        return root;
    }


    //using min value to delete ndoes and then rearrange.
    public int minValue(TreeNode root) {
        int minval = root.key;
        while (root.left != null) {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }


    //for searching we are using recursion we check for thw roots by going in the diretction of that value
    public boolean search(int key) {
        return searchRecursive(root, key);
    }
    public boolean searchRecursive(TreeNode root, int key) {
        if (root == null){ 
            return false; 
        } if (root.key == key){ 
            return true;
        }if (root.key < key){
            return searchRecursive(root.right, key);
        }
        return searchRecursive(root.left, key);
    }
    

    //diameter thru recursion. using left height anf right height and choosing max to find diameter 
    public int diameter() {
        return diameterRecursive(root);
    }
    public int diameterRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int leftDiameter = diameterRecursive(root.left);
        int rightDiameter = diameterRecursive(root.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    //using height to find diameter
    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    //main method
    public static void main(String[] args) {
        exam
         bst = new exam
        ();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.print();
        System.out.println();

        bst.delete(30);
        bst.print();
        System.out.println();

        System.out.println("key 40? " + bst.search(40)); //searching
        System.out.println("key 30? " + bst.search(30));
        System.out.println("diameter " + bst.diameter()); 
    }
}