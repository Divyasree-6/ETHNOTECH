import java.util.*;
//star pattern right-angle
/*class St
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//start pattern pyramid
class St
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}*/
//switch case
class St{
	public static void main(String[] args)
	{
		int n=300;
		switch(n)
		{
			case 300:
			System.out.print("pay 100");
			break;
			case 200:
			System.out.print("no bill");
			break;
			case 1000:
			System.out.print("pay 200");
			break;
			default:
			System.out.print("no bill");
			
		}
	}
}
