package AulaEnum.Exercicio;

public class Cartao {
    private double fatura;
    private Cliente cliente;

    Cartao (double fatura, Cliente cliente){
        this.fatura = fatura;
        this.cliente = cliente;
    }

    public double calcularDesc(do){
        switch (cliente) {
            case Platinum:
                return 0.85 * fatura;
            break;
            case Gold:
                return 0.90 * fatura;
            break;
            case Silver:
                return 0.95* fatura;
            break;
        }
    }

    public void mostrar (){
        System.out.println("Sua fatura é: "+fatura);
        System.err.println("Você é cliente "+cliente);
    }

    public double getFatura(){
        return fatura;
    }

    public Cliente getCliente(){
        return cliente;
    }

}
