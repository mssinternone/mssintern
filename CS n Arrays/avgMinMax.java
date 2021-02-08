import java.util.Scanner;
public class avgMinMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] numb = new int[20];
		
		for(int i=0;i<10;i++) {
			System.out.println("enter number "+(i+1)+" ");
			numb[i] = scan.nextInt();
		}
		int avg=0,max=numb[0],min=numb[0];
		for(int i=0;i<10;i++) {
			avg=avg + numb[i];
			if(min>numb[i]) {
				min=numb[i];
			}
			if(max<numb[i]) {
				max=numb[i];
			}
		}
		avg/=10;
		System.out.println("average is:-"+avg+" min:-"+min+" max:-"+max);
	}
