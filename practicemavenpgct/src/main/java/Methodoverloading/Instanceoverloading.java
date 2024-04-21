package Methodoverloading;

public class Instanceoverloading {
	public void add(int a, int b)
	{
	int x=a+b;
	System.out.println(x);
	}
	public void add(int a, int b,int c)
	{
	int x=a+b+c;
	System.out.println(x);
	}
	public void add(float a, double b)
	{
	double x=a+b;
	System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instanceoverloading obj=new Instanceoverloading();
		obj.add(2,4);
		 obj.add(13,45,67);
		 obj.add(33.3f,33.333d);


	}

}
