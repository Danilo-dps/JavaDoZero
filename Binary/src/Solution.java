import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma sequência binária:");
        String binaryString = scanner.nextLine();

        // Validação da entrada
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            if (c != '0' && c != '1') {
                System.out.println("Entrada inválida");
                return;
            }
        }

        // Conversão para decimal
        int decimalNumber = Integer.parseInt(binaryString, 2);
        System.out.println("O número decimal é " + decimalNumber);
    }
}
