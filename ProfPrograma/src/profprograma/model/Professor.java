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
public class Professor extends Profissao implements ISindicato,IAposentadoriaEspecial {

    private int numeroAulas;
    private boolean temMesttrado, temDoutorado;

    public Professor(int numeroAulas, boolean temMesttrado, boolean temDoutorado, String nome, double salario, int tempoServico, boolean ehTrabalhadorNoturno) {
        super(nome, salario, tempoServico, ehTrabalhadorNoturno);
        this.numeroAulas = numeroAulas;
        this.temMesttrado = temMesttrado;
        this.temDoutorado = temDoutorado;
    }

    public Professor() {
    }

    @Override
    public double salario() {
        return salarioMensal() - inss() - abonoNoturno()
                + (temDoutorado ? 0.52 * salarioMensal() : 0)
                + (temMesttrado ? 0.25 * salarioMensal() : 0);
    }

    private double salarioMensal() {
        return numeroAulas * getSalario() * 4;
    }

    public int getNumeroAulas() {
        return numeroAulas;
    }

    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }

    public boolean isTemMesttrado() {
        return temMesttrado;
    }

    public void setTemMesttrado(boolean temMesttrado) {
        this.temMesttrado = temMesttrado;
    }

    public boolean isTemDoutorado() {
        return temDoutorado;
    }

    public void setTemDoutorado(boolean temDoutorado) {
        this.temDoutorado = temDoutorado;
    }

    @Override
    public double valorAposentadoria() {        
        return 0;
    }

    @Override
    public double contruibuicaoSindical() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculoAposentadoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   

}
