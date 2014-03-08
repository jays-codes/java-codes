package ph.zai.util;

import java.util.Iterator;


public class FIFOQueue<Item> {

	int queueCount = 0;
	Node first;
	Node last;

	private class Node {
		Item item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return queueCount;
	}

	public void enqueue(Item item) {
		queueCount++;

		Node oldLast = last;
		last = new Node();
		last.item = item;
		if (isEmpty()) {
			first = last;
		} else
			oldLast.next = last;
	}

	public Item dequeue() {
		if (isEmpty())
			return null;
		Item item = first.item;
		first = first.next;
		queueCount--;
		if (isEmpty())
			last = null;
		return item;
	}

	public Iterator<Node> iterator() {
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Node> { // Support

		int i = queueCount;

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
		return "queue contains " + size() + " item(s) : " + str;

	}
}
