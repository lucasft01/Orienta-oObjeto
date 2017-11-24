public class ServidorPublico extends Pessoa
{
   
     
    public ServidorPublico(){
     super("",0);    
    }    
    
   @Override
   protected double inss(){
		return super.inss() * 1.05;
    }
    
    
     public double salarioLiquido(){
         return getSalario() - inss();
     }
    
}
