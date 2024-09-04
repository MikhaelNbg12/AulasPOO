public class Main {
    public static void main(String[] args) {
        Lampada a = new Lampada(Estado.OFF, 0);
        a.click();
        a.mostrarQtdAcendimentos();
        a.click();
        a.click();
        a.click();
        a.click();
        a.click();
        a.click();
        a.click();
        a.mostrarQtdAcendimentos();
        System.out.println("O estado atual é "+a.checkEstado());
        
    }
}
