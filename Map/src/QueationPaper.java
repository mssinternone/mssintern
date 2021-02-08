import java.util.*;
public class QueationPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int count=0;
	Map<Integer,String> a=new HashMap();
	a.put(1,"Ganesh");
	a.put(2,"Vennela");
	a.put(3,"Anupama");
	Map<Integer,String> q=new HashMap();
	q.put(1,"Select Name Ganesh");
	q.put(2,"Select Name Vennela");
	q.put(3,"Select Name Anupama");
	Map<Integer,Integer> o=new HashMap();
	for(Map.Entry b:q.entrySet())
	{
	System.out.println(b.getKey()+", "+b.getValue());
	for(Map.Entry c:a.entrySet())
	{
		System.out.println("   "+c.getKey()+","+c.getValue());
	}
	System.out.println("Enter Your Option");
    o.put((Integer) b.getKey(),sc.nextInt());
	}
	System.out.println("Your Answers");
	System.out.println("Q.no  YourAnswer  CorrectAnswer");
	for(Map.Entry x:o.entrySet())
	{
	{
		System.out.print(x.getKey()+"         "+x.getValue()+"      ");
		int e=(int) x.getValue();
		int f=(int) x.getKey();
		if(e==f)
		{
			System.out.println(x.getValue());
			count++;
		}
		else
		{
			System.out.println(x.getKey());	
		}
	}
	}
	System.out.println("You got "+count+" Out of 3 marks");
}
}
