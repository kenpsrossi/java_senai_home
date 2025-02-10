//Aula dia = Dez=10 Fev=fevereiro 
package aulaDezFev;

import java.util.Scanner;

public class AlturaMedia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alturap1, alturap2, mediaAltura;
        String nomePessoa1, nomePessoa2;

        // Primeira pessoa
        System.out.println("Dados da primeira pessoa!");
        System.out.print("Nome: ");
        nomePessoa1 = sc.nextLine();
        System.out.print("Altura: ");
        alturap1 = sc.nextDouble();
        sc.nextLine(); // <-- Corrige o problema da quebra de linha no buffer

        // Segunda pessoa
        System.out.println("Dados da segunda pessoa!");
        System.out.print("Nome: ");
        nomePessoa2 = sc.nextLine(); // Agora funciona corretamente
        System.out.print("Altura: ");
        alturap2 = sc.nextDouble();

        mediaAltura = (alturap1 + alturap2) / 2;

        System.out.printf("\nA altura média de %s e %s é de %.2f metros.\n", nomePessoa1, nomePessoa2, mediaAltura);

        sc.close();
    }
}
