import java.util.*;
class MyArrrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arlist=new ArrayList<>();
		int n=10;
		for(int i=0;i<n;i++)
		{
			arlist.add(i);
		}
		arlist.foreach((num)->{
			if(num>2)
			{
				System.out.print(num);
			}
		});
	}
}
