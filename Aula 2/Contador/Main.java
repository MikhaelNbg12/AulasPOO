package Aula2.Contador;

public class Main {
    public static void main(String[] args) {
        Contador c = new Contador(5);
        c.incrementar();
        c.incrementar();
        c.incrementar();
        c.incrementar();
        c.decrementar();
        c.mostrar();
        c.zerar();
    }
}
