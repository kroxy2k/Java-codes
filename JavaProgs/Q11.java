//11.Java Program to Calculate the Power of a Number
import java.util.*;

class power_number
{
	void power(int a,int b)
	{
		System.out.print("The power of that number: "+(int) Math.pow(a,b)); 
	
	}
}
class Q11
{
	public static void main(String []a)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the value of x: ");
		int x=sc.nextInt();
		System.out.print("Enter the value of y: ");
		int y=sc.nextInt();
		
		power_number obj=new power_number();
		obj.power(x,y);
	
	}
}
