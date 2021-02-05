import java.util.*;
public class alphabeticorder 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char chrArray[]=s1.toCharArray();
		Arrays.sort(chrArray);
		System.out.println(chrArray);

	}

}