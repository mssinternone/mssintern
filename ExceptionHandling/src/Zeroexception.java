import java.util.Scanner;
class Zeroexception { 
    public static void main(String[] args) 
    { 
        int a ; 
        int b ; 
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        a=Sc.nextInt();
        b=Sc.nextInt();
        try {
        	System.out.println("entered try block");
            System.out.println(a / b); 
           
        } 
        catch (ArithmeticException e) { 
            
            System.out.println( 
                "Divided by zero operation cannot possible"); 
        } 
    } 
}