package com.practice.demo;

import java.util.Objects;

public class LinkedList {

	public static void main(String[] args) {

		Node n1 = new Node(7);
		Node n2 = new Node(5);
		n1.next = n2;
		Node n3 = new Node(9);
		n2.next = n3;
		Node n4 = new Node(6);
		n3.next = n4;
		n4.next = null;

		Node output = findNode(6, n1);

		if (Objects.isNull(output)) {
			System.out.println("Not Presented");
		} else

			System.out.println("Presented " + output.value);

	}

	private static Node findNode(int i, Node n) {
		int valueToSearch = i;
		
		if (Objects.isNull(n.next == null)) {
			if (n.value == valueToSearch)
				return n;
		} else {

			while (!Objects.isNull(n.next)) 
			{
				
				if (n.value == valueToSearch)
				{
					return n;
				} else
					n = n.next;
			}

		}
		return null ;

	}

}
