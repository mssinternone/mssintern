package collections;
import java.util.*;
public class QuestionPaper {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
		int count=0;
		Map<Integer,String> m1=new LinkedHashMap();
		            System.out.println("chemistry paper");
		              m1.put(1,"helium");
		              m1.put(2, "carbonmonoxide");
		              m1.put(3, "xenon");
		              m1.put(4, "radon");
		     
		          Map<Integer,String>m2=new LinkedHashMap();
		             m2.put(1,"he");
		             m2.put(2, "co");
		             m2.put(3, "hel");
		             m2.put(4, "ra");
		             Map<Integer,String>m3=new LinkedHashMap();
		             m3.put(1,"he");
		             m3.put(2, "co");
		             m3.put(3, "he");
		             m3.put(4, "ra");
		             Map<Integer,String>m4=new LinkedHashMap();
		             m4.put(1,"he");
		             m4.put(2, "co");
		             m4.put(3, "he");
		             m4.put(4, "ra");
		             Map<Integer,String>m5=new LinkedHashMap();
		             m5.put(1,"he");
		             m5.put(2, "co");
		             m5.put(3, "hel");
		             m5.put(4, "ra");
		             Map<Integer,Integer>m6=new LinkedHashMap();
		             m6.put(1,1);
		             m6.put(2, 2);
		             m6.put(3, 3);
		             m6.put(4, 4);
		             
		             
		             
		             Set s=m1.entrySet();//converting hash to set
		             Iterator k=s.iterator();//set to iterator
		             Set s1;//empty set
		             Iterator i;//empty iterator
		             while(k.hasNext())
		             {

		             Map.Entry j=(Map.Entry)k.next();//converting iterator k to map j
		             int m=(int) j.getKey();//
		             if(m==1)
		             {
		             System.out.println(j.getValue());
		             s1=m2.entrySet();
		             i=s1.iterator();
		             while(i.hasNext())
		             {
		             Map.Entry e=(Map.Entry) i.next();//converting iterator to map
		             System.out.println(e.getKey()+" "+e.getValue());
		             }
		             }
		             else if(m==2)
		             {
		             System.out.println(j.getValue());
		             s1=m3.entrySet();
		             i=s1.iterator();
		             while(i.hasNext())
		             {
		             Map.Entry e=(Map.Entry) i.next();
		             System.out.println(e.getKey()+" "+e.getValue());
		             }
		             }
		             else if(m==3)
		             {
		             System.out.println(j.getValue());

		             s1=m4.entrySet();
		             i=s1.iterator();
		             while(i.hasNext())
		             {
		             Map.Entry e=(Map.Entry) i.next();
		             System.out.println(e.getKey()+" "+e.getValue());
		             }
		             }
		             else if(m==4)
		             {
		             System.out.println(j.getValue());

		             s1=m5.entrySet();
		             i=s1.iterator();
		             while(i.hasNext())
		             {
		             Map.Entry e=(Map.Entry) i.next();
		             System.out.println(e.getKey()+" "+e.getValue());
		             }
		             }
		           
		             System.out.println("Enter your Answer");
		             Scanner sc=new Scanner(System.in);
		             int val=sc.nextInt();
		             s=m6.entrySet();
		             i=s.iterator();
		             while(i.hasNext())
		             {
		             Map.Entry me=(Map.Entry) i.next();
		             if(me.getKey()==j.getKey())
		             {
		             if(((int)me.getValue())==val)
		             {
		             count++;
		             }
		             }
		             }
		             }
		             System.out.println("Correct Answers="+count);
		             System.out.println("Wrong Answes="+(4-count));
		             System.out.println("percenteage Scored"+((count/4.0)*100));
		             }
}