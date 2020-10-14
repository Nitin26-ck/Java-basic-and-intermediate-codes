import java.util.Scanner;
class dist
{
	double dis;
	dist(int x,int y,int x2,int y2)
	{
		dis=(Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y)));
	}
}
class distance2d
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
                int x=sc.nextInt();
		System.out.println("enter x");
		int x2=sc.nextInt();
		System.out.println("enter x2");
		int y=sc.nextInt();
		System.out.println("enter y");
	        int y2=sc.nextInt();
	        System.out.println("enter y2");
		dist d=new dist(x,y,x2,y2);
		System.out.println("distance="+d.dis);
	}
}	
