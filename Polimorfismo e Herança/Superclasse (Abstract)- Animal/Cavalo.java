package Superclasse_animal_abstract;

public class Cavalo extends Animal {

	public Cavalo()
	{
		super ("Cavalo");
	}

	@Override
	
	public void Nome (String nomeanimal)
	{
		System.out.println("\nNome do Cavalo: " + nomeanimal);
	}
	
	@Override
	
	public void Idade (int idadeanimal)
	{
		System.out.println("\nIdade do Cavalo: " + idadeanimal);
	}
	
	@Override
	
	public void Som (String somanimal)
	{
		System.out.println("\nO Cavalo emite Som? " + somanimal);
	}
	
	public void Corre()
	{
		System.out.println("\nO Cavalo corre? ");
	}
}
