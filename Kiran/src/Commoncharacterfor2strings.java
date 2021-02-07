import java.util.*;
public class Commoncharacterfor2strings {
public static void main(String[] args) {
String Str1= "miracle";
String Str2="oracle";
int count = 0;
String commChar="";
       int str1Len = Str1.length();
       int str2Len = Str2.length();
       for(int i=0;i<Str1.length();i++)
       {
      for(int j=0;j<Str2.length();j++)
      {
      if (Str1.charAt(i) == Str2.charAt(j))
      {
      count++;
      commChar+=Str1.charAt(i);
      System.out.println(commChar);
      }
      else
      {
      System.out.println("not commchar");
      }
      }
       }
}
}
