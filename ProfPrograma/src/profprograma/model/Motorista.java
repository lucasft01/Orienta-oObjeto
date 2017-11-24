/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profprograma.model;

/**
 *
 * @author professor
 */
public class Motorista extends Profissao{
    
    private int numViagens;
    public static final int DIARIA = 150;

    public Motorista() {
    }

    public Motorista(int numViagens, String nome, double salario, int tempoServico, boolean ehTrabalhadorNoturno) {
        super(nome, salario, tempoServico, ehTrabalhadorNoturno);
        this.numViagens = numViagens;
    }

    @Override
    public double salario() {
        return (getSalario() * numViagens) + (numViagens * DIARIA) - inss();
    }

    
    
    public int getNumViagens() {
        return numViagens;
    }

    public void setNumViagens(int numViagens) {
        this.numViagens = numViagens;
    }

    @Override
    public double valorAposentadoria() {
        return 0;
    }
    
    
    
}
