public class Endereço {
    
    private String logradouro, cep, cidade;
    private Estado estado;

    public Endereço(String logradouro,
                    String cep,
                    String cidade,
                    Estado estado){
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;}
    
    public void mostrar(){
        System.out.println(logradouro);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
