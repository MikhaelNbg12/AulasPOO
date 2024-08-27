package Cel;

public class Bateria {
    private int carga;

    public Bateria(int carga) {
        this.carga = carga;
    }

    public void recarregar(){
        //carga++
        carga = Math.min(100,++carga);
    }

    public void gastar(){
        carga = Math.max(0,--carga);
    }

    public boolean isVazio(){
        return carga == 0;
    }

    public void mostrarCarga(){
        System.out.println("A carga da bateria é: "+carga);
    }
}
