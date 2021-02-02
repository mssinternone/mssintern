package javaintern;
import java.util.Scanner;
public class equalOrNot 
{
	public static void main(String...args)
	{ 
		Scanner in=new Scanner(System.in); 
		System.out.println("Enter a number: "); 
		int n=in.nextInt(); 
		int temp=n; int count=0;
		while(n!=0) 
		{ 
		count++; n=n/10; 
		int no_count=1;
		int sample=temp%10; temp=temp/10; 
		while(temp!=0){ 
		if((temp%10)== sample) 
		{ 
		no_count++; 
		temp=temp/10; 
		if(no_count==count) 
		{ 
		System.out.println("All Digits are equal !!"); 
		}
		else{ 
		System.out.println("All Digits are not equal !! "); 

}
}
		}
		}
	}
}