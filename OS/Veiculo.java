import java.util.Calendar;
import java.util.Date;
public abstract class Veiculo
{
    private int ano,km;
    private String modelo;
    private double comsumoMedio, valor;
    private Pessoa proprietario;
    
    public Veiculo(){
        ano = km = 0;
        modelo="";
        comsumoMedio= valor = 0;
    }
    
    public Pessoa getProprietario(){
        return proprietario;
    }
    public void setProprietario(Pessoa proprietario){
        this.proprietario = proprietario;
    }
    
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getKm(){
        return km;
    }
    public void setKm(int km){
        this.km = km;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public double getComsumoMedio(){
        return comsumoMedio;
    }
    public void setComsumoMedio(double comsumoMedio){
        this.comsumoMedio = comsumoMedio;
    }
    
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public abstract double precoVenda();
    
    public int tempoUso(){        
        Calendar c = Calendar.getInstance();
        int anoAtual = c.get( Calendar.YEAR );
     return anoAtual - ano;   
    }
}
