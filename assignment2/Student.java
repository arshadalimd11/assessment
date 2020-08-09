package assignment2;

public class Student {
	
	private String rollno;
	private int age;
	public Student(String rollno,int age) {
		this.age=age;
		this.rollno=rollno;
		
	}
	
	public String getrollno() {
		return rollno;
		
	}
	public void setrollno(String rollnoarg) {
		this.rollno=rollnoarg;
		
	}
	public int getage() {
		return age;
		
	}
	public void setage(int agearg) {
		this.age=agearg;
	}
	
	@Override
	public int hashCode() {
		int hash=rollno.hashCode();
		return hash;
		
	}
	
	@Override
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}
		
		if(arg==null || !(arg instanceof Student)) {
			return false;
		}
		Student that =(Student)arg;
		boolean isequal =this.rollno.equals(that.rollno);
		return isequal;
				
	}
	
}
