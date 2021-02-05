public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = "Hello";
        String S2 =new String("Hello");
        String S3 = "hello";
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(S1.equals(S2));//inside content checks
        System.out.println(S1==S3);//checks reference and words also
        System.out.println(S1==S2);//here different pool one is const poll and other is non poll
        System.out.println(S1.equalsIgnoreCase(S2));
	}

}
