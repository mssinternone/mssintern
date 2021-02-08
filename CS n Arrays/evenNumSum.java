import java.util.Scanner;
class evenNumSum {
   public static void main(String args[]) {
	int n;
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the limit: ");  
	n = sc.nextInt(); 
	System.out.print("Even Numbers from 1 to "+n+" are: ");
	for (int i = 1; i <= n; i++) {
	   
	   if (i % 2 == 0) {
		System.out.print(i + " ");
	   }
	}
   }
}

  