package ControlStatementsandArrays;

import java.util.Scanner;

public class xyCoordinates {
    public static void main(String args[]) {
    	int x;
    	int y;
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter x coordinates ");
    	System.out.println("enter y coordinates");
    	x= sc.nextInt();
    	y= sc.nextInt();
    	
        if(x==0 && y!=0) {
    		System.out.println("it is on y-axis");
    	}
    	else if(y==0 && x!=0) {
    		System.out.println("it is on x-axis");
    	}
        if(x==0 && y==0) {
    		System.out.println("lies in origin");
    	}
    	else {
    		System.out.println("The point lies neither on the x nor the y axis ");
    	}
    	
    }
}
