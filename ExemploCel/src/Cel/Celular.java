package Cel;

public class Celular {
    
    private boolean ligado;
    private String nome;
    private Bateria bateria;
    private Chip chip;

    public Celular(String nome, Bateria bateria, Chip chip) {
        this.nome = nome;
        this.bateria = bateria;
        this.chip = chip;
    }
    
    public boolean isOk(){
        return !ligado && !bateria.isVazio() && chip.isValido();
    }

    public void ligar(){
        if(isOk()){
            System.out.println("Ligou");
            ligado = !ligado;
            bateria.gastar();
        }
    }

    public void desligar(){
        if(ligado){
            System.out.println("Adeus!!!");
            ligado = !ligado;
        }
    }

    public void mostrarBoasVindas(){
        if(ligado && !bateria.isVazio()){
        System.out.println("OI, "+nome);
        bateria.gastar();
        bateria.gastar();
    }
    }
}
