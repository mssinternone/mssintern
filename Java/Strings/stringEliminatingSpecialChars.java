import java.util.Scanner;

public class stringEliminatingSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String name = sc.nextLine();
		int vowels = 0,cons = 0;
		for(int i =0;i<name.length();i++)
		{
			if(name.charAt(i)>='a' && name.charAt(i)<='z')
			{
				cons =cons+1;
			}
	}

	}
	
	}
