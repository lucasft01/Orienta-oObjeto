package EXERcicio2;

import java.util.ArrayList;

public class Turma
{
    
    private Aluno representante;
    private ArrayList<Aluno> alunos;
    
    public Turma(){
        alunos = new ArrayList<>();
    }
    
    
    public void setRepresentante(Aluno representante){
        this.representante = representante;
    }
    public Aluno getRepresentante(){
        return representante;
    }
    
    public void addAluno(Aluno alu){
        this.alunos.add(alu);
    }
    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }
    
}
