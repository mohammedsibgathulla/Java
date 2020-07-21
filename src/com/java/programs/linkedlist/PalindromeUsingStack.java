package com.java.programs.linkedlist;

import java.util.Stack;

public class PalindromeUsingStack {
	static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
		}
	}
	
	public static boolean isPalindrome(Node head) {
		Stack<Integer> stack = new Stack<>();
		Node tempNode = head;
		
		while(tempNode != null) {
			stack.push(tempNode.data);
			tempNode = tempNode.next;
		}
		
		while(head != null) {
			if(head.data != stack.pop())
				return Boolean.FALSE;
			head = head.next;
		}
		return Boolean.TRUE;
	}
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(10);
		Node n4 = new Node(20);
		Node n5 = new Node(10);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		System.out.println("Palindrome: "+isPalindrome(n1));
	}
}
