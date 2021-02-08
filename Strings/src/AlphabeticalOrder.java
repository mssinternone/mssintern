import java.util.*;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
	    System.out.println("Enter string");
	    String s=sc.nextLine();
	    char[] a=s.toCharArray();
	    Arrays.sort(a);
	    System.out.println(a);    
	}

}
