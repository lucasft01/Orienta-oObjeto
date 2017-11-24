package sistemaacademia;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAcademia {
    public static void main(String[] args) {
        
        Atendente at= new Atendente();
        Scanner teclado= new Scanner(System.in);
        //Academia academia= new Academia();
        
        String resp= "S";
        int i;
        
        for(i=0; i<1; i++){
            System.out.println("Construir Salas/Turmas: ");
            Turma turma = new Turma();
            System.out.print("Limite da Turma: ");turma.setLimiteAlunos(teclado.nextInt());
//            System.out.print("Id turma: ");turma.setId(teclado.nextInt());
            turma.setId(i);
            at.getAcademia().addTurmas(turma);
        }
        
        System.out.println("\nCadastro Aula");
        for(i=0;i<1 ;i++){
            Aula a= new Aula();
            System.out.print("Nome Aula: "); a.setNomeAula(teclado.next());
            a.setId(i);
            at.getAcademia().addAulas(a);
        }
        
        System.out.println("\nCadastro Professores");
        for(i=0; i<1; i++){
            Professor p= new Professor();
            p.setMatriculaFuncionario(i);
            System.out.print("Nome Professor: "); p.setNome(teclado.next());
            at.getAcademia().addProfessores(p);
        }
        
        System.out.println("\nCadastro Aluno");
        for(i=0; i<1; i++){
            Aluno al= new Aluno();
//            System.out.print("Matricula Aluno: "); al.setMatriculaAluno(teclado.nextInt());
            al.setMatriculaAluno(i);
            System.out.print("Nome Aluno: "); al.setNome(teclado.next());
            at.cadastrarAlunoNaAcademia(al);
            System.out.print("Aula desejada(id): "); int id= teclado.nextInt();
            at.cadastrarAlunoEmAula(al, id);
        }
        
        System.out.println("\n\n");
        for(i=0; i<1; i++){
            System.out.print("Aula: " + at.getAcademia().getListaAulas().get(i).getNomeAula()+"\n");
            System.out.print("Professor(" + i + "): " + at.getAcademia().getListaProfessores().get(i).getNome()+"\n");
            System.out.print("Aluno("+i+"): " + at.getAcademia().getListaAlunos().get(i).getNome()+"\n");
            System.out.println("Matricula aluno("+i+"): " + at.getAcademia().getListaAlunos().get(i).getMatriculaAluno());
        }
    }
}
