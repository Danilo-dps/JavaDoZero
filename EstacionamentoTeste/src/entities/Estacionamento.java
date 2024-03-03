package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estacionamento {
    private double precoInicial;
    private double precoPorHora;
    private List<String> veiculos;

    public Estacionamento(double precoInicial, double precoPorHora) {
        this.precoInicial = precoInicial;
        this.precoPorHora = precoPorHora;
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a placa do veículo para estacionar:");
        veiculos.add(scanner.nextLine());
    }

    public void removerVeiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a placa do veículo para remover:");
        String placa = scanner.nextLine();

        if (veiculos.stream().anyMatch(veiculo -> veiculo.equalsIgnoreCase(placa))) {
            System.out.println("Digite a quantidade de horas que o veículo permaneceu estacionado:");
            int horas = scanner.nextInt();
            double valorTotal = (precoPorHora * horas) + precoInicial;

            veiculos.remove(placa);
            System.out.println("O veículo " + placa.toUpperCase() + " foi removido e o preço total foi de: R$ " + valorTotal);
        } else {
            System.out.println("Desculpe, esse veículo não está estacionado aqui. Confira se digitou a placa corretamente");
        }
    }

    public void listarVeiculos() {
        if (!veiculos.isEmpty()) {
            System.out.println("Os veículos estacionados são:");
            int contador = 1;
            for (String veiculo : veiculos) {
                System.out.println("Posição Nº " + contador + " - " + veiculo.toUpperCase());
                contador++;
            }
        } else {
            System.out.println("Não há veículos estacionados.");
        }
    }

}
