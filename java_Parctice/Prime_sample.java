package java_Parctice;
import java.util.Scanner;

public class Prime_sample {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k=1, kcount=0,target=0;
		
		
		while(target!=num)
		{
			for(int i=1;i<=k;i++)
			{
				if(k%i==0)
				{
					kcount++;
				}
			}
			if(kcount==2)
			{
				System.out.println(k+" ");
				target++;
			}
			k++;
			kcount=0;

			
			
		}
	}

}
