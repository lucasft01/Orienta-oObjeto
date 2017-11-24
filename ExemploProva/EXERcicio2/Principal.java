package EXERcicio2;

import java.util.Scanner;

public class Principal
{
    public static void main(String args[]){
        Scanner le = new Scanner(System.in);
        System.out.println("######## TSE #########");
        Turma turma = new Turma();
        System.out.println("## Alunos da Turma");
        for(int i = 1; i <=5; i++){
          System.out.println("# Nome do Aluno "+i+") ");
          Aluno a = new Aluno(le.next());
          turma.addAluno(a);
        }
        
        
        System.out.println("## VOTAÇÃO");
        System.out.println("## Alunos da Turma:");
        int i = 1;
        //for(int i = 1; i <=5; i++){
        //Aluno alu =  turma.getAlunos().get(i);    
        for(Aluno alu: turma.getAlunos()){
          System.out.println("# "+(i++)+" - "+alu.getNome() );  
        }
        
        for(Aluno alu: turma.getAlunos()){
          System.out.println("# "+alu.getNome() +" qual o seu voto?");  
          int voto = le.nextInt();
          turma.getAlunos().get(voto-1).votar();
        }
        
        
        System.out.println("## APURAÇÃO");
        Aluno representante = turma.getAlunos().get(0);
        for(Aluno alu: turma.getAlunos()){
            if (representante.getNumVotos() < alu.getNumVotos()){
               representante = alu; 
            }
        }
        turma.setRepresentante(representante);
        
        System.out.println("## "+turma.getRepresentante().getNome());
        
    }
}
