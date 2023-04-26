package POO;

public class Cliente {

	   private int codigo;
	    private String nome;
	    private String email;
	    private String telefone;
	    private String endereco;

	    public Cliente(int codigo, String nome, String email, String telefone, String endereco) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.email = email;
	        this.telefone = telefone;
	        this.endereco = endereco;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public void visualizar() {
	        System.out.println("Código: " + codigo);
	        System.out.println("Nome: " + nome);
	        System.out.println("E-mail: " + email);
	        System.out.println("Telefone: " + telefone);
	        System.out.println("Endereço: " + endereco);
	    }
	}