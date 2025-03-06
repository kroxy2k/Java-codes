//Write a java program to print Factorial of a given number. Use any loop.
import java.util.*;
class Fact
{
	void fact(int num){
		int i, f=1;
		System.out.print("Factorial: ");
		for(i=1;i<=num;i++){
			f*=i;
		}
		System.out.print(f);
	}
}
class Q6{
	public static void main(String a[]){
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number to print Factorial : ");
		n=sc.nextInt();
		Fact obj=new Fact();
		obj.fact(n);
	}

}