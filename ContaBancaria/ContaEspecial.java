public class ContaEspecial extends Conta
{
    private double limiteCredito;
    
    public ContaEspecial(int numero, double limiteCredito){
        super(numero);
        this.limiteCredito = limiteCredito;
    }
    public ContaEspecial(int numero){
        this(numero,0);
    }
    
    @Override
    public void sacar(double valor){
       if (valor <= (getSaldo()+limiteCredito)){
           saldo -= valor;      
       }
    }
    
    public void setLimiteCredito(double limiteCredito){
        this.limiteCredito = limiteCredito;
    }
    public double getLimiteCredito(){
        return limiteCredito;
    }
    
}
