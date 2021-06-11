package Superclasse_animal_abstract;

public class Preguiça extends Animal {

	public Preguiça()
	{
		super ("Preguiça");
	}

	@Override
	
	public void Nome (String nomeanimal)
	{
		System.out.println("\nNome da Preguiça: " + nomeanimal);
	}
	
	@Override
	
	public void Idade (int idadeanimal)
	{
		System.out.println("\nIdade da Preguiça: " + idadeanimal);
	}
	
	@Override
	
	public void Som (String somanimal)
	{
		System.out.println("\nA Preguiça emite Som? " + somanimal);
	}
	
	public void Escala()
	{
		System.out.println("\nA Preguiça sobe em árvores? ");
	}
	
}
