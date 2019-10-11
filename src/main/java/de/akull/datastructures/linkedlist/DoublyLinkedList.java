
//A doubly linked list that is also double-ended

class Link{
	public int data;
	public Link next;
	public Link previous;

	public Link(int d){
		data = d;
	}

	public displayLink(){
		System.out.println("Data: " + data);
	}
}


class DoublyLinkedList{

	private Link first;
	private Link last;

	public DoublyLinkedList(){
		first = null;
		last = null;
	}

	public boolean isEmpty(){
		return first == null;
	}

	public void insertFirst(int data){
		Link newLink = new Link(data);

		if(isEmpty()){
			last = newLink;
		}
		else{
			first.previous = newLink;
		}
		newLink.next = first;
		first = newLink;
	}

	public void insertLast(int data){
		Link newLink = new Link(data);
		if(isEmpty){
			first = newLink;
		}
		else{
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}


	public Link deleteFirst(){
		//Assuming a non-empty list
		Link temp = first;
		if(first.next == null){
			last = null;
		}
		else{
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}

	public Link deleteLast(){
		Link temp = last;

		//if only one item in list
		if(first.next == null){
			first = null;
		}
		else{
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}

	public boolean insertAfter(int key, int data){
		Link current = first;

		while(current.data != key){
			current = current.next;

			//didn't find the link
			if(current == null){
				return false;
			}
		}

		Link newLink = new Link(data);

		if(current == last){
			newLink.next = null;
			last = newLink;
		}
		else{
			newLink.next = current.next;
			current.next.previous = newLink;
		}

		newLink.previous = current;
		current.next = newLink;
		return true;
	}

	public Link deleteKey(int key){
		Link current = first;

		while(current.data != key){
			current = current.next;
			if(current == null){
				return null;
			}
		}

		if(current == first){
			first = current.next;
		}
		else{
			current.previous.next = current.next;
		}

		if(curent == last){
			last = current.previous;
		}
		else{
			current.next.previous = current.previous;
		}

		return current;
	}


	public void displayForward(){
		Link current = first;

		while(current != null){
			current.displayLink();
			current = current.next;
		}
	}


	public void displayBackward(){
		Link current = last;
		while(current != null){
			current.displayLink();
			current = current.previous;
		}
	}

}
