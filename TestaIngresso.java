package POO;

public class TestaIngresso {

	public static void main(String[] args) {
	
		 Ingresso ingresso1 = new Ingresso("Cold Play", "Estádio do Maracanã", "01/05/2023", 550.50f, 1385);
	        Ingresso ingresso2 = new Ingresso("Ivete Sangalo", "Teatro Municipal", "15/06/2023", 250.00f, 28);

	        System.out.println("Ingresso 1:");
	        ingresso1.visualizar();

	        System.out.println("\nIngresso 2:");
	        ingresso2.visualizar();
	    }
	}