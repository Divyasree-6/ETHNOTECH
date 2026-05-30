import java.util.*;
/*class Inheritances{
	
	int add(int value)
	{
		int c=10;
		return value+c;
	}
	
}
class Child extends Inheritances{
	void send(int b )
	{
		int d=super.add(b);//to access parent class methods inside child using super
		System.out.print(d);
	}
	
}
class Inheritance{
	public static void main(String[] args)
	{
		Child obj=new Child();//create onject for child and access parent methods through this
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		obj.send(b);
		System.out.println(obj.add(100));//directly calling parent methods
		
	}
}

//second example
class Employee
{
	int id;
	public int salary;
	void Print(int id,int salary)
	{
		System.out.println(+id +" "+salary);
	}
}
class Inheritance extends Employee{
	void Prints()
	{
		System.out.println("hello parent");
	}
	public static void main(String[] args)
	{
		Inheritance obj=new Inheritance();
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		int salary=sc.nextInt();
		obj.Print(id,salar
		y);
		obj.Prints();
		System.out.println(obj.id);
	}
}*/

//third example
class Account {
    protected double amount;

    void deposit(double value) {
        amount = amount + value;
    }

    void withdraw(double value) {
        amount = amount - value;
    }

    double getBalance() {
        return amount;
    }
}

class Display extends Account {
    void showAmount() {
        System.out.println("Available Amount: " + getBalance());
    }
}
public class Inheritance {
    public static void main(String[] args) {

        Display d = new Display();

        d.deposit(50000);
        d.showAmount();

        d.withdraw(10000);
        d.showAmount();

        System.out.println("Final Balance: " + d.getBalance());
    }
}




	

