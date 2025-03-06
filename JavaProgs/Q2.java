//Write a java program to print primes from 1 to 1000.

class pr{
void disPrime(int n){
int i,j,flg;
for(i=1;i<=n;i++){
if(i==1 || i==0)
continue;
flg=1;
for(j=2;j<=i/2;j++){
    if(i%j==0){
    flg=0;
    break;}
        }
if(flg==1){
System.out.print(i+" ");

    
}
}
}
}
public class Q2{

public static void main(String args[]){

int n=1000;
pr a = new pr();
a.disPrime(n);
		}	

}