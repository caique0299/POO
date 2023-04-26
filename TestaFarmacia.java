package POO;

public class TestaFarmacia {

	 public static void main(String[] args) {
	        Farmacia produto1 = new Farmacia(1, "Dipirona", "Analgésico e antitérmico", 9.99, 95);
	        Farmacia produto2 = new Farmacia(2, "Band - Aid", "Curativo", 5.99, 14);
	        
	        System.out.println("Produto 1:");
	        produto1.visualizar();
	        
	        System.out.println("\nProduto 2:");
	        produto2.visualizar();
	    }
	}