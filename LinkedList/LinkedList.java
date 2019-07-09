package org.javaguru.single.lisklist;

/*
 * Linked list is a chained list of nodes where headerNode always points to the top
 * element/ starting element of list. every node has one value and address to the next node
 * if address of next node is null. means this is last element of Linked list.
 * we traverse to list using while loop where we check for last node (next address null)
 * 
 * 
 * 
 * Add element to end of linked list
 * Add element to start of linked list
 * Add element to a particular position in linked list
 * Delete element from linked list
 * Find element in linked list
 * print elements of linked list
 * 
 * */
 class LinkedList {
	 
	 private Node head = null;
	 
	 public LinkedList () {
		 
	 }

	/*
	 * Check if list is empty, there is no element in list. create a node and assign it to the header node.
	 * If its a non empty list then find last node and put address of this node in that last node. this node will be added to
	 * the last position of linked list.
	 * 
	 */
	public void add(Node node) {
		
		if(this.head == null) {
			head = node;
			
		}
		else {
			Node tempNode = head;
			while(tempNode.getAddressOfNextNode() != null) {
				tempNode = tempNode.getAddressOfNextNode();
			}
			tempNode.setAddressOfNextNode(node);
		}
	
		}
	
	public void addStart(Node node) {
		
		if(this.head == null) {
			head = node;			
		}
		else {
			
			node.setAddressOfNextNode(head);
			head = node;
		}}
	/*
	 * it will replace element at that location
	 * */
	public void addToPostion(Node node, int postion) {
		Node next = null;
		Node previous = head;
		int i = 0;
		if(this.head == null) {
			head = node;			
		}
		else if(this.size() <postion ) {
			System.out.println("Passed index is greater than list size element can't be added");
		}
		while(i<postion-1) {
				
			previous = previous.getAddressOfNextNode();
			i++;
			}
		    next = previous.getAddressOfNextNode();
			previous.setAddressOfNextNode(node);
			node.setAddressOfNextNode(next);
		}
	

	public void printList(LinkedList linkedList) {
	    Node temp = this.head;
		while(temp != null) {
			 
			System.out.println(temp.getValueOfNode() +" ");
			temp = temp.getAddressOfNextNode();
		}
		
	}
	
	public int find(Node node) {
		int postion= 0;
		Node temp = this.head;
		if(this.head == null) {
			System.out.println("List is empty");
		}
		while(temp.getAddressOfNextNode()  != null) {
			temp = temp.getAddressOfNextNode();
			postion++;
			if(temp.getValueOfNode() == node.getValueOfNode()) {
				return postion;
			}
			
		}
		return -1;
	}
	//[1,3,5,2,9,45,34,23]
	//[0,1,2,3,4,,5,,6,,7]
	public LinkedList deleteAtPostion(int position) {
		
		Node next = null;
		Node previous = this.head;
		int i=0;
		if(position>this.size())
		{
			System.out.println("Index passed is larger than list size");
		}
		else if(position == 0) {
			previous = previous.getAddressOfNextNode();
			this.head = previous;
		}
		while (i<position-1) {
			previous = previous.getAddressOfNextNode();
			i++;
		}
		
		next = previous.getAddressOfNextNode().getAddressOfNextNode();
		previous.setAddressOfNextNode(next);
		return this;
	}
	
	public int size() {
		Node temp = this.head;
		int size=1;
		while(temp.getAddressOfNextNode() != null) {
			size++;
			temp = temp.getAddressOfNextNode();
		
			}
		
		return size;
	}
	
	
	
}
