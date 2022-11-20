package Day19Nov2022;

public class SinglyLinkedList {

	Node head, tail; // head-first item & tail -last item
	int length = 0;

	public void add(int input) {

		if (head == null) {
			Node temp = new Node(input);
			head = temp;
			tail = temp;
		} else {
			Node temp = new Node(input);
			tail.next = temp; // next node references
			tail = temp;// move to tail to new node
		}

		length++;
	}

	public int size() {
		return length;
	}

	public void print() {
		Node temp = head; // it has the entire linked list
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}

	}

	public void removeFirst() {

		if (length == 1)
			head = tail = null;
		else {
			head = head.next; // Remove the first item

		}
		length--;

	}

	public int get(int value) {
		Node temp = head; // entire linked list

		while (temp != null) {

			if (temp.value == value) {
				return temp.value;

			}
			temp = temp.next;
		}
		return -1;
	}

	public boolean set(int index, int value) {
		Node temp = head; // entire linked list
		int nodeposition = 0;
		while (temp != null) {
			if (nodeposition == index) {
				temp.value = value;
				return true;
			}
			temp = temp.next;
			nodeposition++;

		}
		return false;

	}

	public void remove(int index) { // 1 , 2, 3,
		Node temp = head;
		while (temp != null) {
			if (temp.value == index) {
				temp = temp.next.next;
				length--;

			} else {
				temp = temp.next;
			}

		}

	}

	public void insert(int input) {
		Node temp = new Node(input); // Adding new value to the temp

		if (head == null) { // if head is null, then assign head = new node means new value
			head = temp;
		} else {
			tail = head; // if head is not null assign head = tail iterate through end of the list
			while (tail.next != null) {
				tail = tail.next; // tail->next become null then storing new value to the tail.next
			}
			tail.next = temp;
		}
		length++;
	}

	public void removeEnd() {
		Node temp = head;
		while (temp.next != tail) { // iterate through until temp.next !=tail
			temp = temp.next;
		}

		temp.next = null;
		temp = tail;
		length--;

	}

	public void removeSpecificIndex(int index) {
		Node temp = head;
		while (temp != null && temp.next != null) {
			if (temp.next.value == index) {
				temp.next = temp.next.next;

			}
			temp = temp.next;
		}

		length--;
	}
		public int getIndexOf(int index) {
			Node temp = head;
			int nodeposition = 0;
			while (temp != null) {
			   if(temp.value == index ) {
				   return nodeposition;
			   }
			   temp = temp.next;
			   nodeposition++;
			 }
			return -1;
		}
		
		public int getLastIndex(int index) {
			Node temp = head;
			int nodeposition = 0;
			int tempIndex =-1;
			while (temp != null) {
			   if( temp.value == index ) {
				   tempIndex = nodeposition;
			   }
		       temp = temp.next;
			   nodeposition++;
		}
			return tempIndex;
		}

	/*
	 * public void insertMiddle(int index, int input) { Node temp = new Node(input);
	 * // Adding new value to the temp int nodeposition = 0; if (head == null) { //
	 * if head is null, then assign head = new node means new value head = temp; }
	 * else { tail = head; // if head is not null assign head = tail iterate through
	 * end of the list while (tail.next != null) { if (nodeposition == index) {
	 * tail.next = temp; } }
	 * 
	 * tail = tail.next; } length++; }
	 */

}
