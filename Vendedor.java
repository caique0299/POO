package POO;

public class Vendedor extends Funcionario {

	private double comissao;

    public Vendedor(String nome, String cpf, double salario, double comissao) {
        super(nome, cpf, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + this.comissao;
    }

    public void visualizar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Comissão: " + this.getComissao());
        System.out.println("Bonificação: " + this.getBonificacao());
    }
}