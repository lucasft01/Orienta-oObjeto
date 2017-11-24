/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import model.Caminhao;
import model.Carreta;
import model.Carro;
import model.Chapa;
import model.IAjudante;
import model.IVeiculoCarga;
import model.MenorAprendiz;
import model.Veiculo;
import model.categoria.EtipoTransporte;

/**
 *
 * @author professor
 */
public class Principal {

    private static Scanner le;
    private static ArrayList<Veiculo> frota = new ArrayList<>();
    private static ArrayList<IAjudante> ajudantes = new ArrayList<>();

    public static void main(String[] args) {
        frota.add(new Carro(2.0, true, "abc-1234", 2014, 55000));
        frota.add(new Caminhao(10000, 95000, true, EtipoTransporte.Tanque, "kkk-1548", 2010, 155000));
        frota.add(new Carro(2.4, true, "cba-4321", 2016, 34000));
        frota.add(new Caminhao(150000, 85000, false, EtipoTransporte.Bau, "www-1597", 2010, 155000));
       
        ajudantes.add(new Chapa("Zezin", 35));
        ajudantes.add(new Chapa("Pedrin", 38));
        ajudantes.add(new MenorAprendiz());
        ajudantes.add(new Chapa("Gustin", 42));
        ajudantes.add(new MenorAprendiz());
        
        le = new Scanner(System.in);
        int menu = 0;

        while (true) {
            menu = montaMenu();
            if (menu == 1) {
                cadastraVeiculo();
            } else if (menu == 2) {
                cadastraAjudante();
            } else if (menu == 3) {
                frete();
            } else if (menu == 4) {
                financeiro();
            } else if (menu == 5) {
                System.exit(-1);
            }
        }
    }

    public static int montaMenu() {
        System.out.println("######## MENU ########");
        System.out.println("## 1) Novo Veiculo");
        System.out.println("## 2) Novo Ajudante");
        System.out.println("## 3) Realizar Frete");
        System.out.println("## 4) Financeiro");
        System.out.println("## ===================");
        System.out.println("## 5) Sair");
        System.out.println("######################");
        return le.nextInt();
    }

    private static void cadastraVeiculo() {
        System.out.println("###### VEICULO #######");
        System.out.println("## TIPO DE VEICULO ###");
        System.out.println("## 1) Carro, 2) Caminhão, 3) Carreta");
        int tipo = le.nextInt();
        Veiculo vei;
        if (tipo == 1) {
            vei = cadastra(new Carro());
        } else if (tipo == 2) {
            vei = cadastra(new Caminhao());
        } else {
            vei = cadastra(new Carreta());
        }
        //Veiculo vei = cadastra();
        frota.add(vei);

    }

    public static Veiculo cadastra(Veiculo v) {
        System.out.println("### Placa: ");
        v.setPlaca(le.next());
        System.out.println("### Ano: ");
        v.setAno(le.nextInt());
        System.out.println("### Valor Compra: ");
        v.setValorCompra(le.nextDouble());
        return v;
    }

    public static Carro cadastra(Carro c) {
        c = (Carro) cadastra((Veiculo) c);
        System.out.println("### Potência Motor: ");
        c.setPotenciaMotor(le.nextDouble());
        System.out.println("### Câmbio Automatico: ");
        c.setCambioAutomatico(le.nextBoolean());
        return c;
    }

    public static Caminhao cadastra(Caminhao c) {
        c = (Caminhao) cadastra((Veiculo) c);
        System.out.println("### Capacidade de Carga: ");
        c.setCapacidadeCarga(le.nextDouble());
        System.out.println("### Carga Transportada: ");
        c.setCargaTransportada(le.nextDouble());
        System.out.println("### é Truck: ");
        c.setTruck(le.nextBoolean());
        System.out.println("### Tipo Transposrte: (Graneiro,Bau,Tanque) ");
        c.setTipo(EtipoTransporte.valueOf(le.next()));
        return c;
    }

    public static Carreta cadastra(Carreta c) {
        c = (Carreta) cadastra((Veiculo) c);
        System.out.println("### Valor Aluguel Carroceria: ");
        c.setValorAluguelCarroceria(le.nextDouble());
        System.out.println("### Número de Eixos: ");
        c.setNumeroEixos(le.nextInt());
        return c;
    }

    private static void cadastraAjudante() {
        System.out.println("###### AJUDANTE #######");
        System.out.println("## TIPO DE AJUDANTE ###");
        System.out.println("## 1) Chapa, 2) Menor Aprendiz");
        int tipo = le.nextInt();
        IAjudante ia = (tipo == 1) ? new Chapa() : new MenorAprendiz();

        if (ia instanceof Chapa) {
            System.out.println("### Nome: ");
            ((Chapa) ia).setNome(le.next());
            System.out.println("### Valor: ");
            ((Chapa) ia).setValor(le.nextDouble());
        } else {

        }
        ajudantes.add(ia);
    }

    private static void financeiro() {
        System.out.println("###### TODOS VEICULOS DA FROTA #######");
        for (Veiculo v : frota) {
            System.out.println("## " + v.getPlaca() + " - " + v.getAno());
        }
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("###### VALOR FRETE #######");
        for (Veiculo v : frota) {
            if (v instanceof IVeiculoCarga) {
                System.out.println("## " + v.getPlaca() + " - R$ " + df.format(((IVeiculoCarga) v).precoFrete(5000)));
            }
        }

    }

    private static void frete() {
        System.out.println("######## FRETE ########");
        System.out.println("## Escolha o Veiculo");
        IVeiculoCarga ivc = null;
        int idx = 1;
        for (Veiculo v : frota) {
            if (v instanceof IVeiculoCarga) {
                System.out.println("## " + (idx++) + ") " + v.getPlaca());
            }
        }
        int esc = le.nextInt();
        //
        ivc = (IVeiculoCarga) frota.get(esc - 1);
        idx = 0;
        for (Veiculo v : frota) {
            if (v instanceof IVeiculoCarga) {
                idx += 1;
            }
            if (idx == esc) {
                ivc = (IVeiculoCarga) v;
                break;
            }
        }
        System.out.println("Veiculo Selecionado: " + ((Veiculo) ivc).getPlaca());
        System.out.println("## Escolha os Ajudantes");
        idx = 1;
        for (IAjudante aju : ajudantes) {
            System.out.println("## " + (idx++) + ") " +
           ( (aju instanceof Chapa)? ((Chapa)aju).getNome() : "Menor Aprendiz"  ) );
        }        
        esc = le.nextInt();
        ((Caminhao)ivc).getAjudantes().add(ajudantes.get(esc-1));
        System.out.println("Ajudante Adicionado: ");
        
    }

}
