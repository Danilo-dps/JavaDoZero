package application;
import java.util.Scanner;

import entities.Estacionamento;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao sistema de estacionamento!");
        System.out.println("Digite o preço inicial:");
        double precoInicial = scanner.nextDouble();

        System.out.println("Agora digite o preço por hora:");
        double precoPorHora = scanner.nextDouble();

        Estacionamento es = new Estacionamento(precoInicial, precoPorHora);

        boolean exibirMenu = true;

        while (exibirMenu) {
            System.out.println("\nDigite a sua opção:");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Remover veículo");
            System.out.println("3 - Listar veículos");
            System.out.println("4 - Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    es.adicionarVeiculo();
                    break;

                case 2:
                    es.removerVeiculo();
                    break;

                case 3:
                    es.listarVeiculos();
                    break;

                case 4:
                    exibirMenu = false;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

            // Consumir a quebra de linha após a leitura da opção
            scanner.nextLine();
        }

        System.out.println("\nO programa se encerrou.");
    }
}


