/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profprograma;

import java.util.Scanner;
import profprograma.model.Motorista;
import profprograma.model.Professor;
import profprograma.model.Profissao;

/**
 *
 * @author professor
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner le = new Scanner(System.in);
        System.out.println("TESTE");
        
//        Profissao p = new Profissao("Zezin", 500, 20, true);
//        System.out.println("Profissão: "+p.getNome()+" Salário: R$"+p.salario());
        
        
        Professor p1 = new Professor(25, true, false, "Gustin", 150, 40, true);
        System.out.println("Professor: "+p1.getNome()+" Salário: R$"+p1.salario());
        
        Motorista mot = new Motorista(10, "Jukinha", 80, 12, true);
        System.out.println("Motorista: "+mot.getNome()+" Salário: R$"+mot.salario());
        
        
    }
    
}
