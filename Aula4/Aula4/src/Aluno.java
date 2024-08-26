public class Aluno {
    
    private String nome, email;
    private Endereço endereço;

    public Aluno(String nome,
                String email,
                Endereço endereço){
        this.nome = nome;
        this.email = email;
        this.endereço = endereço;}
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void mostrar(){
        System.out.println("Nome: "+nome);
        System.out.println("Nome: "+email);
        endereço.mostrar();
    }
}
