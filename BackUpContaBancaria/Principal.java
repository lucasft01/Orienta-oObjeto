
/**
 * Write a description of class Principal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Principal
{
    public static void main(String args[]){

        Scanner le = new Scanner(System.in); 
        
        System.out.println("Dados da Pessoa");
        Pessoa p = new Pessoa();
        System.out.println("Nome: "); p.setNome(le.next());
        System.out.println("CPF: "); p.setCpf(le.next());
        String continua = "s";
        while(continua.equalsIgnoreCase("s")){
            System.out.println("Deseja Cadastrar (C)onta ou" + " Conta (E)special?");
            String resp= le.next();
            //Poderia fazer desse jeitos, mas nao e tao produtivo neh?!
 //           if(resp.equalsIgnoreCase("e")){
 //               ContaEspecial ce = new ContaEspecial(0, 0);
 //               System.out.println("Numero: "); ce.setNumero(le.NextInt());
 //               System.out.println("LIMITE: "); ce.setLimiteCredito(le.NextDouble());
 //               ce.setCorrentista(p);
 //               p.addConta(ce);
 //           }else{
 //               Conta c = new Conta(0);
 //               System.out.println("Numero: "); c.setNumero(le.NextInt());
 //               System.out.println("LIMITE: "); ce.setLimiteCredito(le.NextDouble());
 //               c.setCorrentista(p);
 //              p.addConta(c);
 //           }
 
            //Jeito melhor:
            Conta c;
             if(resp.equalsIgnoreCase("e")){
                c = new ContaEspecial(0, 0);
                System.out.println("Limite: "); 
                ((ContaEspecial)(c)).setLimiteCredito(le.nextDouble());//Tenho que forçar o java a aceitar que ele e contaEspecial
            }else{
                c = new Conta(0);
            }
            //Coisas em comum entre Conta e ContaEspecial
            System.out.println("Numero: "); c.setNumero(le.nextInt());
            c.setCorrentista(p);
            p.addConta(c);
            System.out.println("Deseja Continuar?  (S)im (N)ao");
            continua= le.next();
        }
        System.out.println("-----------------------------------------------");
        for(Conta c: p.getContas()){
            System.out.println("> "+c.toString());
        }
        System.out.println("Saldo > R$ " + p.saldoTotal());
    }
}
