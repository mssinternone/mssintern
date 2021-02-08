package ExceptionHandling;

import java.util.Scanner;

public class bankhandlingg {
		// TODO Auto-generated method stub
		
		    private static String e;

		public static void main(String[] args) throws Exception
		    {
		        int mainbal=10000,withdraw = 0 ;
		        boolean bal;  
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter a mainbalance:");
		        withdraw=sc.nextInt();
		       
		        try {
		        if(withdraw>mainbal)
		        {
		        throw new Exception(e);
		        }
		        else {
		        int a=mainbal-withdraw;
		        System.out.println( "withdrawal successful");
		        System.out.print( "remaining balance:"+a);

		        }
		       
		        }
		        catch (Exception e) {
		           
		            System.out.println( "insufficient");
		        }
		    }
		}

	


