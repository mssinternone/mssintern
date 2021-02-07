import java.util.*;
public class Exampaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		LinkedHashMap<Integer,String> m=new LinkedHashMap<Integer,String>();  
		  
		  m.put(1,"where are u from");  
		  m.put(2,"what is ur background");  
		  m.put(3,"how many hours u can work");  
			
		LinkedHashMap<Integer,String> m1=new LinkedHashMap<Integer,String>();  
		  
		  m1.put(1,"im from mss");  
		  m1.put(2,"im from avanthi");  
		  m1.put(3,"im from aniits");  
		 
		LinkedHashMap<Integer,String> m2=new LinkedHashMap<Integer,String>();  
				  
				  m2.put(1,"my background cse");  
				  m2.put(2,"my background ece");  
				  m2.put(3,"my background it");
		  
		LinkedHashMap<Integer,String> m3=new LinkedHashMap<Integer,String>();  
				  
				  m3.put(1,"10hrs per day");  
				  m3.put(2,"12hrs per day");  
				  m3.put(3,"6hrs per day"); 
				  
		  LinkedHashMap<Integer,Integer> m4=new LinkedHashMap<Integer,Integer>();  
		  
		  m4.put(1,1);  
		  m4.put(2,1);  
		  m4.put(3,2); 
				  
				  Set s=m.entrySet();//converting hash to set
		             Iterator k=s.iterator();//set to iterator
		             Set s1;//empty set
		             Iterator i;//empty iterator
		             
		             while(k.hasNext())
		             {

		             Map.Entry j=(Map.Entry)k.next();//converting iterator k to map j
		             int g=(int) j.getKey();//
		             if(g==1)//q1
		             {
		             System.out.println(j.getValue());
		             s1=m1.entrySet();
		             i=s1.iterator();
		             while(i.hasNext())
		             {
		             Map.Entry e=(Map.Entry) i.next();//converting iterator to map
		             System.out.println(e.getKey()+" "+e.getValue());
		             }
		             }
		             else if(g==2) //q2
		             {
		             System.out.println(j.getValue());
		             s1=m2.entrySet();
		             i=s1.iterator();
		             while(i.hasNext())
		             {
		             Map.Entry e=(Map.Entry) i.next();
		             System.out.println(e.getKey()+" "+e.getValue());
		             }
		             }
		             else if(g==3)//q3
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
		             System.out.println("Enter your Answer");
		             Scanner sc=new Scanner(System.in);
		             int val=sc.nextInt();
		             s=m4.entrySet();
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
		             System.out.println("Wrong Answes="+(3-count));
		            
		             }	         
		}