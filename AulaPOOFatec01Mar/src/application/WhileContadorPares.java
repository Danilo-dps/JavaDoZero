package application;

import javax.swing.JOptionPane;

public class WhileContadorPares {
    public static void main(String[] args) {
        String numeroInformado, saidaFinal = "";
        int contador = 0;
        int pares = 0;
        numeroInformado = JOptionPane.showInputDialog("Entre com um valor inteiro: ");
        int numero = Integer.parseInt(numeroInformado);
        while (contador <= numero) {
            if ((contador % 2) == 0) { // Verifica se o contador é par
                pares++;
                saidaFinal += contador + " ";
            }
            contador++; // Incrementa o contador em todas as iterações
        }
        saidaFinal += "\nTotal de pares: " + pares;
        JOptionPane.showMessageDialog(null, saidaFinal);
        System.exit(0);
    }
}
