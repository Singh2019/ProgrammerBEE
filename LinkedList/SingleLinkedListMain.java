package org.javaguru.single.lisklist;

public class SingleLinkedListMain {
      public static void main(String [] args ) {
    	  
    	  LinkedList linkedList = new LinkedList();
    	  Node node1 = new Node(10);
    	  Node node2 = new Node(20);
    	  Node node3 = new Node(30);
    	  Node node4 = new Node(40);
    	  Node node5 = new Node(50);
    	  Node node6 = new Node(120);
    	  linkedList.add(node1);
    	  linkedList.add(node2);
    	  linkedList.add(node3);
    	  linkedList.add(node4);
    	  linkedList.printList(linkedList);
    	  System.out.println("************************************************************************");
    	  linkedList.addStart(node5);
    	  linkedList.printList(linkedList);
    	  System.out.println("************************************************************************");
    	  linkedList.addToPostion(node6, 2);
    	  linkedList.printList(linkedList);
    	  System.out.println("************************************************************************");
    	  int postion = linkedList.find(node2);
    	  System.out.println("Element is found at postion  " +postion);
    	  System.out.println("************************************************************************");
    	  LinkedList list = linkedList.deleteAtPostion(2);
    	  linkedList.printList(list);
    	  int size = linkedList.size();
    	  System.out.println("size of linked list   " +size);
      }
}
