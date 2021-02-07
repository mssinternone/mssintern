import java.util.Scanner;
public class Vowelsconsonants {
public static void main(String[] args) {
Scanner a=new Scanner(System.in);
String str = a.nextLine();
int count=0,count1=0,con,vl;
for(int i=0;i<str.length();i++)
{
if (str.charAt(i) =='a'||str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i)=='u')
{
count++;
}
else
{
count1++;
}
}
con=count1;
vl=count;
System.out.println("no.of vowels" +count);
System.out.println("no.of consonantes" +count1);
}
}