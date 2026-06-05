class Doublylinkedlist<T>
{
	
	private static class Node<T> 
		{
			T data;
			Node<T> next;
			Node<T> prev;
			Node(T data) {
				this.data = data;
				this.prev = null;
				this.next=null;
			}
		}

		private Node<T> head = null;
		private Node<T> tail = null; 
		private Node<T> prev=null;
		private int size = 0;  
		public void add(T data)
		{
			Node<T> newnode=new Node<T>(data);
			if(head==null)
			{
				prev=null;
				head=newnode;
				tail=newnode;
			}
			else
			{
				prev=tail;
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
			System.out.println("null");
		}
		
		public void insertatfirst(T val)
		{
			Node<T> newnode=new Node<T>(val);
			head.prev=newnode;
			newnode.prev=null;
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
			current.next=newnode.prev;
			newnode.next=null;
		}
		/* public void insertAtPosition(T pos)
		{
			int val=500;
			Node<T> newnode=new Node<T>(val);
			Node<T> current=head;
			int count=1;
			while(count<pos)
			{
				current=current.next;
				count+=count+1;
			}
			newnode.next=current.next;
			current.next=newnode.prev;
			
		} */
		
		public static void main(String[] args)
		{
			Linkeddlists<Integer> d=new Linkeddlists<>();
			// Scanner sc=new Scanner(System.in);
			// while(sc.hasNext())
			// {
				
				
			// while(
			d.add(1);
			d.add(20);
			d.add(30);
			d.add(40);
			d.printlist();
			System.out.println();
			d.insertatfirst(90);
			d.printlist();
			System.out.println();
			d.insertatlast(900);
			d.printlist();
			//d.insertAtPosition(2);
			//d.printlist();
			
			

		
		}
}
	
