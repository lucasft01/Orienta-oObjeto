package sistemaacademia;

import java.util.ArrayList;

public class Academia {
    
    private ArrayList<Turma> listaTurmas;
    private ArrayList<Aula> listaAulas;
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Professor> listaProfessores;

    public Academia(){
        listaTurmas = new ArrayList<>();
        listaAulas = new ArrayList<>();
        listaAlunos = new ArrayList<>();
        listaProfessores = new ArrayList<>();
    }
     public ArrayList<Aula> getListaAulas() {
        return listaAulas;
    }

    public void addAulas(Aula aula) {
        listaAulas.add(aula);
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void addAlunos(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void addProfessores(Professor professor) {
        listaProfessores.add(professor);
    }

    public ArrayList<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void addTurmas(Turma turma) {
        listaTurmas.add(turma);
    }
}
