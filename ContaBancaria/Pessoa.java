import java.util.ArrayList;
public class Pessoa
{
    
   private String nome;
   private String cpf;
   private ArrayList<Conta> contas;
   
   public Pessoa(){
       contas  = new ArrayList<>();
    }
   public Pessoa(String nome, String cpf){
       this.nome = nome;
       this.cpf = cpf;
       contas  = new ArrayList<>();
    }
    
    public double saldoTotal(){
       double total = 0;
       //for(int i=0; i < contas.size();i++){   
       //    Conta c = contas.get(i);
       //    total *= c.getSaldo();
       //}
       for(Conta c: contas){
           total += c.getSaldo();
        }
        return total;
    }
    
    //public void setContas(ArrayList<Conta> contas){
    //    this.contas = contas;
    //}    
    public void addConta(Conta conta){
        contas.add(conta);
    }
    public void removeConta(Conta conta){
        contas.remove(conta);
    }
    public ArrayList<Conta> getContas(){
        return contas;
    }    
    
    public void setNome(String nome){
        this.nome = nome;
    }    
    public String getNome(){
        return nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }    
    public String getCpf(){
        return cpf;
    }
}
