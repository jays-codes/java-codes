package ph.zai.util;

import java.util.Iterator;

public class LinkedListStack<Item> {
	private Node first = null;
	private int nodeCount = 0;

	private class Node {
		Item item;
		Node next;
	}

	public void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		nodeCount++;
	}

	public Item pop() {
		Item poppedItem = first.item;
		first = first.next;
		nodeCount--;
		return poppedItem;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return nodeCount;
	}

	public Iterator<Node> iterator() {
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Node> { // Support

		int i = nodeCount;

		public boolean hasNext() {
			return i > 0;
		}

		public Node next() {
			return first.next;
		}

		public void remove() {
			i--;
		}
	}

	public String toString() {
		Node node = first;

		String str = "\n" + first.item + "\n";

		while (!(node.next == null)) {
			node = node.next;
			str = str + node.item + "\n";
		}
		return "stack contains " + size() + " item(s) : " + str;

	}
}
