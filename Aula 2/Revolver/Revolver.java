package Revolver;

public class Revolver {

    int qtMunicao;
    int max;
    
    Revolver(int qtMunicao, int max){
        this.qtMunicao = qtMunicao;
        this.max = max;
    }

    void atirar(){
        if(qtMunicao > 0){
            System.out.println("Pow!!!");
            qtMunicao--;
        }
    }

    void recarregar(){
    {if(qtMunicao < max){
            System.out.println("Revolver recarregado!");
            qtMunicao = max;}
            else{
                System.out.println("O revolver já está carregado");
            }
        }
    }

    void mostrar(){
        System.out.println("Possui: "+qtMunicao+" balas");
    }
}
