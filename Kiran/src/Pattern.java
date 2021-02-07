import java.util.Scanner;
public class Pattern {
public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int space=n-1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=space ;j++) {
System.out.print(" ");

}
for(int k=i;k>=1;k--) {
System.out.print(k);
}
int j=2;
for(int l=i-1;l>=1;l--) {
System.out.print(j);
j++;
}
System.out.println();
space--;
}
}
}
