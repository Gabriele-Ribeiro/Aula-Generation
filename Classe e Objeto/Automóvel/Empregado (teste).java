package Classe_Objeto;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado[] lista = new Empregado[3];
		lista[0]= new Empregado("Jesus",5000);
		lista[1]= new Empregado("Rosenbaum",2500);
		lista[2]= new Empregado("Amanda",4000);
		
		for(Empregado outraroda:lista)
		{
			outraroda.imprimirInfo();
		}
		
		System.out.println("*******************************");
		for(Empregado roda:lista)
		{
			roda.aumentarSalario(5);
			roda.imprimirInfo();
		}			
	}
}




