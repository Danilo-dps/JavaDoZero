import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vetores = new double[n];
		double somaVetores = 0.0;
		
		for(int i=0; i<vetores.length; i++) {
			System.out.print("Digite um número: ");
			vetores[i] = sc.nextDouble();
			somaVetores += vetores[i];
		}
		
		double avg = somaVetores/vetores.length;
		System.out.println();
		System.out.printf("MÉDIA DO VETOR = %.3f\n", avg);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		for(int i=0; i<vetores.length; i++) {
			if(avg > vetores[i]) {
				System.out.println(vetores[i]);
			}
		}
		sc.close();
	}

}
