package examples;

import linkedlists.Node;
import linkedlists.SinglyLinkedList;

/**
 * An example running the Singly Linked List.
 * @author Gabriel Balderas.
 *
 */
public class SinglyLinkedListExmaple {
	public static void main(String[] args) {
		//Creates a list.
		SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>(0);
		
		//Adds elements to the list.
		for (int i = 1 ; i <= 20 ; i++) {
			linkedList.addNode(i);
		}
		
		//Prints the list.
		linkedList.printList();
		
		//Verifies if a node with the given contents exists.
		Node<Integer> node = linkedList.findNode(4);
		System.out.println(node.getNodeItem());
		
		//Adds a node after it finds a Node containing the element 11.
		linkedList.addNodeAfter(11, 21);
		linkedList.printList();
		
		//Deletes node with the given contents.
		linkedList.deleteNode(21);
		linkedList.printList();
	}
}
