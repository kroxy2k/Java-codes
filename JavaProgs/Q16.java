//   Write a program to find sum of all integers greater than 100 and less than 200 that are divisible by 7.

class Div
{
    void SumInt(int n1,int n2){
        int X=n1, Y=n2, sum=0;
        if(X>=100 && X<=200){
            System.out.print("The numbers between 100 and 200 that are divisible by 7 are: \n");
            for(int i=X;i<=Y;i++){
                if(i%7==0){
                    sum+=i;
                    System.out.print(i+" ");
                }
            }
            System.out.println("\nThe sum of the number: "+sum);
        }
        else{
            System.out.println("Error! Enter the only between 100 and 200");

        }
    }
}
class Q16
{
    public static void main(String []args)
    {
        Div obj=new Div();
        obj.SumInt(100,200);
    }
}