abstract class A
{
	abstract void callme();
	void callmetwice()
	{
		System.out.println("called");
	}
}
class B extends A
{
	void callme()
	{
		System.out.println("call from abstarct");
	}
}
class abstractmet
{
	public static void main(String args[])
	{
		B b=new B();
		b.callme();
	}
	}


