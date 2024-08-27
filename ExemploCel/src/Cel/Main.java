package Cel;

public class Main {
    public static void main(String[] args) {
        Chip ch = new Chip("13991038324");
        Bateria b = new Bateria (8);
        Celular c = new Celular("Teste", b, ch);
        c.ligar();
        c.mostrarBoasVindas();
        b.mostrarCarga();
    }
}
