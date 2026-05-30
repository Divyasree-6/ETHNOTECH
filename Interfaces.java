import java.util.*;
interface Upi
{
	void pay();
}
interface Cash
{
	void pay();
}
class Payments implements Upi,Cash
{
	int amount;
	int payable;
	Payments(int amount,int payable)
	{
		this.amount=amount;
		this.payable=payable;
		
	}
	public void pay()
	{
		amount=amount-payable;
		System.out.print("final amount"+amount);
	}
}
public class Interfaces
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		Payments obj=new Payments(k,500);
		obj.pay();
	}
}
