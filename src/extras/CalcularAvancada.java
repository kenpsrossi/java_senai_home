package extras;

import java.util.Scanner;

public class CalcularAvancada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibe o menu para o usuário
            System.out.println("\n========== CALCULADORA AVANÇADA ==========");
            System.out.println("Escolha uma operação digitando um dos numeros das opções:");
            System.out.println("( Opções )");

            
            System.out.println("   ( 1 )   => Operações Matemáticas (+, -, *, /, potência, raiz)");
            System.out.println("   ( 2 )   => Regra de 3");
            System.out.println("   ( 3 )   => Exibir números primos em uma faixa");
            System.out.println("   ( 0 )   => Sair");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    operacoesMatematicas(scanner);
                    break;
                case 2:
                    regraDeTres(scanner);
                    break;
                case 3:
                    exibirNumerosPrimos(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando a calculadora. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // Método para operações matemáticas básicas
    public static void operacoesMatematicas(Scanner scanner) {
        System.out.println("\n--- OPERACOES MATEMÁTICAS ---");
        System.out.println("Escolha a operação:");
        System.out.println("+  Soma");
        System.out.println("-  Subtração");
        System.out.println("*  Multiplicação");
        System.out.println("/  Divisão");
        System.out.println("^  Potência");
        System.out.println("r  Raiz quadrada");
        System.out.print("Digite a operação desejada: ");
        char operacao = scanner.next().charAt(0);

        double num1 = 0, num2 = 0, resultado = 0;

        // Para raiz quadrada, pede apenas um número
        if (operacao == 'r') {
            System.out.print("Digite o número: ");
            num1 = scanner.nextDouble();
            if (num1 < 0) {
                System.out.println("Erro: Não é possível calcular raiz quadrada de número negativo.");
                return;
            }
            resultado = Math.sqrt(num1);
            System.out.println("Resultado: √" + num1 + " = " + resultado);
            return;
        }

        // Para outras operações, pede dois números
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                resultado = num1 / num2;
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("Resultado: " + num1 + " " + operacao + " " + num2 + " = " + resultado);
    }

    // Método para calcular regra de 3
    public static void regraDeTres(Scanner scanner) {
        System.out.println("\n--- REGRA DE 3 ---");
        System.out.println("A regra de 3 é usada para encontrar um valor proporcional.");
        System.out.print("Digite o primeiro valor (A): ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo valor (B): ");
        double b = scanner.nextDouble();
        System.out.print("Digite o terceiro valor (C): ");
        double c = scanner.nextDouble();

        // Cálculo da Regra de 3: A está para B assim como C está para X
        double x = (b * c) / a;

        System.out.println("Resultado: " + a + " está para " + b + " assim como " + c + " está para " + x);
    }

    // Método para exibir números primos dentro de uma faixa
    public static void exibirNumerosPrimos(Scanner scanner) {
        System.out.println("\n--- NÚMEROS PRIMOS ---");
        System.out.print("Digite o número inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o número final: ");
        int fim = scanner.nextInt();

        if (inicio > fim) {
            System.out.println("Erro: O número inicial deve ser menor que o final.");
            return;
        }

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Pula linha no final
    }

    // Método para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
