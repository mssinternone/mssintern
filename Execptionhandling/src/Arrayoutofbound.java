import java.util.Arrays;
import java.util.Scanner;
public class Arrayoutofbound {
   public static void main(String args[]) {
      int[] myArray = {8987, 4556, 1278, 1590, 1212, 12123, 175};
      System.out.println("Elements in the array are:: ");
      System.out.println(Arrays.toString(myArray));
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the index of the required element ::");
      try {
         int element = sc.nextInt();
         System.out.println("Element in the given index is : "+myArray[element]);
      } catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("The index you have entered is invalid");
         System.out.println("Please enter an index number between 0 and 6");
      }
   }
}
