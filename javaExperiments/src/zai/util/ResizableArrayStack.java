package zai.util;

import java.util.Arrays;
import java.util.Iterator;

public class ResizableArrayStack<Item> {

	/*
	 * push(), pop(), size(), isEmpty()
	 */
	private Item[] arrStack = (Item[]) new Object[1];
	private int currIdx = 0;

	public void push(Item str) {
		if (currIdx == arrStack.length)
			resize(2 * arrStack.length);

		arrStack[currIdx] = str;
		currIdx++;
	}

	public Item pop() {
		if (currIdx - 1 == -1)
			return null;
		currIdx--;
		Item retStr = arrStack[currIdx];
		arrStack[currIdx] = null;

		if (currIdx == arrStack.length / 4)
			resize(arrStack.length / 2);
		return retStr;
	}

	public boolean isEmpty() {
		return currIdx == 0;
	}

	public int size() {
		return currIdx;
	}

	private void resize(int newSize) {
		Item[] temp = (Item[]) new Object[newSize];
		for (int i = 0; i < currIdx; i++) {
			temp[i] = arrStack[i];
		}

		arrStack = temp;
	}

	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Item> { // Support
																	// LIFO
																	// iteration.
		private int i = currIdx;

		public boolean hasNext() {
			return i > 0;
		}

		public Item next() {
			return arrStack[--i];
		}

		public void remove() {
		}
	}

	public String toString() {
		return "stack contains " + size() + " item(s) : "
				+ Arrays.toString(arrStack);
	}
}
