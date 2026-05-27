import java.util.*;
class Pa
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
			