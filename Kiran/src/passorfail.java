import java.util.Scanner;
public class passorfail{
public static void main(String[] args) {
int num;
Scanner read = new Scanner(System.in);
System.out.println("Enter score: ");
num = read.nextInt();
if (num>90)
{
System.out.println("pass");
System.out.println("1st rank!");
}
else if (num>80)
{
System.out.println("pass");
System.out.println("2nd rank!");
}
else if (num>70)
{
System.out.println("pass");
System.out.println("3rd rank!");
}
else if (num>60)
{
System.out.println("pass");
System.out.println("4th rank!");
}
else if (num>50)
{
System.out.println("pass");
System.out.println("5th rank!");
}
else if (num<50)
{
System.out.println("Fail!");
System.out.println("Better luck next time...!!!");
}
}
}