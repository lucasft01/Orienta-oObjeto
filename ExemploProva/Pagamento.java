public class Pagamento
{
    private int mesAno;
    private double valorPago;
    private Condominio condominio;
    private Imovel imovel;
    
    public Pagamento(){
        mesAno = 0;
        valorPago = 0;
    }
    public void setMesAno(int mesAno){
        this.mesAno = mesAno;
    }
    public int getMesAno(){
        return mesAno;
    }
    public void setValorPago(double valorPago){
        this.valorPago = valorPago;
    }
    public double getValorPago(){
        return valorPago;
    }
    public void setCondominio(Condominio condominio){
        this.condominio = condominio;
    }
    public Condominio getCondominio(){
        return condominio;
    }
    public void setImovel(Imovel imovel){
        this.imovel = imovel;
    }
    public Imovel getImovel(){
        return imovel;
    }
}
