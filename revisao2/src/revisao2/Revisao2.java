/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2;

import java.util.ArrayList;
import revisao2.model.Cozinheira;
import revisao2.model.IFuncionario;
import revisao2.model.Refeicao;
import revisao2.model.imposto.INSS;
import revisao2.model.imposto.IRRF;
import revisao2.model.imposto.ISS;
import revisao2.model.ingredientes.IngredienteGramas;
import revisao2.model.ingredientes.IngredienteLiquido;
import revisao2.model.ingredientes.IngredientePedaco;

/**
 *
 * @author professor
 */
public class Revisao2 {

    public static final int FATURAMENTO_ANUAL = 100000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
                
        Refeicao ref = new Refeicao("Feijoada", 2, 0.5, 0.3);
        
        IngredienteGramas a = new IngredienteGramas("Feijão", 40, 0.1, 200);
        IngredienteGramas b = new IngredienteGramas("Arroz",50, 0.05,500);
        IngredientePedaco c = new IngredientePedaco("Calabresa",3,2.5,5,7);
        IngredienteLiquido d = new IngredienteLiquido("Agua", 3, 0.001, 150);
       
        ref.getIngredientes().add(a);
        ref.getIngredientes().add(b);
        ref.getIngredientes().add(c);
        ref.getIngredientes().add(d);
        
        
        IRRF imp1 = new IRRF(ref.getLucro(), FATURAMENTO_ANUAL);
        ISS imp2 = new ISS(ref.getTaxaServico(), false);
        INSS imp3 = new INSS(new ArrayList<IFuncionario>(), 13);
        imp3.getFuncionarios().add( new Cozinheira(1, "Josefina", 550) );
        
        System.out.println("CARDÁPIO DO DIA");
        System.out.println(ref.getNome()+" Preço sem Imposto R$ "+ref.preco());
        
        ref.getImpostos().add(imp1);
        ref.getImpostos().add(imp2);
        ref.getImpostos().add(imp3);
        
        System.out.println(" Preço com Imposto R$ "+ref.preco());
        
        
        
        
    }
    
}
