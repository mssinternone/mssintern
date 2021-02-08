import java.util.Scanner;
public class DeleteCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your String");
      String str=sc.nextLine();
      System.out.println("Enter how many charecters do you want to delete:");
      int j=sc.nextInt();
      for(int i=0;i<(str.length()-j);i++)
      {
    	  System.out.print(str.charAt(i));
      }
	}

}
