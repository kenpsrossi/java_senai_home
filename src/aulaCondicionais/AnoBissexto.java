package aulaCondicionais;

import java.util.Scanner;

public class AnoBissexto {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Digite um ano: ");
     int ano = sc.nextInt();

     boolean isBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

     // Imprime o resultado
     if (isBissexto) {
         System.out.println(ano + " é um ano bissexto.");
     } else {
         System.out.println(ano + " não é um ano bissexto.");
     }

     sc.close();
 }
}