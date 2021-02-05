 import java.util.Scanner; 
public class NoofOccurence
{ 
public static void main(String...args) { 
Scanner in=new Scanner(System.in); 
System.out.println("Enter a number : ");
int no=in.nextInt(); 
int count=0; 
int temp=no; 
for(int i=0;i<9;i++) { 
no=temp; count=0; while(no!=0) { 
if(no%10==i) { 
count++; 
}
no=no/10;
}
System.out.println("Number of occurences of "+i+" is : "+count); 
}
}
}