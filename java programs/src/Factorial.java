import java.util.Scanner; 
public class Factorial { 
public static void main(String... args) { 
Scanner in=new Scanner(System.in); 
System.out.println("Enter a number : "); 
int no=in.nextInt(); 
int fact=1; 
for(int j=no;j>1;j--) { 
fact=fact*j; 
}
System.out.println("Result :"+fact); 

}
}