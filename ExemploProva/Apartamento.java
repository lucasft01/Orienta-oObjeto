public class Apartamento extends Imovel
{
    private int numeroQuartos;
    
    public Apartamento(){
        super(0,0,"");
    }
    
    public double valorVenal(){
        return metrosQuadrados*1000+(numeroQuartos*500);
    }
    
    public void setNumeroQuartos(int numeroQuartos){
        this.numeroQuartos = numeroQuartos;
    }
     public int getNumeroQuartos(){
        return this.numeroQuartos;
    }
}
