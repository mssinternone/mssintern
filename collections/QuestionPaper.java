import java.util.*;
public class QuestionPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<String,Integer> ques = new HashMap<String,Integer>();
	ques.put("How many colors in rainbow?\n1. 5\n2. 6\n3. 7\n4. 8\n",1);
	ques.put("How many vowels are there?\n1. 4\n2. 5\n3. 6\n4. 7\n",2);
	ques.put("How many Alphabets are there?\n1. 26\n2. 27\n3. 28\n4. 29\n",1);
	int count = 0;
	for(Map.Entry<String,Integer> pair : ques.entrySet()) {
		System.out.format(pair.getKey());
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the correct answer:");
		int opt = sc.nextInt();
		if(opt==pair.getValue())
		{
			count =count+1;
		}
	}
	System.out.println("Your total correct answers: "+count);
	}

}
