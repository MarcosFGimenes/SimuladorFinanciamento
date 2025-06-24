package util;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    // Construtor
    public InterfaceUsuario() {
        scanner = new Scanner(System.in);
    }

    // 1. Pedir valor do imóvel
    public double pedirValorImovel() {
        double valor; // Declare a variável fora do loop
        do {
            System.out.print("Digite o valor do imóvel (deve ser um valor positivo): R$ ");
            // Leia o valor AQUI dentro do loop
            valor = scanner.nextDouble();

            // Verifique se o valor é inválido e, se for, mostre a mensagem de erro
            if (valor <= 0) {
                System.out.println("ERRO: O valor do imóvel deve ser positivo. Por favor, tente novamente.");
            }
            // A condição do `while` verifica se deve repetir o loop
        } while (valor <= 0);

        // Somente RETORNE o valor quando ele for válido (fora do loop)
        return valor;
    }

    // 2. Pedir prazo do financiamento
    public int pedirPrazoFinanciamento() {
        int prazo;
        do {
            System.out.print("Digite o prazo do financiamento (em anos, deve ser um valor positivo): ");
            prazo = scanner.nextInt();

            if (prazo <= 0) {
                System.out.println("ERRO: O prazo do financiamento deve ser positivo. Por favor, tente novamente.");
            }
        } while (prazo <= 0);
        return prazo;
    }

    // 3. Pedir taxa de juros anual
    public double pedirTaxaJurosAnual() {
        double taxa;
        do {
            System.out.print("Digite a taxa de juros anual (ex: 0.05 para 5%, deve ser um valor positivo): ");
            taxa = scanner.nextDouble();

            if (taxa <= 0) {
                System.out.println("ERRO: A taxa de juros anual deve ser positiva. Por favor, tente novamente.");
            }
        } while (taxa <= 0);
        return taxa;
    }

    // Encerrar o scanner.
    public void fecharScanner() {
        scanner.close();
    }
}