import java.util.Date;
import java.util.ArrayList;
public class OS
{
    
    private Date data;
    private double valor;
    private Pessoa mecanico;
    private Veiculo veiculo;
    private ArrayList<Peca> pecas;
        
    public OS(){
        pecas = new ArrayList<>();
    }
    
    public double valorPecas(){
        double total = 0;
        for(Peca p: pecas){
            total += p.getValor();            
        }
        return total;
    }    
    
    public double precoOS(){
        return valor + valorPecas();
    }
    
    
    public ArrayList<Peca> getPecas(){
        return pecas;
    }
    public void adicionarPeca(Peca peca){
        this.pecas.add(peca);
    }
    
    public Veiculo getVeiculo(){
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }  
    
    public Pessoa getMecanico(){
        return mecanico;
    }
    public void setMecanico(Pessoa mecanico){
        this.mecanico = mecanico;
    }  
    
    public Date getDate(){
        return data;
    }
    public void setDate(Date data){
        this.data = data;
    }    
    
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    
}
