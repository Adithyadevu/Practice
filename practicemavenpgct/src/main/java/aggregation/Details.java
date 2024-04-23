package aggregation;

public class Details {
	String division;
	int rollno;
	Student s;
public Details(String division,int rollno,Student s) {
	this.division=division;
	this.rollno=rollno;
	this.s=s;
	
}
public void display() {
	System.out.println(s.name+" "+s.age);
	System.out.println(division+""+rollno);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new Student("adithya",15);
Details obj1=new Details("lotus",2,obj);
obj1.display();
	}

}
