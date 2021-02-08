package ControlStatementsandArrays;

import java.util.Scanner;

public class ternary2var {

	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("enter num1 value : ");
        
        num1=sc.nextInt();
        
        System.out.println("enter num2 value : ");
        num2=sc.nextInt();
         int big = (num1>num2) ? (num1):(num2);
         
             System.out.println("Biggest : " + big);
        
        
        	
	}

}
