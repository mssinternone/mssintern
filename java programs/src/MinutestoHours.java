 import java.util.Scanner; 
public class MinutestoHours 
{ 
public static void main(String...args) 
{ 
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in); 
System.out.println("Enter Time in Minutes : ");
int min=sc.nextInt(); 
float hours=min/60; 
System.out.println("Time in Hours : "+hours); 
}
}