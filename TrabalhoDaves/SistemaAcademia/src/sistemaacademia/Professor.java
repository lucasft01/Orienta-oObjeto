package sistemaacademia;

import java.util.ArrayList;

public class Professor{
    private int matriculaFuncionario;
    private String nome;
    private Academia academia;
    
    public Professor(){
//        listaTurmas = new ArrayList<>();
//        listaAulas = new ArrayList<>();

    }

    
    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
//    public ArrayList<Turma> getListaTurmas() {
//        return listaTurmas;
//    }
//
//    public void addTurmas(Turma turma) {
//        listaTurmas.add(turma);
//    }
    
    //    public ArrayList<Aula> getListaAulas() {
//        return listaAulas;
//    }
//
//    public void addAulas(Aula aula) {
//        listaAulas.add(aula);
//    }

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
}
