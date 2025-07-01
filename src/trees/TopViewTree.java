package trees;

import java.util.*;

class TopViewTree {
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
        if (val > root.data) {
            root.right = insert(root.right, val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public static void levelOrder(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> lvl = new LinkedList<>();

        lvl.add(root);
        lvl.add(null);

        while (!lvl.isEmpty()) {
            Node currNode = lvl.remove();
            if (currNode == null) {
                System.out.println();

                if (lvl.isEmpty()) {
                    break;
                } else {
                    lvl.add(null);
                }
            } else {
                System.out.print(currNode.data + ", ");
                if (currNode.left != null) {
                    lvl.add(currNode.left);
                }
                if (currNode.right != null) {
                    lvl.add(currNode.right);
                }
            }
        }
    }

    public static void topView(Node root) {
        if (root == null) return;

        class Pair {
            Node node;
            int hd;

            Pair(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> topViewMap = new TreeMap<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();

            if (!topViewMap.containsKey(curr.hd)) {
                topViewMap.put(curr.hd, curr.node.data);
            }

            if (curr.node.left != null) {
                q.add(new Pair(curr.node.left, curr.hd - 1));
            }

            if (curr.node.right != null) {
                q.add(new Pair(curr.node.right, curr.hd + 1));
            }
        }

        for (int i : topViewMap.values()) {
            System.out.println(i + " ");
        }
    }

    public static void leftView(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node curr = q.poll();

                if (i == 0) {
                    System.out.println(curr.data + " ");

                }
                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 6, 2, 1, 7, 6};
        int[] arr = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i : arr) {
            root = insert(root, i);
        }

        topView(root);
        System.out.println();
        leftView(root);
    }
}
