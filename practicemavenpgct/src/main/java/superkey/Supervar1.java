package superkey;

public class Supervar1 extends Supervar{
	String name="Mrudhul";
	int age=22;
	int salary=9000;
	public void view() {
		System.out.println(super.age);
		System.out.println(super.salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supervar1 obj=new Supervar1();
		obj.view();

	}

}
