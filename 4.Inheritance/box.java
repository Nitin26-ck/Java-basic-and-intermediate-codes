class Box1
{
	double width;
	double height;
	double depth;
	Box1(Box1 ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	Box1(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	Box1()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	Box1(double len)
	{
		width=height=depth=len;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class Boxweight extends Box1
{
	double weight;
	Boxweight(double w,double h,double d,double m)
	{
		width=w;
		height=h;
		depth=d;
		weight=m;
	}
}
class Box
{
	public static void main(String args[])
		{
			Boxweight mybox1=new Boxweight(12,36,24,9.6);
			double volume;
			volume=mybox1.volume();
			Boxweight mybox2=new Boxweight(10,12,35,5.4);
			volume=mybox2.volume();
			System.out.println("weight of box1="+mybox1.weight);
			System.out.println("weight of box2="+mybox2.weight);
		
			colourBox myboxcolour=new colourBox(7,5,3,6);
			System.out.println("colour of box="+myboxcolour.colour);
		}
	}
class colourBox extends Box1
{
	int colour;
	colourBox(double w,double h,double d,int c)
	{
		width=w;
		height=h;
		depth=d;
		colour=c;
	}
}



		
