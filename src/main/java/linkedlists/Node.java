package linkedlists;

/**
 * Node holding an object.
 * 
 * @author Gabriel Balderas
 */
public class Node<T> {

	private T item;
	private Node<T> nextNode;

	public Node(T item) {
		this.item = item;
	}

	public T getNodeItem() {
		return item;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}
}
