
public class Carro extends Veiculo
{
   private double ipva;
   
   public double precoVenda(){
       return getValor() - ((tempoUso()) * ipva);
    }
    
    public void setIpva(double ipva){
        this.ipva = ipva;
    }
    public double getIpva(){
        return ipva;
    }
}
