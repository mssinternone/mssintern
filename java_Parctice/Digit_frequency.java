package java_Parctice;
import java.util.Scanner;

public class Digit_frequency {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		int r,i=0,count=0;
		
		int len=0;
		int temp=num;
		while(temp!=0) {
			temp=temp/10;
			len++;
		}
		int[] arr = new int[len];
		while(num!=0)
		{
			r = num%10;
			arr[i] = r;
			num = num/10;
			i++;
		}

		for(int j=0;j<arr.length;j++)
		{	count =0;
			int n1 = arr[j];
			
			for(int k=0;k<arr.length;k++)
			{
				if(k!=j)
				{
					if(n1 == arr[k])
					{
						count++;
					}
				}
				
			}
			
			System.out.println("Digit " + n1+ " has repeated " + (count+1)  + " times " );
			
		}
		
	}

}
