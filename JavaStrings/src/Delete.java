import java.util.Scanner;
public class Delete
{

public static void main(String[] args)
{
  System.out.println("enter string");

Scanner obj=new Scanner(System.in);
String s=obj.nextLine();
for(int i=0;i<s.length();i++) {
System.out.println("Enter a character to delete");
char c=obj.next().charAt(0);
String s3=String.valueOf(c);
s=s.replace(s3,"");
System.out.println(s);

}


}

}
