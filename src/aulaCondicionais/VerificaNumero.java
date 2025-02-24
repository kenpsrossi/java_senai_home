package aulaCondicionais;

import java.util.Scanner;

public class VerificaNumero {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Digite um número: ");
     double numero = sc.nextDouble();

     if (numero > 0) {
         System.out.println("O número é positivo.");
     } else if (numero < 0) {
         System.out.println("O número é negativo.");
     } else {
         System.out.println("O número é igual a zero.");
     }

     sc.close();
 }
}
