import java.util.Scanner;
public class stringWordsAndChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence");
	String sent = sc.nextLine();
	int count =0;
	//int words =0;
	//char[] wc = new char[4];
	String[] words=sent.split("\\s+");
	for(int i = 0;i<sent.length();i++)
	{	
		
		
		if(sent.charAt(i)!= ' ') 
		{
			count =count +1;
		}
		
	}
	System.out.println("The number of word: "+words.length);
	System.out.println("The number of characters: "+count);
	//System.out.println("The number of words: "+words);
	}

}
