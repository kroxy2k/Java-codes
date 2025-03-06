//7. Write a java program to print the following sequence:
//   2, 1, 4, 2, 6, 6, 8, 24, 10, and so on up to a given limit.

import java.util.*;
class Seq
{
	void sq(int num){
		int i, a=1;
		for(i=1;i<=num;i++){
		a*=i;
		System.out.print((2*i)+", "+a+", ");
		
		}
	}
}

class Q7{

	public static void main(String a[]){
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Sequence limit : ");
		n=sc.nextInt();
		Seq obj=new Seq();
		obj.sq(n);
	}
}