

public class Result {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		Marksheet m = new Marksheet();
		Stud s = new Stud();
		t.seeResult();
		s.seeResult();
		m.markSheet(t, s);
	}
}

class Marksheet
{
	public void markSheet(Teacher t , Stud s)
	{
		t.update(89);
		
	}
}

interface finalMarks
{
	public void seeResult();
}
interface updateMarksheet
{
	public void update(int totalMarks);
}
class Teacher implements updateMarksheet,finalMarks
{
	
		int totalMarks;
		
		public void update(int marks)
		{
			totalMarks = marks;
			System.out.println("Totalmarks  "+totalMarks);
		}
		
		public void seeResult()
		{
			System.out.println("Result" + totalMarks + "out of 100");
		}
}


class Stud extends Teacher implements finalMarks
{
	public void seeResult()
	{
		System.out.println("Result" + super.totalMarks + "out of 100");
	}
}