package Superclasse_animal_abstract;

public class Cachorro extends Animal {
	

	public Cachorro()
	{
		super ("Cachorro");
	}

	@Override
	
	public void Nome (String nomeanimal)
	{
		System.out.println("\nNome do Cachorro: " + nomeanimal);
	}
	
	@Override
	
	public void Idade (int idadeanimal)
	{
		System.out.println("\nIdade do Cachorro: " + idadeanimal);
	}
	
	@Override
	
	public void Som (String somanimal)
	{
		System.out.println("\nO Cachorro emite Som? " + somanimal);
	}
	
	public void Corre()
	{
		System.out.println("\nO Cachorro corre? ");
	}
	
}
