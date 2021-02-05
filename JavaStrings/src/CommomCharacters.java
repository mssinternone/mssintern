import java.util.Scanner;

public class CommomCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter 2 Strings  to compare:");
		String name1= sc.nextLine(); 
		String name2= sc.nextLine(); 
	
	for(int i=0;i<name1.length();i++) {
		for(int j=0;j<name2.length();j++)
		{ 
			if(name1.charAt(i)==name2.charAt(j)) 
			{
				System.out.println(name1.charAt(i));
				
				
			}
			
			
		}
		
	}
	
	
	
	
	}

}
