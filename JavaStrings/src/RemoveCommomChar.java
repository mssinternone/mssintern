import java.util.Scanner;

public class RemoveCommomChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter 2 Strings  to compare:");
		String name1= sc.nextLine(); 
		String name2= sc.nextLine(); 
		String same="";
		
	for(int i=0;i<name1.length();i++)
	{
		for(int j=0;j<name2.length();j++)
		{ 
			if(name1.charAt(i)==name2.charAt(j)) 
			{
				
				String s=String.valueOf(name1.charAt(i));
				same=same+s;
				
			}
			
	    }

	}
	for(int i=0;i<same.length();i++) {
		String s=String.valueOf(same.charAt(i));
		name1=name1.replace(s,"");
		name2=name2.replace(s,"");
	}
	System.out.println(name1+" "+name2);

}
}
