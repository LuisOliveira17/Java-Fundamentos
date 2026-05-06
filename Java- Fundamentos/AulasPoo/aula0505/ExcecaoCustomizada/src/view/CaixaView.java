package view;

import exception.CaixaException;
import model.Caixa;

import java.util.Scanner;

public class CaixaView {
    private Caixa caixa;

    public CaixaView(){
        caixa = new Caixa();
        int opcao;

        do{
            opcao = construirMenu();
            switch(opcao) {
                case 1->execDepositar();
                case 2-> execSacar();
                case 3-> execSaldo();
                case 9->System.out.println("Fim do Programa");
                default -> System.out.println("Opcao invalida");

            }
        }while(opcao!=9);
    }

    public int construirMenu(){
        int opcao;

        while(true){
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("------Menu-------");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Exibir Saldo");
        System.out.println("9. Sair");
        System.out.println("---------------------");
        System.out.println("Escolha uma opcao: ");
        opcao=Integer.parseInt(sc.nextLine());
        return opcao;
        }catch(NumberFormatException e) {
            System.out.println("Entrada de dados Inválida");
        }
        }

    }

    public void execDepositar(){
        try{
            double valor;
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o Valor do Depósito:");
            valor = Double.parseDouble(sc.nextLine());
            caixa.depositar(valor);
        }catch(NumberFormatException e) {
            System.out.println("Entrada Inválida. Valor deve ser inteiro!");
        }
        catch (Exception ex){ // Não Preciso chamar o caixaException porque ele estende ao Exception
            System.out.println(ex.getMessage());
        }
    }

    public void execSacar(){
        try{
            double valor;
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o Valor do Saque:");
            valor = Double.parseDouble(sc.nextLine());
            caixa.sacar(valor);
        }catch(NumberFormatException e) {
            System.out.println("Entrada Inválida. Valor deve ser inteiro!");
        }
        catch (Exception ex){ // Não Preciso chamar o caixaException porque ele estende ao Exception
            System.out.println(ex.getMessage());
        }
    }

    public void execSaldo(){
        System.out.println("Saldo Atual: "+caixa.getSaldo());
    }
}
