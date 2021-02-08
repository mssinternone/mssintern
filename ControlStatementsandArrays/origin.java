package ControlStatementsandArrays;
import java.util.Scanner;
public class origin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a x-axis and y-axis");
	int x=sc.nextInt();
	int y=sc.nextInt();
	if(x== 0 && y ==0)
	{
		System.out.println(" origin");
	}
	else if(x!=0 && y==0 )
	{
		System.out.println("it is on x axis");
	}
	else if(x==0 && y!=0 )
	{
		System.out.println("it is on y axis");
	}
	else
	{
		System.out.println("point lies on neither x axis on y y axis");
	}
	}

}
