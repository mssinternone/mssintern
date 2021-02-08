package ControlStatementsandArrays;
import java.util.Scanner;
public class NoOccurrenceDigit {
	  
	 public static void main(String...args) { 
	 Scanner in=new Scanner(System.in); 
	 System.out.println("Enter a number : "); 
	 int no=in.nextInt(); 
	 int count=0; 
	 int temp=no; 
	 int rem=0;
	 while(no>0)
	 {
		 for (int i=0;i<10;i++) {
		 rem=no%10;
		 int occ[]=rem;
		 
		 if(occ[i]==occ[i+1])
		 {
			 count++;
		 }
		 else
		 {
			 System.out.println(i+"1 time");
		 }
		 no=no/10;
	 }
		 System.out.println(count+"1 time");
	 }
	 
}
}