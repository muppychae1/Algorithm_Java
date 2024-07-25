import java.io.*;
import java.util.*;

public class Main {

    static Node root = new Node(null, 'A', null);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main (String[] args) throws IOException {

        // 트리 노드의 개수 N
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            char parent = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            insertNode(root, parent, left, right);
        }

        preorder(root);
        bw.write("\n");
        inorder(root);
        bw.write("\n");
        postorder(root);

        bw.flush();
        bw.close();
        br.close();

    }

    public static class Node {
        Node left;
        char value;
        Node right;

        public Node (Node left, char value, Node right) {
            this.left = left;
            this.value = value;
            this.right = right;
        }
    }

    public static void insertNode(Node root, char parent, char left, char right) {
        if(root.value == parent) {
            root.left = (left == '.'? null : new Node(null, left, null));
            root.right = (right == '.' ? null : new Node(null, right, null));
        }
        else {
            if(root.left != null) insertNode(root.left, parent, left, right);
            if(root.right != null) insertNode(root.right, parent, left, right);
        }
    }

    public static void preorder(Node root) throws IOException {
        bw.write(root.value);
        if(root.left != null) {
            preorder(root.left);
        }
        if(root.right != null) {
            preorder(root.right);
        }
    }

    public static void inorder(Node root) throws IOException {
        if(root.left != null) {
            inorder(root.left);
        }
        bw.write(root.value);
        if(root.right != null) {
            inorder(root.right);
        }
    }

    public static void postorder(Node root) throws IOException {
        if(root.left != null) {
            postorder(root.left);
        }
        if(root.right != null) {
            postorder(root.right);
        }
        bw.write(root.value);
    }

}