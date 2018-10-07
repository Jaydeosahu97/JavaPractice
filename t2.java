class t2{
	class t4{
		static class t3{
			public static void doSome(){
				System.out.println("help");
			} 
		}
		static t3 obj = new t3();
	}
	static t4 done = new t4();
	public static void main(String[] args) {
			//here i'm trying to achieve the access of method doSome which is within the class t3 nested in class t4
			done.obj.doSome();
		}
}	