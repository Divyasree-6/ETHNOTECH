//polymorphism example
/* class User
{
	void pay()
	{
		System.out.print("not intrested to go out");
	}
}
class Auto extends User{
	int amount=5000;
	@Override
	void pay()
	{
		if(amount<100)
		{
			System.out.print("raid accepted by Auto");
		}
	}
}
class Cab extends User{
	int amount=500;
	@Override
	void pay()
	{
		if(amount<100)
		{
			System.out.print("raid accepted by Cab");
		}
		
	}
}
class Bike extends User{
	int amount=80;
	@Override
	void pay()
	{
		if(amount<100)
		{
			System.out.println("raid accepted by Bike");
		}
		
	}
}
class Polymorphism
{
	public static void main(String[] args)
	{
		Cab c=new Cab();
		Auto a=new Auto();
		Bike b=new Bike();
		c.pay();
		a.pay();
		b.pay();
	}

}

		
		
		 */
class Polymorphism{
	public static void main(String[] args)
	{
		int[] arr={1,1,3,4};
		String[] arr2={"divya",new String("divya"),"anu"};
		System.out.println(arr[0]==arr[1]);
		
		System.out.println(arr2[0]==arr2[1]);
	}
}
