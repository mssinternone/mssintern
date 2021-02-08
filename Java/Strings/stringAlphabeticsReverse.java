import java.util.Scanner;

public class stringAlphabeticsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String name = sc.nextLine();
		char flag =0;
		char[] arr = name.toCharArray();
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					flag = arr[i];
					arr[i] = arr[j];
					arr[j] = flag;
				}
			}
		}
		System.out.println("The Alphabetical order of the given string :" );
		for(int a =arr.length-1;a>=0;a--)
		{
			System.out.print(arr[a]);
		}
		
	}

}
