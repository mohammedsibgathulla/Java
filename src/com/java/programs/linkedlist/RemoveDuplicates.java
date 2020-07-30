package com.java.programs.linkedlist;

public class RemoveDuplicates {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

		public static void removeDuplicates(Node head) {
			Node curr = head;

			while (curr != null) {
				Node temp = curr;
				System.out.println("temp data"+temp.data);
				System.out.println("curr data"+curr.data);
				System.out.println("From ouside"+temp);
				while (temp != null && temp.data == curr.data) {
					temp = temp.next;
					System.out.println("from inside"+temp);
				}
				curr.next = temp;
				curr = curr.next;
			}
		}

		public static void printLinkedList(Node head) {
			while (head != null) {
				System.out.println(head.data);
				head = head.next;
			}
		}
	

	public static void main(String[] args) {
		 Node n1 = new Node(23);
	        Node n2 = new Node(29);
	        Node n3 = new Node(29);
	        Node n4 = new Node(45);
	        Node n5 = new Node(45);
	        Node n6 = new Node(45);
	        Node n7 = new Node(54);
	        n1.next = n2;
	        n2.next = n3;
	        n3.next = n4;
	        n4.next = n5;
	        n5.next = n6;
	        n6.next = n7;
	 
	        System.out.print("Initial linked list data: ");
	        printLinkedList(n1);
	        removeDuplicates(n1);
	        System.out.println();
	        System.out.print("Linked list data after removing duplicates: ");
	        printLinkedList(n1);
	}
}
