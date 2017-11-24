import java.util.Scanner;
public class Principal
{
    
    public static void main(String args[]){        
        Scanner le = new Scanner(System.in);
        
        System.out.println("Dados da Pessoa");
        Pessoa p =new Pessoa();
        System.out.print("Nome: ");p.setNome(le.next());
        System.out.print("CPF: ");p.setCpf(le.next());
        System.out.println("-------------------------");
        String continua = "s";
        while (continua.equalsIgnoreCase("s")){ 
            System.out.println("Deseja Cadastrar (C)onta ou"+
            " Conta (E)special?");
            String resp = le.next();
            Conta c;
            if (resp.equalsIgnoreCase("e")){
                c = new ContaEspecial(0,0); 
                System.out.print("Limite: ");
                ((ContaEspecial)c).setLimiteCredito(le.nextDouble());              
            }else{
                c = new Conta(0);
            }
            System.out.print("Numero: ");c.setNumero(le.nextInt());    
            c.setCorrentista(p);
            p.addConta(c);
            System.out.println("Deseja Continuar? (S)im (N)ão");
            continua = le.next();            
        }
        System.out.println("Operações");
        continua = "s";
         while (continua.equalsIgnoreCase("s")){ 
             System.out.println("Escolha uma conta:");
             int i = 1;
             for(Conta c: p.getContas() ){               
                 System.out.println((i++)+") conta: "+c.getNumero());
             }
             int idx = le.nextInt();
             System.out.println("Operação (D)eposito ou (R)etirada:");
             String op = le.next();
             System.out.println("Valor da Operação:");
             double valor = le.nextDouble();
             
             if (op.equalsIgnoreCase("D")){
               p.getContas().get(idx-1).depositar(valor);
             }else{                
               p.getContas().get(idx-1).sacar(valor);
             }
             System.out.println("Deseja Continuar? (S)im (N)ão");
            continua = le.next();  
         }
        
        
        System.out.println("-------------------------");
        for (Conta c: p.getContas()){
            System.out.println("> "+c.toString());
        }
        System.out.println("Saldo > R$ "+p.saldoTotal());
        
    }
    
}
