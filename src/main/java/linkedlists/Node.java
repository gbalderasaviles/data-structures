package linkedlists;

/**
 * A Node with a generic content and a pointer to the next node.
 * @author Gabriel Balderas.
 *
 * @param <T> Makes the node generic.
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
