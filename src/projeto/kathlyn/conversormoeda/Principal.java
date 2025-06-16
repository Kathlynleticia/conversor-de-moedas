package projeto.kathlyn.conversormoeda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoedas conversor = new ConversorDeMoedas();
        int opcao;

        System.out.println("Seja bem vindo(a) ao Conversor de Moedas!");

        do {
            String menu = """
                    \n******** MENU CONVERSÃO DE MOEDAS *********\n
                       1. Dólar (USD)         --> Real (BRL)
                       2. Peso Argentino (ARS)--> Real (BRL)
                       3. Euro (EUR)          --> Real (BRL)
                       4. Real (BRL)          --> Dólar (USD)
                       5. Real (BRL)          --> Peso Argentino (ARS)
                       6. Real (BRL)          --> Euro (EUR)
                       0. Sair\n
                    ****** Escolha a opção de conversão:
                    """;
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Volte sempre! Encerrando programa...");
                break;
            }

            System.out.println("Digite o valor que deseja converter:");
            double valorDigitado = scanner.nextDouble();

            String moedaOrigem ="", moedaDestino ="";

            switch (opcao) {
                case 1:
                    moedaOrigem = "USD"; moedaDestino = "BRL";
                    break;
                case 2:
                    moedaOrigem = "ARS"; moedaDestino = "BRL";
                    break;
                case 3:
                    moedaOrigem = "EUR"; moedaDestino = "BRL";
                    break;
                case 4:
                    moedaOrigem = "BRL"; moedaDestino = "USD";
                    break;
                case 5:
                    moedaOrigem = "BRL"; moedaDestino = "ARS";
                    break;
                case 6:
                    moedaOrigem = "BRL"; moedaDestino = "EUR";
                    break;
                default:
                    System.out.println("Opção inválida");
                    continue;
            }

            try {
                double taxa = conversor.buscaTaxa(moedaOrigem, moedaDestino);
                double convertido = valorDigitado * taxa;
                System.out.println("*********************************************");
                System.out.printf("Valor %.1f [%s] corresponde ao valor final de =>>> %.2f [%s]%n", valorDigitado, moedaOrigem, convertido, moedaDestino);
                System.out.println("*********************************************");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);

        scanner.close();



    }

}
