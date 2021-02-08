package ExceptionHandling;
class Example1 extends Exception  {
		/**
		*
		*/
		private static final long serialVersionUID = 1L;

		public Example1()
		{
		System.out.println("Age must be greater than 18");

		}

		}
		public class Example
		{
		void check(int x)
		{
		try {
		if(x<18)
		throw new Example1();
		else
		System.out.println("User Valid..");
		}
		catch(Example1 e)
		{
		System.out.println(e);
		}
		}
		public static void main(String args[]) {
		Example e = new Example();
		e.check(18);
		}
		}


