
public class Conta
{
   private int numero;
   protected double saldo;
   private Pessoa correntista;
   
   public Conta(int numero){
       this.numero = numero;
       saldo = 0;
    }
    
    public String toString(){
        return "Conta "+numero+", Saldo: R$ "+saldo+
        ". Correntista: "+correntista.getNome();
    }
    
    public void depositar(double valor){
        saldo += valor;        
    }
    public void sacar(double valor){
       if (valor <= saldo){
         saldo -= valor;      
       }
    }
    
    public void setCorrentista(Pessoa correntista){
        this.correntista = correntista;
    }
    public Pessoa getCorrentista(){
        return correntista;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    
    
}
