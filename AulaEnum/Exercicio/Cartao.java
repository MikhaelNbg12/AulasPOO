package AulaEnum.Exercicio;

public class Cartao {
    private double fatura;
    private Cliente cliente;

    Cartao (double fatura, Cliente cliente){
        this.fatura = fatura;
        this.cliente = cliente;
    }

    void calcularDesc(){
        switch (cliente) {
            case Platinum:
                System.out.println("Seu desconto é de 15%");
            break;
            case Gold:
                System.out.println("Seu desconto é de 10%");
            break;
            case Silver:
                System.out.println("Seu desconto é de 5%");
            break;
        }
    }

    public double getFatura(){
        return fatura;
    }

    public Cliente getCliente(){
        return cliente;
    }

}
