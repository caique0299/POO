package POO;

public class Gerente extends Funcionario {
	
	private String departamento;

    public Gerente(String nome, String cpf, double salario, String departamento) {
        super(nome, cpf, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 1000.0;
    }

    public void visualizar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Bonificação: " + this.getBonificacao());
    }
}