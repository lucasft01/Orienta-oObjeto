package sistemaacademia;

import java.util.ArrayList;

public class Aluno{
    private String nome;
    private int matriculaAluno;
    private Academia academia;
    private ArrayList<Turma> listaTurmas;
    private ArrayList<Aula> listaAulas;
    
    public Aluno(){
        listaTurmas = new ArrayList<>();
        listaAulas = new ArrayList<>();
    }
    
    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
        public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
    
    public ArrayList<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void addTurmas(Turma turma) {
        listaTurmas.add(turma);
    }

    public ArrayList<Aula> getListaAulas() {
        return listaAulas;
    }

    public void addAulas(Aula aula) {
        listaAulas.add(aula);
    }

}
