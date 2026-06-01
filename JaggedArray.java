import java.util.*;
class JaggedArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][];
		arr[0]=new int[5];
		arr[1]=new int[5];
		arr[2]=new int[5];
		System.out.println("intialization");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("intialization of enter 5 values:" +i);
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("printing");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Marks of student:"+i);
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}

