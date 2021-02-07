import java.util.*;
public class Deletechar {
   public static void main(String args[]) {
      String str = "mss intern";
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      System.out.println(removeCharAt(str, a));
   }
   public static String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 1);
   }
}
