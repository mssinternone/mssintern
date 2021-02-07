import java.util.Scanner;
public class Palindromstring{
private static String str;
public static void main(String[] args)
{
System.out.println("enter a string/number:");
Scanner a=new Scanner(System.in);
String str = a.nextLine();
int i=0, j=str.length()-1,count=1;
while(i<j) {
if (str.charAt(i) != str.charAt(j))
{
count=0;
break;
}
i++;

j--;
}
if(count==1)
{
System.out.println("given string/number is palindrom");
}
else {
System.out.println("given string/number not a palindrom");
}
}
}
