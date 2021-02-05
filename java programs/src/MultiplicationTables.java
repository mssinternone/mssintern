 import java.util.Scanner; 
public class MultiplicationTables 
{ 
public static void main(String[] args) 
{ 
Scanner in=new Scanner(System.in); 
System.out.println("Enter number to print Mutiplication table of : ");
int no=in.nextInt(); 
int i=1; 
do
{ 
System.out.println(no+" * "+i+" : "+no*i); 
i++; 
}
while(i<=10); 
}
}
