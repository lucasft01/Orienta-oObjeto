public class Casa extends Imovel
{
    private int metragemTerreno;
    
    public Casa(){
        super(0,0,"");
    }
    
    public double valorVenal(){
        return metrosQuadrados*1500;
    }
    
    public void setMetragemTerreno(int metragemTerreno){
        this.metragemTerreno = metragemTerreno;
    }
     public int getMetragemTerreno(){
        return this.metragemTerreno;
    }
}
