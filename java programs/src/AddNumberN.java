 import java.util.Scanner; 
public class AddNumberN 
{ 
public static void main(String...args) 
{ 
Scanner in=new Scanner(System.in); 
System.out.println("Enter a number : ");
int n=in.nextInt(); 
int sum=0;
for(int i=1;i<n;i++)
{ 
sum+=i; 
}
if(sum<50)
{ 
System.out.println("Summation : "+sum); 
}
}
}
