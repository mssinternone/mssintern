import java.io.*;
public class keycheck 
{
    public static void main(String args[]) throws IOException
    {
        char key;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Press any Key:");
        key = (char) bf.read();

        if(key >= 97 && key <= 123)
        {
            System.out.println(" You Press Lower Case"); //for lower case letter
        }

        else if(key >= 65 && key <= 96) //for upper case letter
        {
            System.out.println(" You Press Upper Case");
        }
        else if(key >= 48 && key <= 57) //for digit
        {
            System.out.println(" You Press Digit");
        }
  else 
        {
            System.out.println(" You Press Special Symbol");
        }
    }
}