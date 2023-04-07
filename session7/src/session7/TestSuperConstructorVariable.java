package session7;



class PersonOne
{
//	attribute
	int PersonAttr = 5;
	
//	constructor
	PersonOne()
	{
		System.out.println("Person Class Constructor");
	}
	
	void message()
	{
		System.out.println("This message from person class" );
	}
	
}

// child class
class StudentOne extends PersonOne
{
	int PersonAttr = 6;
	
	StudentOne()
	{
		super();
		System.out.println("Student Class Constructor: " + super.PersonAttr + " this / var : " + "" + this.PersonAttr);
	}
	
	void message() {
		System.out.println("This message from student class");
	}
	
	void display()
	{
		this.message();
		message();
		super.message();
	}
}

public class TestSuperConstructorVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentOne s = new StudentOne();
		s.display();
		
	}

}
