package trees;

class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
            if(root == null){
               root = new Node(val);
               return root;
            }

            if(root.data > val) {
                //left subtree
              root.left =  insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }

            return root;

    }
    public static void inOrder(Node root) {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static Node delete(Node root, int val) {
        if(root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
           root.right = delete(root.right, val);
        } else {
            if(root.left == null && root.right == null) {
                return null;
            }
            if(root.left == null) {
                return root.right;
            }
            if(root.right == null) {
                return root.left;
            }

            Node su = inOrderSuccessor(root.right);
            root.data = su.data;
            root.right = delete(root.right, su.data);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node root) {
        while(root.left != null ) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int val: values) {
            root = insert(root, val);
        }

        inOrder(root);
        delete(root, 4);
        System.out.println();
        inOrder(root);
    }
}