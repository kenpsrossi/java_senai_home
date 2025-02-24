package aulaCondicionais;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     Random random = new Random();
     
     int numeroAleatorio = random.nextInt(100) + 1;
     
     int palpite = 0;
     
     while (palpite != numeroAleatorio) {
         System.out.print("Digite seu palpite (entre 1 e 100): ");
         palpite = sc.nextInt();
         
         if (palpite < numeroAleatorio) {
             System.out.println("Muito baixo! Tente novamente.");
         } else if (palpite > numeroAleatorio) {
             System.out.println("Muito alto! Tente novamente.");
         } else {
             System.out.println("Parabéns! Você adivinhou o número.");
         }
     }
     
     sc.close();
 }
}