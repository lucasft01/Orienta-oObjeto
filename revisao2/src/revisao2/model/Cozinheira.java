/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2.model;

/**
 *
 * @author professor
 */
public class Cozinheira extends Funcionario {

    private int horaExtra;

    @Override
    public double getSalario() {
        return salario + (horaExtra*(salario/(40*4)));
    }

    public Cozinheira() {
    }

    public Cozinheira(int horaExtra, String nome, double salario) {
        super(nome, salario);
        this.horaExtra = horaExtra;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    
    
}
