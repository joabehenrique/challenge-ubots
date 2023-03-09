package org.example;

public class Node {
    int value;
    Node left;
    Node right;
    int height;

    public Node(int val) {
        this.value = val;
        this.height = 0;
    }
}
