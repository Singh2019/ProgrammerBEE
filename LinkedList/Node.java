package org.javaguru.single.lisklist;

public class Node {
	
	private int valueOfNode;
	private Node addressOfNextNode;
	
	public Node(int valueOfNode) {
		this.valueOfNode = valueOfNode;
		
	}

	public int getValueOfNode() {
		return valueOfNode;
	}

	public void setValueOfNode(int valueOfNode) {
		this.valueOfNode = valueOfNode;
	}

	public Node getAddressOfNextNode() {
		return addressOfNextNode;
	}

	public void setAddressOfNextNode(Node addressOfNextNode) {
		this.addressOfNextNode = addressOfNextNode;
	}

}
