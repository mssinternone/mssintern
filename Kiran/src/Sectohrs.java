import java.util.Scanner;
public class Sectohrs {
public static void main(String[] args) {
System.out.println("enter the time in seconds:");
int hrs;
Scanner obj=new Scanner(System.in);
int sec=obj.nextInt();
hrs=(sec/3600);
System.out.println("time in hours are \n"+hrs);
}
}


