package assignment;

public class EceTrainee extends Trainee{
	
	private String device;
	
	public EceTrainee(int id,String name,String device) {
		super(id,name);
		this.device=device;
		
	}
	public String getdevice() {
		return device;
	}
	public void setdevice(String device) {
		this.device=device;
	}

}
