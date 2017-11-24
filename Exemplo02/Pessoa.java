
public abstract class Pessoa
{
    
  private String nome;
    protected int tempoServico;
    private double salario;      
    
    /*
    public Pessoa(){
      this.nome = "";
      tempoServico = 0;
      salario = 0;
      
    }
    */
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome,int tempoServico){
        this.nome = nome;
        this.tempoServico = tempoServico;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if (nome != ""){
          this.nome = nome;
        }
    }
    
    public int getTempoServico(){
        return this.tempoServico;
    }
    public void setTempoServico(int tempoServico){
        if (tempoServico >= 0 && tempoServico <= 45){
            this.tempoServico = tempoServico;
        }
    }
    
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        if (salario >= 0 ){
            this.salario = salario;
        }
    }
       
   public abstract double salarioLiquido();
    
   protected double inss(){
		return getSalario() * 0.13;
    }
    
   protected double bonusTemposServico(){
      int qtdeQuinquenio = tempoServico/5;
	  return (qtdeQuinquenio*0.09)*salario;	
    }
    
}
