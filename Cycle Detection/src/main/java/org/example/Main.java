package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode nodetwo = new LinkedListNode(2);
        LinkedListNode nodeThree = new LinkedListNode(3);
        LinkedListNode nodeFour = new LinkedListNode(4);

        head.next = nodetwo;
        nodetwo.next = nodeThree;
        nodeThree.next = nodeFour;
        nodeFour.next = nodetwo;

        int result = haveCycle(head);
        System.out.println(result);
    }

    public static int haveCycle(LinkedListNode head) {
        if (head == null) return 0;
        LinkedListNode slow = head;
        LinkedListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return 1;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return 0;
    }
}
