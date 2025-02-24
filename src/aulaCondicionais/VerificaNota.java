package aulaCondicionais;

import java.util.Scanner;

public class VerificaNota {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Digite a nota do aluno: ");
     double nota = sc.nextDouble();

     // Verifica se a nota é maior ou igual a 7
     if (nota >= 7) {
         System.out.println("Aprovado");
     } else {
         System.out.println("Reprovado");
     }

     sc.close();
 }
}