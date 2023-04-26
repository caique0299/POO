package POO;

public class Produto {

	 private int id;
	    private String nome;
	    private String descricao;
	    private double preco;
	    private int quantidadeEstoque;

	    public Produto(int id, String nome, String descricao, double preco, int quantidadeEstoque) {
	        this.id = id;
	        this.nome = nome;
	        this.descricao = descricao;
	        this.preco = preco;
	        this.quantidadeEstoque = quantidadeEstoque;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    public int getQuantidadeEstoque() {
	        return quantidadeEstoque;
	    }

	    public void setQuantidadeEstoque(int quantidadeEstoque) {
	        this.quantidadeEstoque = quantidadeEstoque;
	    }

	    public void visualizar() {
	        System.out.println("ID: " + this.id);
	        System.out.println("Nome: " + this.nome);
	        System.out.println("Descrição: " + this.descricao);
	        System.out.println("Preço: R$ " + this.preco);
	        System.out.println("Quantidade em estoque: " + this.quantidadeEstoque);
	    }
	}
