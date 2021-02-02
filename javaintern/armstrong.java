package javaintern;
import java.util.Scanner;
public class armstrong
{
public static void main(String...args) 
{ 
Scanner in=new Scanner(System.in);
System.out.println("Enter a Number : ");
int no=in.nextInt(); 
int sum=0;
int temp=no;
while(no!=0) { 
sum+=(Math.pow((no%10), 3));
no=no/10; 
if(sum==temp)
{ 
System.out.println("Armstrong Number"); 
}else
{ 
System.out.println("Not a Armstrong "); 
{

}
}
}
}
}