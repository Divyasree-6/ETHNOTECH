//recursive
class Factorial
{
	public static void main(String[] args)
	{
		int a=5;
		int facts=fact(a);
		System.out.print(facts);
	}
	
	static int fact(int num)
	{
		
		if(num<=1)
		{
			return 1;
		}
		return num*(fact(num-1));
	}
} 
//normal way
/* class Factorial
{
	public static void main(String[] args)
	{
		int i=5;
		int fact=1;
		while(i>0)
		{
			fact=fact*i;
			i--;
		}
		System.out.print(fact);
	}
	

}	
 */