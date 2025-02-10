//Aula dia = Dez=10 Fev=fevereiro 
package aulaDezFev;

import java.util.Scanner;

public class Piso {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double largura, comprim, valorm2, area, custo;

     System.out.println("Vamos calcular o orçamento para o piso!");

     System.out.print("Digite a largura: ");
     largura = sc.nextDouble();

     System.out.print("Digite o comprimento: ");
     comprim = sc.nextDouble();

     System.out.print("Digite o valor do metro quadrado: ");
     valorm2 = sc.nextDouble();

     // Agora o cálculo ocorre após o usuário fornecer os dados
     area = largura * comprim;
     custo = area * valorm2;

     // Exibindo valores formatados corretamente
     System.out.println("\nÁrea do cômodo = " + String.format("%.2f", area) + " m²");
     System.out.println("Valor do metro quadrado = R$ " + String.format("%.2f", valorm2));
     System.out.println("Custo total do piso = R$ " + String.format("%.2f", custo));

     sc.close();
 }
}
