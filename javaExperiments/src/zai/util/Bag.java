package zai.util;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>{

	Node first;
	
	public class Node{
		Item item;
		Node next;
		
	}
	
	public void add(Item item){
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
	}
	
	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator<Item>{
		Node current =  first;
		public boolean hasNext(){
			return first==null;
		}
		
		public void remove(){}
		public Item next(){
			Item item = current.item;
			current = first.next;
			return item;
		} 
	}
}
