package aulaCondicionais;

import java.util.Scanner;

public class CalculaIMC {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Digite seu peso (kg): ");
     double peso = sc.nextDouble();

     System.out.print("Digite sua altura (m): ");
     double altura = sc.nextDouble();

     // Calcula o IMC
     double imc = peso / (altura * altura);

     String classificacao;
     if (imc < 18.5) {
         classificacao = "Abaixo do peso";
     } else if (imc >= 18.5 && imc < 24.9) {
         classificacao = "Peso normal";
     } else if (imc >= 25 && imc < 29.9) {
         classificacao = "Sobrepeso";
     } else {
         classificacao = "Obesidade";
     }

     System.out.printf("Seu IMC é: %.2f\n", imc);
     System.out.println("Classificação: " + classificacao);

     sc.close();
 }
}