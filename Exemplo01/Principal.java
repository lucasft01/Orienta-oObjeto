
public class Principal
{
    
    public static void main(String[] args){
        Aluno aluno1,aluno2;
        
        aluno1 = new Aluno("Zezin",-3,0);
        aluno2 = new Aluno("Pedrin",4);
        
        System.out.println(aluno1.getNota());
        aluno1.setNota(11);
        System.out.println(aluno1.getNota());
        
        System.out.println("Resultado "+aluno1.nome+": "+aluno1.resultado());
        System.out.println("Resultado "+aluno2.nome+": "+aluno2.resultado());
        
        if ( aluno1.getNota() > aluno2.getNota() ){
            System.out.println(aluno1.nome+" tem a maior nota: ");
        }else{
            System.out.println(aluno2.nome+" tem a maior nota: ");            
        }       
        
    }
    
    
}
