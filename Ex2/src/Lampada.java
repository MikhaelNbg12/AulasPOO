public class Lampada {
    private Estado estado;
    private int qtdAcendimentos;

    public Lampada(Estado off, int i) {
        this.estado = estado;
        this.qtdAcendimentos = qtdAcendimentos;
    }

    public void click (){
    if(estado == Estado.ON){
        estado = Estado.OFF;
    }
    else {
        estado = Estado.ON;
        qtdAcendimentos++;
    }
    }

    public int qtdAcendimentos(){
        return qtdAcendimentos;
    }

    public void mostrarQtdAcendimentos(){
        System.out.println("Foram acesas "+qtdAcendimentos+" vezes.");
    }

    public Estado checkEstado(){
        return estado;
    }
}
