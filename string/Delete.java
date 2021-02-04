import java.util.Scanner;
public class Delete
{

	public static void main(String[] args) 
	{
		   System.out.println("enter string");
	
			Scanner obj=new Scanner(System.in);
			String s=obj.nextLine();
			for(int i=0;i<s.length();i++) {
				System.out.println("Enter number character to delete");
				int n=obj.nextInt();
				System.out.println(s.substring(0+n));
				
				}	
			}
			
			
		}


	

	
	

