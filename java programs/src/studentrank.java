import java.util.Scanner;
public class studentrank {

 public static void main(String[] args) {
  int num;
  String nam;
  Scanner sc = new Scanner(System.in);
  
  System.out.println("enter name of the student:");
  nam = sc.nextLine();
  System.out.println("Enter score: ");
  num = sc.nextInt();
  if (num>=50)
  {
   System.out.println("Pass!");
   System.out.println("grade=A+");
  }
  else {
   System.out.println("Fail!");
   System.out.println("grade=f");
 }
  
 }

}
