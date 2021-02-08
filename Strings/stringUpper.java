import java.util.Scanner;

public class stringUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String name = sc.nextLine();
		char arr[] = new char[name.length()];
		String s = ""; 
		char ch3;
		for(int i = 0;i<name.length();i++)
		{
			arr[i] = name.charAt(i);
			if(i == 0)
			{
				ch3 = Character.toUpperCase(arr[i]);
				s=s+ch3;
			}
			
			else if(((i>0)&&(arr[i]!=' ')&&(arr[i-1]==' ')) || ((arr[0]!=' ')&&(i==0)))
			{
				ch3 = Character.toUpperCase(arr[i]);
				s = s + ch3;
			}
			else
			{
				s = s+arr[i];
			}
		}
		System.out.println(s);
		
	}

}
