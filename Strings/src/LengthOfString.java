import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);int count=0;
	    System.out.println("Enter string");
	    String s=sc.nextLine();
	    s+="@";
	    char[] a=s.toCharArray();
	    for(int i=0;;i++)
	    {
	    if(a[i]=='@') {
	    	break;	
	    }
	    else
	    {
	    	count++;
	    }
	}
	System.out.println(count);    

}
}