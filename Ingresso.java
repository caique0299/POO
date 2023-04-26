package POO;

public class Ingresso {

	private String evento;
    private String local;
    private String data;
    private float preco;
    private int quantidade;

    public Ingresso(String evento, String local, String data, float preco, int quantidade) {
        this.evento = evento;
        this.local = local;
        this.data = data;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void visualizar() {
        System.out.println("Evento: " + evento);
        System.out.println("Local: " + local);
        System.out.println("Data: " + data);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
