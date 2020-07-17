package com.java.programs.linkedlist;

public class ListMiddleElement {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

		public static void printLinkedList(Node head) {
			while (head != null) {
				System.out.println(head.data);
				head = head.next;
			}
		}

		static void findMiddleElementV1(Node head) {
			/**
			 * In this method, first we get the element count by traversing through the
			 * linked list. Then we identify middle element index by count. Then traverse
			 * through linked list nodes based on count.
			 */

			int count = 0;
			Node countNode = head;
			while (countNode != null) {
				countNode = countNode.next;
				count++;
			}
			count = count / 2;
			while (head != null) {
				head = head.next;
				count--;
				if (count == 0) {
					System.out.println("Middle Element: " + head.data);
					return;
				}
			}
		}
		
		static void findMiddleElementV2(Node head) {
		       /**
	         * In this approach, we will have two node references. 
	         * First node, we increment by two steps
	         * Second node, we increment ny one step.
	         * At the end we get the middle element ny second node.
	         */
			
			Node singleIncNode = head;
			Node doubleIncNode = head;
			
			while(doubleIncNode != null && doubleIncNode.next != null) {
				doubleIncNode = doubleIncNode.next.next;
				singleIncNode = singleIncNode.next;
			}
			System.out.println("Middle Element: "+singleIncNode.data);
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

			printLinkedList(n1);
			findMiddleElementV1(n1);
			findMiddleElementV2(n1);
		}
	}

}
