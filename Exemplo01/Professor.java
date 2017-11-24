
public class Professor
{
    String nome;
    int matricula, cargaHoraria;
    boolean temMestrado, temDoutorado;
    double valorHoraAula;
    
    Professor(String n, int mat, int ch, boolean mest, boolean dout, double vlr){
        nome = n;
        matricula = mat;
        cargaHoraria = ch;
        temMestrado = mest;
        temDoutorado = dout;
        valorHoraAula = vlr;
    }
    
    
    double salario(){
        
        double sal = cargaHoraria * valorHoraAula;
        
        if (temMestrado && temDoutorado){
            sal = sal * 1.5;
        }else  if (temMestrado){
            sal *= 1.2;
        }else  if (temDoutorado){
            sal *= 1.3;
        } 
        return sal;
    }
}
