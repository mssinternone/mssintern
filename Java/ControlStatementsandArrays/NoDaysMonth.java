package ControlStatementsandArrays;
import java.util.Scanner;
public class NoDaysMonth {
	  
	
	 public static void main(String...args) { 
	 Scanner in=new Scanner(System.in); 
	 System.out.println("Select Month : 1. January 2. February 3. March 4. April 5. May 6. June 7. July 8. August 9. September 10. October 11. November 12. December "); 
	 int ch=in.nextInt(); 
	 switch(ch) { 
	 case 1: System.out.println("Total Days : 31"); 
	 break; case 2: System.out.println("Total Days : 29"); 
	 break; case 3: System.out.println("Total Days : 31"); 
	 break; case 4: System.out.println("Total Days : 30"); 
	 break; case 5: System.out.println("Total Days : 31"); 
	 break; case 6: System.out.println("Total Days : 30"); 
	 break; case 7: System.out.println("Total Days : 31"); 
	 break; case 8: System.out.println("Total Days: 31"); 
	 break; case 9: System.out.println("Total Days : 30"); 
	 break; case 10:System.out.println("Total Days: 31"); 
	 break; case 11:System.out.println("Total Days: 30"); 
	 break; case 12:System.out.println("Total Days: 31"); 
	 break; default: 
	 System.out.println("Wrong Choice Entered"); 

}
}
}