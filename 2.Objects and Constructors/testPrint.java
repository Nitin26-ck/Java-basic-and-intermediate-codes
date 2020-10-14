class Test
{
	void Test()
	{
		System.out.println("test message");
	}
	int Test(int a,int b)
	{
		System.out.println("a="+a+"b="+b);
	
		return a*b;}
}
class testPrint
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.Test();
		t.Test(10,20);
	        

	}
}

