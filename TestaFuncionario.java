package POO;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		// Instanciando dois objetos da Classe Funcionario
		Gerente gerente1 = new Gerente("João", "582.245.965-58", 5000.0, "Vendas");
        Gerente gerente2 = new Gerente("Maria", "758.007.700-45", 6000.0, "Marketing");
        
        Vendedor vendedor1 = new Vendedor("Pedro", "165.248.321-98", 2500.0, 500.0);
        Vendedor vendedor2 = new Vendedor("Ana", "001.908.505-41", 3000.0, 750.0);
        
        // Utilizando o método visualizar() para exibir os dados dos Funcionarios
        gerente1.visualizar();
        gerente2.visualizar();
        vendedor1.visualizar();
        vendedor2.visualizar();
	}
}
      
        
        
       
