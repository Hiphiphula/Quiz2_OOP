package session7;

import java.util.Scanner;

class Persons {
	public String name;
	public String born_date;
	
//	constructor
	public Persons(String name, String born_date)
	{
		this.name = name;
		this.born_date = born_date;
	}
	
	void PrintAll()
	{
		System.out.println("Name: " + name + "\nBorn in: " + born_date);
	}
	
	void Sleep()
	{
		System.out.println("This person is currently sleeping!");
	}
	
	
	
}


class Mahasiswa extends Persons
{
	public String name;
	public String born_date;
	public String student_id;
	public int point;
	
	
	public Mahasiswa(String name, String born_date, String student_id, int point)
	{
		super(name, born_date);
		this.student_id = student_id;
		this.point = point;
	}
	
	void HelpingDosen()
	{
		System.out.println("Helping Dosen! Point +10");
		point += 10;
	}
	
	void PrintAll()
	{
		super.PrintAll();
		System.out.println("student ID: " + student_id + "\nPoint: " + point);
	}
}

class Dosen extends Persons
{
	public String name;
	public String born_date; 
	public String code_dosen;
	public int point;
	
	public Dosen(String name, String born_date, String code_dosen, int point)
	{
		super(name, born_date);
		this.code_dosen = code_dosen;
		this.point = point;
	}
	
	void SelfDev()
	{
		System.out.println("SelfDev! Point +10");
		point+= 10;
	}
	
	void Teach()
	{
		System.out.println("is teaching! Point +10");
		point+= 10;
	}
	
	void P2M()
	{
		System.out.println("P2M! Point +10");
		point+= 10;
	}
	
	void Research()
	{
		System.out.println("Research! Point +10");
		point+= 10;
	}
	
	void OtherWorks()
	{
		System.out.println("OtherWorks! Point +10");
		point+= 10;
	}
	
	void PrintAll()
	{
		super.PrintAll();
		System.out.println("Lecturer ID: " + code_dosen + "\nPoint: " + point);
	}
}



public class quizsus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ch = new Scanner(System.in);
		int choice;
		
		
		do
		{
			System.out.println("Choose one of the options: " + "\n1. Person" + "\n2. Mahasiswa" + "\n3. Dosen" + "\n4. Exit" + "\nYour choice =  ");
			choice = ch.nextInt();			
			
			if(choice == 1)
			{
				Persons pr = new Persons("Farrell M", "2nd of February 2020");
				pr.PrintAll();
				pr.Sleep();
				System.out.println("\n\n\n");
			}
			else if(choice == 2)
			{
				Mahasiswa mh = new Mahasiswa("Farrell M", "2nd of February 2020","2153081274", 0);
				mh.HelpingDosen();
				mh.PrintAll();
				System.out.println("\n\n\n");
			}
			else if (choice == 3)
			{
				Dosen ds = new Dosen("Michael L", "9th of March 1980", "1267638673683", 0);
				ds.Teach();
				ds.SelfDev();
				ds.Research();
				ds.P2M();
				ds.OtherWorks();
				ds.PrintAll();
				System.out.println("\n\n\n");
			}
			else if (choice == 4)
			{
				System.out.println("Terminated!");
				System.out.println("\n\n\n");
			}
			
		}while(choice >= 1 && choice <= 3 );
		
		
		
	}

}
