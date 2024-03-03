package application;

import javax.swing.JOptionPane;

public class RepeticaoTryCatch {

	public static void main(String[] args) {
        String numeroInformado, saidaFinal = "";
        int pares = 0;
        numeroInformado = JOptionPane.showInputDialog("Entre com um valor inteiro: ");
         try {
             int numero = Integer.parseInt(numeroInformado);
             for(int contador = 0; contador<numero; contador++){
            if((contador % 2) != 0)
                continue;
            pares++;
            saidaFinal += contador + " ";
            contador++;
        }
        saidaFinal += "\nTotal de pares: " + pares;
        JOptionPane.showMessageDialog(null, saidaFinal);
        System.exit(0);
         } catch (NumberFormatException e) {
             System.out.println(e.getMessage());
             JOptionPane.showMessageDialog(null, "[Erro] Digite um número inteiro");
         }


	}
}
