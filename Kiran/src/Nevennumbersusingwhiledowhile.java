import java.util.Scanner;
public class Nevennumbersusingwhiledowhile {
public static void main(String[] args) {
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Print all even number until:\n");
int num=sc.nextInt();
;System.out.println("even number from 1 to "+num+" are: \n");
i=1;
while(i<=num){
if(i%2==0){
System.out.print(i+"\n");
}
i++;
}
System.out.println("using do-while ");
int j=1;
do {
  if(j%2==0) {
     System.out.println("\t"+j);
  }
     j++;
   } while(j <= num);
 }
}
