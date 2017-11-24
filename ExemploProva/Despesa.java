public class Despesa
{
    private int mesAno;
    private String descricao;
    private double valor;
    private boolean taxaExtra;
    
    public Despesa(){
        mesAno = 0;
        descricao = "";
        valor = 0;
        taxaExtra = false;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setMesAno(int mesAno){
        this.mesAno = mesAno;
    }
    public int getMesAno(){
        return mesAno;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }
    public void setTaxaExtra(boolean taxaExtra){
        this.taxaExtra = taxaExtra;
    }
    public boolean getTaxaExtra(){
        return taxaExtra;
    }
}
