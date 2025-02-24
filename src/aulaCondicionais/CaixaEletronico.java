package aulaCondicionais;

import java.util.Scanner;

public class CaixaEletronico {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Inicializa o saldo da conta
     double saldo = 0.0;

     // Loop para exibir o menu e realizar operações
     while (true) {
         // Exibe o menu de opções
         System.out.println("Caixa Eletrônico");
         System.out.println("1. Depósito");
         System.out.println("2. Saque");
         System.out.println("3. Consulta de Saldo");
         System.out.println("4. Sair");
         System.out.print("Escolha uma opção: ");
         int opcao = sc.nextInt();

         // Realiza a operação escolhida
         switch (opcao) {
             case 1:
                 // Depósito
                 System.out.print("Digite o valor para depósito: ");
                 double deposito = sc.nextDouble();
                 if (deposito > 0) {
                     saldo += deposito;
                     System.out.println("=================>>> Depósito realizado com sucesso.");
                 } else {
                     System.out.println("=================>>> Valor de depósito inválido.");
                 }
                 break;
             case 2:
                 // Saque
                 System.out.print("Digite o valor para saque: ");
                 double saque = sc.nextDouble();
                 if (saque > 0 && saque <= saldo) {
                     saldo -= saque;
                     System.out.println("=================>>> Saque realizado com sucesso.");
                 } else {
                     System.out.println("=================>>> Valor de saque inválido ou saldo insuficiente.");
                 }
                 break;
             case 3:
                 // Consulta de Saldo
                 System.out.printf("Seu saldo é: =================>>> R$ %.2f\n", saldo);
                 break;
             case 4:
                 // Sair
                 System.out.println("=================>>> Obrigado por usar o Caixa Eletrônico.");
                 sc.close();
                 return;
             default:
                 // Opção inválida
                 System.out.println("=================>>> Opção inválida. Tente novamente.");
                 break;
         }
     }
 }
}