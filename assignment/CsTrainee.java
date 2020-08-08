package assignment;

public class CsTrainee extends Trainee{
	
	private String lang;
	public  CsTrainee(int id,String name,String lang)
	{
		super(id,name);
		this.lang=lang;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
}
