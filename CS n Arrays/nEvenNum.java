import java.util.Scanner;  
public class nEvenNum  
{  
public static void main(String[] args)   
{  
int number, i;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the limit: ");  
number = sc.nextInt();    
i=2;   
System.out.print("Lit of even numbers: ");  

while(i<=number)  
{  
 
System.out.print(i +" ");   

i=i+2;  
}     
}  
}  