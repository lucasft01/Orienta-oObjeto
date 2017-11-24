import java.util.Scanner;

public class Principal
{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        Funcionario f1,f2;
        
        f1 = new Funcionario("Zezin",30,25,5,1000,true);
        f2 = new Funcionario("Pedrin", 18, 10, 1, 1500);
        
        System.out.println("\n#### FUNCIONÁRIO 1 ####\n");
        System.out.print("Nome             :"); f1.setNome( teclado.next() );
        System.out.print("Idade            :"); f1.setIdade( teclado.nextInt() );
        System.out.print("Tempo de Serviço :"); f1.setTempoServico( teclado.nextInt() );
        System.out.print("nro Filhos       :"); f1.setNumeroFilhos( teclado.nextInt() );
        System.out.print("Salário Bruto    :"); f1.setSalarioBruto( teclado.nextDouble() );
        System.out.print("Trabalha a noite :"); f1.setNoturno( teclado.nextBoolean() );
        
        System.out.println("\n#### FUNCIONÁRIO 2 ####\n");
		//teclado.nextLine();
        System.out.print("Nome             :"); f2.setNome( teclado.next() );
        System.out.print("Idade            :"); f2.setIdade( teclado.nextInt() );
        System.out.print("Tempo de Serviço :"); f2.setTempoServico( teclado.nextInt() );
        System.out.print("nro Filhos       :"); f2.setNumeroFilhos( teclado.nextInt() );
        System.out.print("Salário Bruto    :"); f2.setSalarioBruto( teclado.nextDouble() );
        System.out.print("Trabalha a noite :"); f2.setNoturno( teclado.nextBoolean() );
        
        Funcionario funcMaior = null;
        
        if ( f1.salarioLiquido() > f2.salarioLiquido() ){
            funcMaior = f1; 
        }else{ 
            funcMaior = f2;
        }
                
        System.out.println(f1.getSalarioBruto());
        
        funcMaior.setSalarioBruto( funcMaior.getSalarioBruto() + 100 );
        
        System.out.println(f1.getSalarioBruto());
        
        System.out.println(funcMaior.getNome() + " tem o maior Salário "+funcMaior.salarioLiquido()); 
        
    }
}
