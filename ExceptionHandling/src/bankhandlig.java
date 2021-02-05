import java.util.Scanner;

class bankhandlig {
	public static void main(String[] args) {
		int mainbal = 1000, withdraw;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a withdraw amount:");
		withdraw = sc.nextInt();

		try {
			if (mainbal - withdraw < 0) {
				throw new IllegalArgumentException();
			} else {
				mainbal = mainbal - withdraw;
				System.out.println("withdrawal sucessful");
				System.out.println(mainbal - withdraw + "balance left");
			}
		} catch (Exception e) {

			System.out.println("Insufficent Balance");
			System.out.println(e);
		}
	}
}