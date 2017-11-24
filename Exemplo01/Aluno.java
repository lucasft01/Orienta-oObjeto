
public class Aluno
{
    String nome;
    private double nota,nota2,faltas;
    
    Aluno(){
        nome = "";
        nota=nota2=faltas = 0;
       }
    Aluno(String n, double nt1,double nt2,double fal){
        nome = n;
        setNota(nt1);
        nota2 = nt2;
        faltas = fal;
    }
    Aluno(String n, double nt1,double nt2){
        nome = n;
        setNota(nt1);
        nota2 = nt2;
    }
    Aluno(String n, double nt){
        nome = n;
        setNota(nt);
    }   
    Aluno(double fal, String n, double nt){
        nome = n;
        setNota(nt);
        faltas = fal;
    }
    Aluno(String n){
        nome = n;
        setNota(0);
    }

    String resultado(){
     if (nota >= 6){
         return "Aprovado";
       }    else {
         return "Reprovado";
       }
    }    

    public double getNota(){
        return nota;
    }
    public void setNota(double novanota){
        if (novanota >= 0 || novanota <=10){            
           nota = novanota;
        }
    }
    
    
    
    
}
