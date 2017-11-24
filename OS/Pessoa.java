import java.util.ArrayList;
public class Pessoa
{
    private String nome;
    private ArrayList<Veiculo> veiculos;
    
    public Pessoa(String nome){
        this.nome = nome;
        veiculos = new ArrayList<>();
    }    
     
    public ArrayList<Veiculo> getVeiculos(){
        return veiculos;
    }
    public void adicionarVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    /*public void alterarVeiculo(int pos, Veiculo veiculo){
        this.veiculos.set(pos,veiculo);
    }
    public void removeVeiculo(int pos){
        this.veiculos.remove(pos);
    }
    */
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
