package application;

import javax.swing.JOptionPane;
public class ForContadorPares {
    
    public static void main(String[] args) {
        String numeroInformado, saidaFinal = "";
        int pares = 0;
        int contador = 0;
        numeroInformado = JOptionPane.showInputDialog("Entre com um valor inteiro: ");
        int numero = Integer.parseInt(numeroInformado);
        for(contador = 0; contador<numero; contador++){
            if((contador % 2) != 0)
                continue;
            pares++;
            saidaFinal += contador + " "; 
        }
        saidaFinal += "\nTotal de pares: " + pares;
        JOptionPane.showMessageDialog(null, saidaFinal);
        System.exit(0);
    }
}
