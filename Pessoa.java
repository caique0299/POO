package POO;

public class Pessoa {

	
	private String nome;
	private String enderece;
	private String cpf;
	private int telefone;
	private  int idade;
	public Pessoa(String nome, String endereco, String cpf, int telefone, int idade) {
		super();
		this.nome = nome;
		this.enderece = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
			
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return enderece;
		}
		public void setEndereco(String enderece) {
			this.enderece = enderece;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public void validarcpfv() {
		
			if(getCpf().length() != 11) {
				System.out.println("\n--CPF Inválido!!!");
			}else {
				System.out.println("\n--CPF Válido!!!");
			}
		}
}
