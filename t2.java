class t2
{
	class t4
	{
		class t3
		{
			public void doSome()
			{
				System.out.println("help");
			} 
		}
		 
	}
	
	public static void main(String[] args) 
		{
			t2 y = new t2();
			t2.t4 x = y.new t4();
			t2.t4.t3 obj = x.new t3();
			obj.doSome();
		}
}	
