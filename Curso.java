package POO;

public class Curso {

    private int id;
    private String nome;
    private String descricao;
    private String plataforma;
    private double preco;

    public Curso(int id, String nome, String descricao, String plataforma, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.plataforma = plataforma;
        this.preco = preco;
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

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void visualizar() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Preço: " + preco);
    }
}
