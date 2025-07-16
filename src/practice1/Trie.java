package practice1;

class Trie {

    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }

            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
            if (i == word.length() - 1 && !curr.eow) {
                return false;
            }

        }
        return true;
    }

    public static void printAllWords(Node node, StringBuilder word) {
        if (node.eow) {
            System.out.println(word.toString());
        }

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                word.append((char) (i + 'a'));
                printAllWords(node.children[i], word);
                word.deleteCharAt(word.length() - 1); // backtrack
            }
        }
    }

    public static void main(String[] ignoredArgs) {
        String[] words = {"there", "then", "any", "hello"};

        for (String w : words) {
            insert(w);
        }

        boolean s = search("any");
        System.out.println(s);
        printAllWords(root, new StringBuilder());
    }
}
