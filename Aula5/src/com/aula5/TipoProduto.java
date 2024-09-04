public enum TipoProduto {
    Tecnologia(101),
    Escritorio (102),
    Alimento (103);

    private int codigo;

    private TipoProduto(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
