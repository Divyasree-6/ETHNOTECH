import java.util.*;
/*class Pa
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		int a=sc.nextInt();
		int b=a;
		int rem=0;
		int rev=0;
		while(a>0)
		{
			rem=a%10;
			rev=(rev*10)+rem;
			a=a/10;
		}
		if(rev==b)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("n0");
		}
		
		
	}
}
class Pa{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4};
		int prod1=1;
		int product=1;
		for(int i=0;i<arr.length;i++)
		{
			product=1;
			for(int j=i+1;j<arr.length;j++)
			{	
				product*=arr[j];
				
			}
			
			int prodmain=product*prod1;
			System.out.println("value" +prodmain);
			prod1*=arr[i];
		}
	}
}



//encapsulation
class bank
{
	private int amount;
	private string name
	
	public void setAmount(int amount){
		this.amount=amount;
	}
	
	public int getAmount(){
		return amount;
	}
	
	
	public static void main(String[] args)
	{
		
		bank divya = new bank ();
		divya.setAmount(100);
		int l=divya.getAmount();
		System.out.print( );
		
	}
	
}

//bankbalance
class Pa
{
	private int balance;
	public void setId(int balance){
		this.balance=balance;
	}
	
	public int getId(){
		return balance;
	}
	public static void main(String[] args)
	{
		
		Pa d=new Pa();
		d.setId(32000);
		int l=d.getId();
		System.out.print(l);
		
	}
	
}
//Sets checkings practise
class Pa{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Set<Integer> d= new <>();
		System.out.print("enter n value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int k=sc.nextInt();
			d.add(k);
		}
		System.out.print(d);
		
	}
}
*/
//Second largest
class Pa{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int fl=arr[0];
		int sl=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>fl)
			{
				
				fl=arr[i];
				
			}
			
		}
		System.out.println(fl);
		System.out.println(sl);
	}
	
}
			


		
	