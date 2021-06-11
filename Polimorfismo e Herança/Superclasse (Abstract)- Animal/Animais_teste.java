package Superclasse_animal_abstract;

import java.util.Scanner;

public class Animais_teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n**Pesquisa sobre Novos Animais da ong Generation**");
		
		System.out.println("\n--------------------------------------");
		
		int op = 1, sn;
			
		System.out.println("\nEscolha o Animal: \n1-Cachorro: \n2-Cavalo \n3-Preguiça: ");
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
					Preguiça preguiça = new Preguiça();
					preguiça.Nome("Gertrude");
					preguiça.Idade(5);
					preguiça.Som("Sim");
					preguiça.Escala();
					System.out.println("Sim");
				break;	
				
				default:
					System.out.println("\nNúmero Inválido. ");		
			}
	}

}
