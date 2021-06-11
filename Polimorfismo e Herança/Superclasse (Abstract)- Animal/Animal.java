package Superclasse_animal_abstract;

public abstract class Animal {
	
	private String tipoanimal;
	abstract public void Nome (String nomeanimal);
	abstract public void Idade (int idadeanimal);
	abstract public void Som (String somanimal);
	
	public Animal (String tipoanimal)
	{
		this.tipoanimal = tipoanimal;
	}
	public String getTipoanimal() {
		return tipoanimal;
	}
	public void setTipoanimal(String tipoanimal) {
		this.tipoanimal = tipoanimal;
	}
	
}
