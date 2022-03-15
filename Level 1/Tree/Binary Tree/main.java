import java.util.*;

class Main {
    // Binary Tree Class
    public static class Node {
        int val;
        Node left;
        Node right;

        Node() {
        }

        Node(int val, Node left, Node right) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair() {
        }

        Pair(Node node, int state) {
            this.state = state;
            this.node = node;
        }
    }

    public static Node Construct(Integer[] arr) {
        if (arr.length == 0) {
            return new Node();
        }

        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);
        int i = 1;
        while (i < arr.length) {
            Pair top = st.peek();
            if (top.state == 1) {
                // left
                if (arr[i] != null) {
                    Node left = new Node(arr[i], null, null);
                    top.node.left = left;

                    Pair lp = new Pair(left, 1);
                    st.push(lp);
                }
                i++;
                top.state++;
            } else if (top.state == 2) {
                // right
                if (arr[i] != null) {
                    Node right = new Node(arr[i], null, null);
                    top.node.right = right;

                    Pair rp = new Pair(right, 1);
                    st.push(rp);
                }
                i++;
                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node root) {
        if (root == null)
            return;

        if (root.left != null) {
            System.out.print(root.left.val + " -> ");
        } else {
            System.out.print(". -> ");
        }

        System.out.print(root.val);

        if (root.right != null) {
            System.out.print(" <- " + root.right.val);
        } else {
            System.out.print(" <- .");
        }

        System.out.println();

        display(root.left);
        display(root.right);
    }

    public static int size(Node root) {
        if(root == null) {
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }

    public static int sum(Node root) {
        if(root == null) return 0;
        return sum(root.left) + root.val + sum(root.right);
    }

    public static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(max(root.left), Math.max(max(root.right), root.val));
    }

    public static int height(Node root) {
        if(root == null) return -1;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void preorder(Node root) {
        if(root == null) return;
        // pre
        System.out.print(root.val + " ");
        preorder(root.left);
        // in
        preorder(root.right);
        // post
    }

    public static void inorder(Node root) {
        if(root == null) return;
        // pre
        inorder(root.left);
        // in
        System.out.print(root.val + " ");
        inorder(root.right);
        // post
    }

    public static void postorder(Node root) {
        if(root == null) return;
        // pre
        postorder(root.left);
        // in
        postorder(root.right);
        // post
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 57, null, null };
        Node root = Construct(arr);
        // display(root);
        System.out.println("Size :" + size(root));
        System.out.println("Sum : " + sum(root));
        System.out.println("Height : " + height(root));
        System.out.println("Max : " + max(root));
        System.out.println("Preorder : ");
        preorder(root);
        System.out.println();
        System.out.println("Inorder : ");
        inorder(root);
        System.out.println();
        System.out.println("Postorder : ");
        postorder(root);
        System.out.println();
    }
}