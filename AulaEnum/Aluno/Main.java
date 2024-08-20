package AulaEnum.Aluno;

public class Main {
    public static void main(String [] args) {
        Disciplina a = new Disciplina("Mikhael", 10, 5.4);
        a.mostrar();
        a.mostrarStatus();
        a.setP1(6);
        a.mostrarStatus();
    }
}