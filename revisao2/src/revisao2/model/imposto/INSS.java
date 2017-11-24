/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2.model.imposto;

import java.util.ArrayList;
import revisao2.model.IFuncionario;
import revisao2.model.IImposto;

/**
 *
 * @author professor
 */
public class INSS implements IImposto{

    private ArrayList<IFuncionario> funcionarios;
    private double percentualImposto;
    
    @Override
    public double valorImposto() {
        double valor = 0;
        for (IFuncionario func : funcionarios) {
            valor += func.getSalario()*(percentualImposto/100);
        }
       return valor/3000;
    }

    public INSS() {
        funcionarios = new ArrayList<>();
    }

    public INSS(ArrayList<IFuncionario> funcionarios, double percentualImposto) {
        this.funcionarios = funcionarios;
        this.percentualImposto = percentualImposto;
    }

    public ArrayList<IFuncionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<IFuncionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double getPercentualImposto() {
        return percentualImposto;
    }

    public void setPercentualImposto(double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }
    
    
    
}
