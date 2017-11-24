
/**
 * Write a description of class ContaEspecial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContaEspecial extends Conta
{
    private double limiteCredito;
    //Cuidado para nao errar na prova!
    //Se nao tiver o construtor padrao no pai(vazio), entao tenho que criar um;
    //Sou obrigado a impementar um construtor porque o java pega o construtor do pai vazio. Mas o pai nao tem.
    public ContaEspecial(int numero, double limiteCredito){
        super(numero);//Uso o super para usar  construtor do pai;
        this.limiteCredito= limiteCredito;
    }
    public ContaEspecial(int numero){
        this(numero, 0);//this para usar o construtor da propria classe
        //ou faço assim:
        //super(numero);  //Uso o super para usar  construtor do pai;
        //this.limiteCredito= limiteCredito;
    }
    
    public void setLimiteCredito(double limiteCredito){
        this.limiteCredito= limiteCredito;
    }
    public double getLimiteCredito(){
        return limiteCredito;
    }
    
    //Como o metodo sacar herdado nao me atende, e necessario sobrepo-lo:
    @Override // e uma anotaçao para infromar que esse metodo foi sobrescrito
    public void sacar(double valor){
       if (valor <= saldo+limiteCredito){// tenho que colocar a variavel como protected na classe pai, pois nao temos o metodo set para essa variavel. 
                                                               //Entao, nao preciso colocar o get aqui tbm!;
         saldo -= valor;      
       }
    }
}
