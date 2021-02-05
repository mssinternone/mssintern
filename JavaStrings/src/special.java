import java.util.Scanner;
import java.util.*;
public class special {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String str1 = sc.nextLine();
		str1=str1.replaceAll("[^a-zA-Z]"," ");
		System.out.println(str1);
	}

}