 import java.util.Scanner; 
public class Minutes 
{ 
public static void main(String...args) 
{ 
final int SECONDS_PER_HOUR=3600;
Scanner in=new Scanner(System.in); 
System.out.println("Enter Time in Minutes: "); 
int sec=in.nextInt(); 
int hours= sec/SECONDS_PER_HOUR;
System.out.println("Time in Hours : "+hours); 
}
}