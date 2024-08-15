package Revolver;

public class Main {
    public static void main(String[] args) {
        Revolver r = new Revolver(10,10);
        r.mostrar();
        r.recarregar();
        r.recarregar();
        r.atirar();
        r.mostrar();
    }
}
