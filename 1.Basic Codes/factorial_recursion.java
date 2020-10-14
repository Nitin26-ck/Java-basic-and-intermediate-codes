class factorial_recursion
{
	void fact(int n)
	{
		int fact=1,i;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println("fact="+fact);
		}
	}
 	int fact_recur(int n)
	{
		if(n==1)
			return 1;

	       	return fact_recur(n-1)*n; 
	}
	public static void main(String args[])
	{
		findfact f1,f2;
		f1=new findfact();
		f1.fact(5);
		System.out.println("="+f1.fact_recur(6));
		f2=new factorial_recusrion();
		f2.fact(4);
		System.out.println("="+f2.fact_recur(4));
	}
}
