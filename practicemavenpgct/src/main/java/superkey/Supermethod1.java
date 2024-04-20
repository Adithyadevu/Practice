package superkey;

public class Supermethod1 extends Supermethod {
	float m;
	float n;
	public void display() {
	 m=22.2f;
	 n=33.3f;
	 float c=m+n;
		super.display();
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supermethod1 obj=new Supermethod1();
obj.display();
	}

}
