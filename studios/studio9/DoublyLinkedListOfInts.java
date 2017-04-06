package studio9;

import java.util.Iterator;

public class DoublyLinkedListOfInts implements IntList {
	
	private ListItem head, tail;
	private int size;
	
	public DoublyLinkedListOfInts() {
		ListItem sentinelHead = new ListItem(666666, null, null);
		ListItem sentinelTail = new ListItem(777777, null, null);
		
		sentinelHead.setNext(sentinelTail);
		sentinelTail.setPrev(sentinelHead);
		this.head = sentinelHead;
		this.tail = sentinelTail;
		this.size = 0;
		
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFirst(int item) {
		ListItem n = new ListItem(item, this.head.getNext(), this.head);
		this.head.setNext(n);
		n.getNext().setPrev(n);
	}

	@Override
	public void addLast(int item) {
		ListItem n = new ListItem(item, this.tail, this.tail.getPrev());
		this.tail.setPrev(n);
		n.getPrev().setNext(n);

	}

	@Override
	public int size() {
		int ans = 0;
		for (ListItem p = this.head.getNext(); p != this.tail; p = p.getNext()) {
			ans = ans + 1;
		}
		return ans;
	}

	@Override
	public int indexOf(int item) {
		int ans = 0;
		for (ListItem p = this.head.getNext(); p != this.tail; p = p.getNext()) {
			if (p.getValue() == item)
				return ans;
			++ans;
		}
		return -1;
	}

	@Override
	public boolean remove(int item) {
		for (ListItem p = this.head; p.getNext() != this.tail; p = p.getNext()) {
			if (p.getNext().getValue() == item) {
				p.setNext(p.getNext().getNext());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString() {
		String ans = "[";
		for (ListItem p = this.head.getNext(); p != this.tail; p = p.getNext()) {
			ans = ans + p.getValue() + " ";
		}
		ans = ans + "]";
		return ans;
	}

}
