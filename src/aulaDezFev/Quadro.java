//Aula dia = Dez=10 Fev=fevereiro 
package aulaDezFev;

import java.util.Scanner;

public class Quadro {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double largura, altura, areat, perimet, diagonal;

     System.out.println("Vamos ver as medidas do quadro!");

     System.out.print("Digite a largura: ");
     largura = sc.nextDouble();

     System.out.print("Digite a altura: ");
     altura = sc.nextDouble();

     // Cálculos corrigidos
     areat = largura * altura;
     perimet = 2 * (largura + altura);  // Correção do perímetro
     diagonal = Math.sqrt((largura * largura) + (altura * altura));

     // Exibindo os resultados com 4 casas decimais
     System.out.printf("\nÁrea = %.4f m²\n", areat);
     System.out.printf("Perímetro = %.4f m\n", perimet);
     System.out.printf("Diagonal = %.4f m\n", diagonal);

     sc.close();
 }
}
