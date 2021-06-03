import java.util.*;

// Here comes the NODE class
	
	public Stack()
	{
		top=null;
		length=0;
	}
	
	public int length()
	{
		return length;
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
	public void push()
	{
		System.out.println("Enter the element you want to push into the stack");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		
		ListNode temp=new ListNode(value);
		temp.next=top;
		top=temp;
		length++;
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Empty Stack!!");
		}
		else {
			int result=top.data;
			top=top.next;
			length--;
			System.out.println("Element popped is:" +result);
		}
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Empty Stack!!");
		}
		else {
			System.out.println("Top most data is:" +top.data);
		}
	}
	
	public static void main(String args[])
	{
		Stack st=new Stack();
		st.push();
		st.push();
		st.push();
		st.push();
		
		st.pop();
		st.peek();
	}
}
