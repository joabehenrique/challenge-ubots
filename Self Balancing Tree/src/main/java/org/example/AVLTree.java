package org.example;

public class AVLTree {
    public Node insert(Node root, int newValue) {
        if (root == null) {
            return new Node(newValue);
        }
        if (newValue < root.value) {
            root.left = insert(root.left, newValue);
        } else {
            root.right = insert(root.right, newValue);
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int balance = leftHeight - rightHeight;
        if (balance > 1) {
            return newValue < root.left.value ? rightRotate(root) : doubleRightRotate(root);
        }
        if (balance < -1) {
            return newValue > root.right.value ? leftRotate(root) : doubleLeftRotate(root);
        }
        root.height = 1 + Math.max(leftHeight, rightHeight);
        return root;
    }

    private int height(Node node) {
        return node == null ? -1 : node.height;
    }

    private Node rightRotate(Node node) {
        Node leftChild = node.left;
        Node leftRightChild = leftChild.right;
        leftChild.right = node;
        node.left = leftRightChild;
        node.height = 1 + Math.max(height(node.left), height(node.right));
        leftChild.height = 1 + Math.max(height(leftChild.left), height(leftChild.right));

        return leftChild;
    }

    private Node leftRotate(Node node) {
        Node rightChild = node.right;
        Node rightLeftChild = rightChild.left;
        rightChild.left = node;
        node.right = rightLeftChild;
        node.height = 1 + Math.max(height(node.left), height(node.right));
        rightChild.height = 1 + Math.max(height(rightChild.left), height(rightChild.right));

        return rightChild;
    }

    private Node doubleRightRotate(Node node) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }

    private Node doubleLeftRotate(Node node) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }
}
