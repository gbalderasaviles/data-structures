package linkedlists;

public class SinglyLinkedList<T> {

	Node<T> head;

	/**
	 * Creates a non empty Linked List.
	 * @param headItem The head Node.
	 */
	public SinglyLinkedList(T headItem) {
		head = new Node<T>(headItem);
	}

	/**
	 * Traverses the Linked List.
	 * @return The last Node.
	 */
	public Node<T> traverse() {
		Node<T> tempNode = head;
		while (tempNode.getNextNode() != null) {
			tempNode = tempNode.getNextNode();
		}
		return tempNode;
	}

	/**
	 * Adds a node at the end of the Linked List.
	 * @param item The contents of the last Node.
	 */
	public void addNode(T item) {
		Node<T> newNode = new Node<>(item);
		Node<T> lastNode = traverse();
		lastNode.setNextNode(newNode);
	}

	/**
	 * Finds and returns a node with the given contents.
	 * @param item The contents of the desired Node.
	 * @return The desired Node.
	 */
	public Node<T> findNode(T item) {
		Boolean nodeFound = false;
		//Check head first.
		Node<T> tempNode = head;
		if (tempNode.getNodeItem().equals(item)) {
			nodeFound = true;
			return tempNode;
		}
		else {
			//If head didn't meet criteria, check the next nodes.
			while (tempNode.getNextNode() != null) {
				tempNode = tempNode.getNextNode();
				if (tempNode.getNodeItem().equals(item)) {
					nodeFound = true;
					break;
				}
			}
			//Review the node returned after traversing the list.
			if (nodeFound) {
				System.out.println("Node found.");
			} else {
				System.out.println("Node not found.");
				tempNode = null;
			}
			return tempNode;
		}
	}
	
	/**
	 * Adds a node after the desired location.
	 * @param item The contents of the Node after which the new Node will be added.
	 */
	public void addNodeAfter(T item) {
		Node<T> tempNode = findNode(item);
		if (tempNode != null) {
			Node<T> newNode = new Node<>(item);
			Node<T> oldNextNode = tempNode.getNextNode();
			newNode.setNextNode(oldNextNode);
			tempNode.setNextNode(newNode);
			System.out.println("Node found.");
		} else {
			System.out.println("Unable to find desired node after which to add.");
		}
	}
	
	/**
	 * Deletes the desired node if found.
	 * @param item The contents of the node to delete.
	 */
	public void deleteNode(T item) {
		Node<T> tempNode = head;
		Node<T> previousNode;
		Boolean nodeFound = false;
		while (tempNode.getNextNode() != null) {
			previousNode = tempNode;
			tempNode = tempNode.getNextNode();
			if (tempNode.getNodeItem().equals(item)) {
				previousNode.setNextNode(tempNode.getNextNode());
				tempNode = tempNode.getNextNode();
				nodeFound = true;
			}
		}
		if (nodeFound) {
			System.out.println("Node deleted.");
		} else {
			System.out.println("Node not found");
		}
	}
}
