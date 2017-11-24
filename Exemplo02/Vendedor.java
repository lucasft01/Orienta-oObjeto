
public class Vendedor extends Pessoa
{
    private double comissao,totalVendas;
 

	public Vendedor(String nome, int tempoServico,double salarioFixo,
		double comissao, double totalVendas){
		    super(nome, tempoServico);
			//this.setNome(nome);
			//this.tempoServico = tempoServico;
			this.setSalario(salarioFixo);
			this.comissao = comissao;
			this.totalVendas = totalVendas;
	   }

	public Vendedor(){
	        super("");
			//this.setNome("");
			this.tempoServico = 0;
			this.comissao = this.totalVendas = 0;
			this.setSalario(0);
	}
      
   private double ComissaoVenda(){
	  return totalVendas * (comissao/100);
    }

	public double salarioLiquido(){

	return getSalario() - inss() + bonusTemposServico() + ComissaoVenda();

	   }
          
    public double getComissao(){
        return this.comissao;
    }
    public void setComissao(double comissao){
            this.comissao = comissao;
    }
    
    public double getTotalVendas(){
        return this.totalVendas;
    }
    public void setTotalVendas(double totalVendas){
            this.totalVendas = totalVendas;
    }
   
}
