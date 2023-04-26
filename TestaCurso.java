package POO;

public class TestaCurso {

    public static void main(String[] args) {
        Curso curso1 = new Curso(1, "Java Básico", "Curso introdutório de Java", "Udemy", 39.90);
        Curso curso2 = new Curso(2, "Python Avançado", "Curso avançado de Python", "Alura", 79.90);

        System.out.println("Curso 1:");
        curso1.visualizar();
        System.out.println();

        System.out.println("Curso 2:");
        curso2.visualizar();
    }
}