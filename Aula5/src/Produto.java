public class Produto {

    private String nome;
    private double preco;
    private TipoProduto tipoProduto;
    
    public Produto(String nome, double preco, TipoProduto tipoProduto) {
        this.nome = nome;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void mostrar(){
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+preco);
        System.out.println("Tipo: "+tipoProduto);
        System.out.println("Código: "+tipoProduto.getCodigo());
    }

    public boolean verificarTipo(TipoProduto tipoProduto){
        return tipoProduto == tipoProduto;
    }
}

    

