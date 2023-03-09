package org.example;

public class Main {
    public static void main(String[] args) {
        Node root = null;
        AVLTree tree = new AVLTree();
        root = tree.insert(root, 6);
        root = tree.insert(root, 3);
        root = tree.insert(root, 5);
        root = tree.insert(root, 4);
        root = tree.insert(root, 2);
        preOrder(root);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}