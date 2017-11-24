package sistemaacademia;

//import java.sql.Time;
import java.util.ArrayList;
//import java.util.Date;

public class Aula {
    private int id;
    private Professor professor;
    private String nomeAula;
    private Academia academia;
//    private ArrayList<Turma>listaTurmas = new ArrayList<>();
    private ArrayList<Aluno>listaAlunos = new ArrayList<>();   
    public Aula(){
//        listaTurmas = new ArrayList<>();
        listaAlunos = new ArrayList<>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String getNomeAula() {
        return nomeAula;
    }

    public void setNomeAula(String nomeAula) {
        this.nomeAula = nomeAula;
    }
    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
//     public ArrayList<Turma> getListaTurmas() {
//        return listaTurmas;
//    }
//
//    public void addTurmas(Turma turma) {
//        listaTurmas.add(turma);
//    }
    
    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void addAlunos(Aluno aluno) {
        listaAlunos.add(aluno);
    }
    
//
//    public Date getDataAula() {
//        return dataAula;
//    }
//
//    public void setDataAula(Date dataAula) {
//        this.dataAula = dataAula;
//    }
//
//    public Time getHoraAula() {
//        return horaAula;
//    }
//
//    public void setHoraAula(Time horaAula) {
//        this.horaAula = horaAula;
//    }


//    
//    public ArrayList<Aluno> getListaAlunos() {
//        return listaAlunos;
//    }
//
//    public void addAlunos(Aluno aluno) {
//        listaAlunos.add(aluno);
//    }

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

}
