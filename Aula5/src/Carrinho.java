public class Carrinho {
    
    private Produto[] produtos;
    //final -> produto constante
    //static -> desaclopa o atributo/instancia
    private final static int MAX_QTD = 5;
    private int qtAtual;

    public Carrinho(){
        produtos = new Produto[MAX_QTD];
    }

    public void inserir(Produto prod) throws Exception {
        if(qtAtual >= MAX_QTD){
            //Throw -> Para a aplicacao
            throw new Exception("Estourou a pilha");
        }produtos[qtAtual++] = prod;
    }

    public Produto desempilhar() throws Exception {
        if(qtAtual == 0){
            throw new Exception("Underflow");
        }
        Produto p = produtos[--qtAtual];
        produtos[qtAtual] = null;
        return p;
    }

    public void listar(){
        for(int i=0; i < qtAtual; i++){
            produtos[i].mostrar();
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(int i=0; i < qtAtual; i++){
            total = total + produtos[i].getPreco();
        }
        System.out.println("O total da compra é: "+total);
        return total;
    }

    public double calcularTipo(TipoProduto tipoProduto){
        double total = 0;
        for(int i=0; i < qtAtual; i++){
            if(produtos[i].verificarTipo(tipoProduto))
            total = total + produtos[i].getPreco();
        }
    System.out.println("O total da compra desse tipo é: "+total);
        return total;
    }

    //Exercício: implementar o método verificarNome da mesma forma que o verificarTipo
    public void buscarPorNome( String nome){
        for(int i=0; i < qtAtual; i++){
            if(produtos[i].getNome() == nome){
                produtos[i].mostrar();
            }
        }
    }
}
