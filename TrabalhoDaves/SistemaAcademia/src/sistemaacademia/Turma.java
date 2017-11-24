package sistemaacademia;

import java.util.ArrayList;

public class Turma {
    private int id;
    private int limiteAlunos;
    private int quantAlunos;
    private Academia academia;
//    private ArrayList<Aula> listaAulas;

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }
    
//        private ArrayList<Aula> listaAulas;
//    private ArrayList<Aluno> listaAlunos;
//    private ArrayList<Professor> listaProfessores;

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
    
    public Turma(){
//        listaAulas = new ArrayList<>();
//        listaAlunos = new ArrayList<>();
//        listaProfessores = new ArrayList<>();
    }

    public int getLimiteAlunos() {
        return limiteAlunos;
    }

    public void setLimiteAlunos(int limiteAlunos) {
        this.limiteAlunos = limiteAlunos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
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
}
