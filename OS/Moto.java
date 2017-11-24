
public class Moto extends Veiculo
{
    private double licenca;
    
    public double precoVenda(){
        int km1000 = getKm() / 1000;
        return getValor() - (500 * km1000);
    }
    
    public void setLicenca(double licenca){
        this.licenca = licenca;
    }
    public double getLicenca(){
        return licenca;
    }
    
}
