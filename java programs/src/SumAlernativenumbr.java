 import java.util.Scanner; 
public class SumAlernativenumbr 
{ 
public static void main(String...args)
{ 
Scanner in=new Scanner(System.in); 
System.out.println("Enter a Number : "); 
int no=in.nextInt(); 
int flag=0;
int sum=0;
int rev=0;
while(no!=0) 
{ 
if(flag==0) 
{ 
sum+=(no%10); 
flag=1;
}
else 
{ 
flag=0; 
}
rev=rev*10+(no%10); 
no=no/10; 
}
System.out.println("Sum of 1st set of Alternatives in digit "+sum); 
sum=0; 
flag=0;
while(rev!=0)
{ 
if(flag==0)
{ 
sum+=(rev%10); 
flag=1;
}
else
{ 
flag=0; 
}
rev=rev/10; 
}
System.out.println("Sum of 2nd set of Alternatives in digit "+sum); 
}
}