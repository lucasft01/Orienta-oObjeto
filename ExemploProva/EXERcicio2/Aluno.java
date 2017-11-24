package EXERcicio2;


public class Aluno
{
    private String nome;
    private int numVotos;
    
    public Aluno(String nome){
        this.nome = nome;
        numVotos = 0;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void votar(){
        this.numVotos ++;
    }
    public int getNumVotos(){
        return numVotos;
    }
}
