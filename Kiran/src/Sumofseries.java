import java.util.Scanner;
public class Sumofseries {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double sum=0,n,i;
System.out.println("Please Enter the value of N:=");
n=sc.nextDouble();
for(i=1;i<=n;i++)
{
sum=sum+(1/i);
if(i==1)
System.out.print("1 + ");
else if(i==n)
System.out.print("1/ "+i);
else
System.out.print("1/ "+i+";  ");
}
System.out.println();
System.out.println("THE SUM OF THIS SERIES IS:="+sum);
}
} 
