package com.java.programs.linkedlist;

public class RemoveLastNode {
	 // Link list node / 
	static class Node {
		int data;
		Node next;
		Node prev;
		Node() {
			
		}
		Node(int data) {
			this.data = data;
		}
	}
	// Function to remove the last node 
    // of the linked list / 
	static Node removeLastNode(Node head) {
		if (head == null || head.next == null) {
			return null;
		}
		
		// Find the second last node 
		Node second_last = head;
		while (second_last.next.next != null) {
			second_last = second_last.next;
		}
		// Change next of second last 
		second_last.next = null;
		return head;

	}
	

	static void printLinkedList(Node head) {
		while (head != null) {
			System.out.println(head.data+" "+head.next);
			//System.out.println(head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
         
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


		System.out.println("Initial linked list : ");
		printLinkedList(n1);
		n1 = removeLastNode(n1);
		System.out.println("\nAfter removing last node");
		printLinkedList(n1);


	}
}
