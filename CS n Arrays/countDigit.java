import java.util.*;
class countDigit {

	static int count_Digit(long n)
	{
		int count = 0;
		while (n != 0) {
			n = n / 10;
			++count;
		}
		return count;
	}

	
	public static void main(String[] args)
	{
		int n ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter digit to count");
		n = scan.nextInt();
		scan.close();
		System.out.print("Number of digits : "+ count_Digit(n));
	}
}

