
public class Cobertura extends Imovel
{
    private boolean duplex, triplex;
    
    
    public Cobertura(){
        super(0,0,"");
    }
    
    public double valorVenal(){
        double valor = metrosQuadrados*1000;
        valor = duplex?valor*2:valor;
        valor = triplex?valor*3:valor;
        return valor;
    }
    
    public void setDuplex(boolean duplex){
        this.duplex  = duplex;
    }
    public boolean getDuplex(){
        return this.duplex;
    }
    public void setTriplex(boolean triplex){
        this.triplex  = triplex;
    }
    public boolean getTriplex(){
        return this.triplex;
    }
    
    
}
