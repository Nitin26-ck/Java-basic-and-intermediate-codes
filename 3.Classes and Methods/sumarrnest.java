class outer
{
	int sum,i;
	void sumarrayouter()
	{
		int[] a= new int[10];
		for(i=0;i<10;i++)
		{
			a[i]=i;
		}
		for(int j=0;j<10;j++)
		{
			sum+=a[j];
		}
		System.out.println("sum="+sum);
	}

class inner
{
	void sumarrayinner()
	{
		int sum=0,i=0;
		int b[]={1,2,3,4,5};
		for(int x:b)
		{

			sum=sum+b[i];
			i++;
		}
		System.out.println("sum="+sum);
	}
}
}
class sumarrnest
{
	public static void main(String args[])
	{
        outer o=new outer();
	o.sumarrayouter();
	outer.inner i=new outer().new inner();
	i.sumarrayinner();
	}
}


