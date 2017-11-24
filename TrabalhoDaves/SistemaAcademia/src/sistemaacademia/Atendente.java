package sistemaacademia;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Atendente{
    private int matriculaFuncionario;
    private String nome;
    private Academia academia;
//    private ArrayList<Turma> listaTurmas;
//    private ArrayList<Aula> listaAulas;
//    private ArrayList<Aluno> listaAlunos;
//    private ArrayList<Professor> listaProfessores;

    public Atendente(){
            academia = new Academia();
//        listaTurmas = new ArrayList<>();
//        listaAulas = new ArrayList<>();
//        listaAlunos = new ArrayList<>();
//        listaProfessores = new ArrayList<>();
    }
    
    
//    public void cadastrarAula(Turma t, Aula a, Professor p){
//        academia = new Academia();
//        a.setProfessor(p);
//        a.addTurmas(t);
//        p.addTurmas(t);
//        p.addAulas(a);
//        t.addAulas(a);
//        t.addProfessores(p);
//        academia.addTurmas(t);
//        academia.addAulas(a);
//        academia.addProfessores(p);
////        listaTurmas.add(t);
////        listaAulas.add(a);
////        listaProfessores.add(p);  
//    }
    public void cadastrarAlunoNaAcademia(Aluno al){
        academia.addAlunos(al);
    }
    
    public void cadastrarAlunoEmAula(Aluno al, int id){
        int i, indice= 0;
        for(i=0;; i++){
            if( id == academia.getListaAulas().get(i).getId()){
                indice = id;
                break;
            }
        }
        academia.getListaAulas().get(indice).addAlunos(al);
    }
    
    public void verificaNumAluno(int id){
        int i, indice= 0;
        for(i=0;;i++){
            if( id == academia.getListaAulas().get(i).getId()){
                indice = id;
                break;
            }
            if( id == academia.getListaAulas().get(i).getId()){
                indice = id;
                break;
            }
    }
    
    
    }

//    public int verificaQuantAulaAluno(int matriculaAluno){
//        int i, soma= 0;
//        Aluno aluno = null;
//        Aula aula = null;
//        for(i=0; i<=listaAulas.size(); i++){
//            if(listaAlunos.get(i).getMatriculaAluno()==matriculaAluno){
//                aluno = listaAlunos.get(i);
//                
//            }
//        
//        }
//        return 0;
//    }
//    public ArrayList<Turma> getListaTurmas() {
//        return listaTurmas;
//    }
//
//    public void addTurmas(Turma turma) {
//        listaTurmas.add(turma);
//    }
//
//    public ArrayList<Aula> getListaAulas() {
//        return listaAulas;
//    }
//
//    public void addAulas(Aula aula) {
//        listaAulas.add(aula);
//    }
//
//    public ArrayList<Aluno> getListaAlunos() {
//        return listaAlunos;
//    }
//
//    public void addAlunos(Aluno aluno) {
//        listaAlunos.add(aluno);
//    }
//
//    public ArrayList<Professor> getListaProfessores() {
//        return listaProfessores;
//    }
//
//    public void addProfessores(Professor professor) {
//        listaProfessores.add(professor);
//    }

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
    
}
