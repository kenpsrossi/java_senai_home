package aulaCondicionais;

import java.util.Scanner;
import java.util.Arrays;

public class OrdenaNumeros {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Digite o primeiro número: ");
     double numero1 = sc.nextDouble();

     System.out.print("Digite o segundo número: ");
     double numero2 = sc.nextDouble();

     System.out.print("Digite o terceiro número: ");
     double numero3 = sc.nextDouble();

     // Armazena os números em um array
     double[] numeros = {numero1, numero2, numero3};

     // Ordena o array em ordem crescente
     Arrays.sort(numeros);

     System.out.println("Os números em ordem crescente são: ");
     for (double numero : numeros) {
         System.out.println(numero);
     }

     sc.close();
 }
}