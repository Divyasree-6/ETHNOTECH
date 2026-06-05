/* //linkedlist
class Node
{
	int data;
	Node next;
	Node(int val)
	{
		this.data=val;
		this.next=null;
	}
}
class Linkeddlists
{
	public static void main(String[] args)
	{
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data +"->");
			current=current.next;
		}
		System.out.print("null");
	}
} */

class Linkeddlists<T>
{
	
	private static class Node<T> 
		{
			T data;
			Node<T> next;
			Node(T data) {
				this.data = data;
				this.next = null;
			}
		}

		private Node<T> head = null;
		private Node<T> tail = null; 
		private int size = 0;  
		public void add(T data)
		{
			Node<T> newnode=new Node<T>(data);
			if(head==null)
			{
				head=newnode;
				tail=newnode;
			}
			else
			{
				tail.next=newnode;
				tail=newnode;
				
			}
		}
		public void printlist()
		{
			Node<T> current=head;
			while(current!=null)
			{
				System.out.print(current.data +"->");
				current=current.next;
			}
			System.out.print("null");
		}
		public void insertatfirst(T val)
		{
			Node<T> newnode=new Node<T>(val);
			newnode.next=head;
			head=newnode;
		}
		public void insertatlast(T val)
		{
			Node<T> newnode=new Node<T>(val);
			Node<T> current=head;
			
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newnode;
			newnode.next=null;
		}
		
		public static void main(String[] args)
		{
			Linkeddlists<Integer> d=new Linkeddlists<>();
			d.add(1);
			d.add(20);
			d.add(30);
			d.add(40);
			d.printlist();
			d.insertatfirst(90);
			d.insertatlast(900);
			d.printlist();

		
		}
}
	
