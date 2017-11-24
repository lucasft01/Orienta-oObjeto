
public class Funcionario extends Pessoa
{

    private int idade, numeroFilhos;
    private boolean noturno;
    
    public Funcionario(String nome, int idade, int tempoServico, int numeroFilhos,
    double salarioBruto, boolean noturno){
        super(nome);
        //this.setNome(nome);
        this.idade = idade;
        this.tempoServico = tempoServico;
        this.numeroFilhos = numeroFilhos;
        this.setSalario(salarioBruto);
        this.noturno = noturno;
    }
    public Funcionario(String nome, int idade, int tempoServico, int numeroFilhos,
    double salarioBruto){
        super(nome);
       //this.setNome(nome);
        this.idade = idade;
        this.tempoServico = tempoServico;
        this.numeroFilhos = numeroFilhos;
        this.setSalario(salarioBruto);
        this.noturno = false;
    }
    public Funcionario(String nome, int idade){
        super(nome);
      //this.setNome(nome);
        this.idade = idade;
        this.tempoServico = this.numeroFilhos = 0;
      this.setSalario(0);
        this.noturno = false;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
    }
    
    public int getNumeroFilhos(){
        return this.numeroFilhos;
    }
    public void setNumeroFilhos(int numeroFilhos){
        if (numeroFilhos >= 0 ){
            this.numeroFilhos = numeroFilhos;
        }
    }
    
    public boolean getNoturno(){
        return this.noturno;
    }
    public void setNoturno(boolean noturno){
            this.noturno = noturno;
    }
    
   private double bonusNumeroFilho(){
		if (numeroFilhos <= 3){
			return 50*numeroFilhos;
		}else{
			return 150;
		}
		//return (numeroFilhos <=3) ? 50*numeroFilhos : 150;
    }

   private double bonusTrabalhadorNoturno(){
     return noturno? 0.25*getSalario() : 0;
   }
  
    public double salarioLiquido(){
		return  getSalario() - inss() + bonusNumeroFilho() + bonusTemposServico() 
			+ bonusTrabalhadorNoturno();
        
       /* double salLiq = salarioBruto * 0.87;
        
        if (numeroFilhos <=3){
            salLiq += 50*numeroFilhos;
        }else{
           salLiq += 150; 
        }
        
        int quin = tempoServico/5;
        salLiq += (quin*0.09)*salarioBruto;
        
        salLiq += noturno? 0.25*salarioBruto : 0;
        
       return salLiq; */
    }
    
    
    
}
