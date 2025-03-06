//8. Java Program to Find GCD of two Numbers
// Write a java program to find GCD of two number?

import java.util.*;

class GCD
{
	void gcd(int a,int b){
		int rem;
		while(b!=0){
			rem=a%b;
			a=b;
			b=rem;	
		}
		System.out.print("The value of GCD: "+a);
	}
}

class Q8{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int x=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int y=sc.nextInt();
		GCD obj=new GCD();
		obj.gcd(x,y);

	}
}