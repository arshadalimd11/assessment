package assignment;

public class Trainee {
	
	private int id;
	private String name;
	Trainee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getid() {
		return id;
	}
	public void setid(int idarg) {
		this.id=idarg;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object arg) {
		if (this==arg) {
			return true;
		}
		if(arg==null || !(arg instanceof Trainee)) {
			return false;
			
		}
		Trainee that = (Trainee) arg;
		boolean isequal = this.id==that.id;
		return isequal;
	}
	
}
