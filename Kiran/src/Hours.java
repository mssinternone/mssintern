import java.util.Scanner;
public class Hours {
public static void main(String[] args) {
System.out.println("enter the time:");
int sec;
Scanner obj=new Scanner(System.in);
int hrs=obj.nextInt();
sec=hrs*3600;
System.out.println(" seconds are \n"+sec);
}
}