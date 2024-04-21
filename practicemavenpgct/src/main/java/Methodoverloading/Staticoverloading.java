package Methodoverloading;

public class Staticoverloading {
	public static void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
public static void add(double a,double c) {
	double m=a+c;
	System.out.println(m);
}
public static void add(float a,float b,float c) {
	float z=a+b+c;
	System.out.println(z);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Staticoverloading.add(40,30 );
	Staticoverloading.add(22.22d,11.11d);
	Staticoverloading.add(22.1f,11.1f,11.1f);
		
	}

}
