//A stack implemented by the use of a linked list.
//This file contains a Link, LinkedList and Stack class


class Link{
	public int data;
	public Link next;

	public Link(int d){
		data = d;
	}

	public void displayLink(){
		System.out.println("Link contains: " + data);
	}

}



class LinkedList{
	private Link first;

	public LinkedList(){
		first = null;
	}

	public void insertFirst(int data){
		Link newLink = new Link(data);
		newLink.next = first;
		first = newLink;
	}

	public int deleteFirst(){
		if(!isEmpty()){
			Link temp = first;
			first = first.next;
			return temp.data;
		}
		else{
			return -1;
		}
	}

	public void displayList(){
		Link current = first;
		while(current != null){
			current.displayLink();
			current = current.next;
		}
	}

	public boolean isEmpty(){
		return first == null;
	}
}



class LinkStack{
	private LinkedList stack;

	public LinkStack(){
		stack = new LinkedList();
	}

	public void push(int data){
		stack.insertFirst(data);
	}

	public int pop(){
		return stack.deleteFirst();
	}

	public boolean isEmpty(){
		return stack.isEmpty();
	}

	public void displayStack(){
		stack.displayList();
	}
}
