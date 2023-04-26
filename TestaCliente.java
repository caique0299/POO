package POO;

public class TestaCliente {


	public static void main(String[] args) {

		  Cliente cliente1 = new Cliente(1, "Caique Ramos", "caiqueramoss@hotmail.com", "(19) 99558-7824", "Rua A, 7");
	        Cliente cliente2 = new Cliente(2, "Maria", "mariaclara@hotmail.com", "(11) 99722-1567", "Rua B, 2");

	        cliente1.visualizar();
	        System.out.println("--------------------------");
	        cliente2.visualizar();
	    }
	}
	