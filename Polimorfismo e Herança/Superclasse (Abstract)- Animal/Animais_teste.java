package Superclasse_animal_abstract;

import java.util.Scanner;

public class Animais_teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n**Pesquisa sobre Novos Animais da ong Generation**");
		
		System.out.println("\n--------------------------------------");
		
		int op = 1, sn;
			
		System.out.println("\nEscolha o Animal: \n1-Cachorro: \n2-Cavalo \n3-Pregui�a: ");
		op = ler.nextInt();
		
			switch(op)
			{
				case 1:
					Cachorro cachorro = new Cachorro ();
					cachorro.Nome("Jordana");
					cachorro.Idade(3);
					cachorro.Som("Sim");
					cachorro.Corre();
					System.out.println("Sim");
				break;	
				
				case 2:
					Cavalo cavalo = new Cavalo();
					cavalo.Nome("Fergus");
					cavalo.Idade(5);
					cavalo.Som("Sim");
					cavalo.Corre();
					System.out.println("Sim");
				break;	
				
				case 3:
					Pregui�a pregui�a = new Pregui�a();
					pregui�a.Nome("Gertrude");
					pregui�a.Idade(5);
					pregui�a.Som("Sim");
					pregui�a.Escala();
					System.out.println("Sim");
				break;	
				
				default:
					System.out.println("\nN�mero Inv�lido. ");		
			}
	}

}
