class CalcSum
{
	CalcSum()
	{
	       int a[];
	      for(int j=0;j<10;j++)
		{
			a[j]=j+1;
		}
	     
	int CalcSum(int[] a)
	{

		int sum=0;
		for(int x:a)
		{
			sum+=x;
		}
		return sum;
	}

 public static void main(String args[])
 {
	int a[]={1,2,3,4,5};
       int sum s=new sum();
	 s.CalcSum();
   	 s.CalcSum(a);

	 System.out.println("sum of default="+s.CalcSum() + "sum of parameterized="+s.CalcSum(a)); 
 
 }
}
