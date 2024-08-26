public class Main {
    public static void main(String[] args) {
        Endereco end = new Endereco("Rua Luis Pinto de Amorim, 41", "11350-230", "São Vicente", Estado.SP);
        Aluno a = new Aluno("Mikhael", "mikhael.nobrega12@gmail.com", end);
        a.mostrar();
    }
}
