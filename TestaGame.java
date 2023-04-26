package POO;

public class TestaGame {

	public static void main(String[] args) {
		
		Produto game1 = new Produto(1, "FIFA 22", "Jogo de Futebol", 159.99, 25);
        Produto game2 = new Produto(2, "IFFA 23", "Jogo de Futebol", 259.99, 7);

        System.out.println("Informações do produto 1:");
        game1.visualizar();

        System.out.println("\nInformações do produto 2:");
        game2.visualizar();
    }
}
