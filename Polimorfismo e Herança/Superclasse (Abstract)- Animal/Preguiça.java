package Superclasse_animal_abstract;

public class Pregui�a extends Animal {

	public Pregui�a()
	{
		super ("Pregui�a");
	}

	@Override
	
	public void Nome (String nomeanimal)
	{
		System.out.println("\nNome da Pregui�a: " + nomeanimal);
	}
	
	@Override
	
	public void Idade (int idadeanimal)
	{
		System.out.println("\nIdade da Pregui�a: " + idadeanimal);
	}
	
	@Override
	
	public void Som (String somanimal)
	{
		System.out.println("\nA Pregui�a emite Som? " + somanimal);
	}
	
	public void Escala()
	{
		System.out.println("\nA Pregui�a sobe em �rvores? ");
	}
	
}
