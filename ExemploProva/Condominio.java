import java.util.ArrayList;
public class Condominio
{
    private String nome, endereco;
    private ArrayList<Despesa> despesas;
    private ArrayList<Imovel> imoveis;
    private ArrayList<Pagamento> pagamentos;
    
    public Condominio(){
        nome = endereco = "";
        despesas = new ArrayList<>();
        imoveis = new ArrayList<>();
    }
    
    public double valorCondominio(int mesAno){
        double totalDespesas = 0;
        for (Despesa d: despesas){
            if (d.getMesAno() == mesAno){
                totalDespesas += d.getValor();
            }
        }
        return totalDespesas/imoveis.size();
    }
    private int imoveisPagos(int mesAno){
        int soma = 0;
        for (Pagamento p: pagamentos){
            if (p.getMesAno() == mesAno){
                soma++;
            }
        }
        return soma;
    }
    public void relatorio(int mesAno){
        int qtdePg = imoveisPagos(mesAno);
        int qtdeNPg = imoveis.size() - qtdePg;
        double valorCond = valorCondominio(mesAno);
        
        System.out.println("Mês: "+mesAno);
        System.out.println(imoveis.size()
        +" Apartamentos ("+qtdePg+" pagos, "+qtdeNPg+" não pagos)");
        System.out.println("Valor Arrecadao: RS"+qtdePg*valorCond
        +", não pago R$"+qtdeNPg*valorCond);
    }
    public void pagarCondominio(Imovel imovel, int mesAno){
        Pagamento pg = new Pagamento();
        pg.setMesAno(mesAno);
        pg.setImovel(imovel);
        pg.setValorPago( valorCondominio(mesAno) );
        //pagamentos.add(pg);
        adicionarPagamento(pg);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
    public void adicionarDespesa(Despesa desp){
        this.despesas.add(desp);
    }
    public ArrayList<Despesa> getDespesas(){
        return despesas;
    }
    public void adicionarImovel(Imovel desp){
        this.imoveis.add(desp);
    }
    public ArrayList<Imovel> getImoveis(){
        return imoveis;
    }
    public void adicionarPagamento(Pagamento pag){
        this.pagamentos.add(pag);
    }
    public ArrayList<Pagamento> getPagamentos(){
        return pagamentos;
    }
}
