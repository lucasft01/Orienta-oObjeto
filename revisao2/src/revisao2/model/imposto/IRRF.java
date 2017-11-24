/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2.model.imposto;

import revisao2.model.IImposto;

/**
 *
 * @author professor
 */
public class IRRF implements IImposto {

    private double lucroLiquido;
    private double rendaAnual;

    @Override
    public double valorImposto() {
        if (rendaAnual <= 24000) {
            return 0 * lucroLiquido;
        } else if (rendaAnual <= 38000) {
            return 0.07 * lucroLiquido;
        } else if (rendaAnual <= 50000) {
            return 0.15 * lucroLiquido;
        } else {
            return 0.275 * lucroLiquido;
        }
    }

    public IRRF() {
    }

    public IRRF(double lucroLiquido, double rendaAnual) {
        this.lucroLiquido = lucroLiquido;
        this.rendaAnual = rendaAnual;
    }

    public double getLucroLiquido() {
        return lucroLiquido;
    }

    public void setLucroLiquido(double lucroLiquido) {
        this.lucroLiquido = lucroLiquido;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

}
