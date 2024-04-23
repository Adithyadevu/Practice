package aggregation;

public class Patient {
	String name;
	int age;
	Doctor d;
	public Patient(String name,int age,Doctor d) {
		this.name=name;
		this.age=age;
		this.d=d;
	}
public void display() {
	System.out.println(d.name+" "+d.department);
	System.out.println(name+" "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Doctor obj=new Doctor("Mrudhul","Pediatrition");
Patient obj1=new Patient("Devu",15,obj);
obj1.display();

	}

}
