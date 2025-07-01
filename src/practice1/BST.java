package practice1;

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

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);

        } else {
            root.right = insert(root.right, val);
        }

        return root;

    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);

        } else if (root.data == key) {
            return true;

        } else {

            return search(root.right, key);
        }

    }

    public static void inOrder(Node root) {
        if (root != null) {

            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);

        }
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // root.data = val
            // case 1: no child
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2: 1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3: 2 child
            Node successor = inOrderSuccessor(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);

        }
        return root;
    }

    public static Node inOrderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return  root;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Node root = null;

        for (int i : values) {
            root = insert(root, i);
        }

        inOrder(root);
        delete(root, 3 );
        inOrder(root);
    }
}
