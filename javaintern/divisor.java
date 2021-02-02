package javaintern;

public class divisor 
{

	public static void main(String...args)
	{ 
		int count=0; 
		int max=0; 
		int no=0; 
		for(int i=1;i<= 10000;i++)
		{ 
		count=0; 
		for(int j= 1;j<=1;j++)
		{ 
			if(i%i==0) 
			{ 
				count++;
					if(count>max) 
					{ 
						max=count; 
						no++; 
						System.out.println(no+" "+(max-1)); 
					}




			}
		}
		}
	}
}