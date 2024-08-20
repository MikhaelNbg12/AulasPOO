package AulaEnum.Exercicio;

public class Main {
    public static void main(String[] args) {
        Cartao a = new Cartao(5000, Cliente.Platinum);
        a.calcularDesc();
        a.mostrar();
        System.out.println(a.getCliente());
    }
}
