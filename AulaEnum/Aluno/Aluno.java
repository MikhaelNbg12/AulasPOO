package AulaEnum.Aluno;

public class Aluno {
    private String nome, ra;
    private Curso curso;

    Aluno(String nome, 
          String ra, 
          Curso curso){
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    public void mostrar(){
        System.out.println("Nome: "+nome);
        System.out.println("RA: "+ra);
        System.out.println("Curso: "+curso);
    } 
    
    public void verEsteriotipo(){
        switch (curso){
            case ADS:
                System.out.println("COBOLEIRO");
                break;
            case SI:
                System.out.println("DESIGNER");
                break;
            case CD:
                System.out.println("PYTHON");
                break;
            case LOG:
                System.out.println("CAMINHAO E CONTAINER");
                break;
            case RH:
                System.out.println("GUPY");
                break;
            default:
                System.out.println("NÃO SEI");
                break;
        }
    }

    public String getRa(){
        return ra;
    }

    public String getNome(){
        return nome;
    }

    public Curso getCurso(){
        return curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}