package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];
		
		double sumH = 0.0;
		int menores = 0;
		for (int i=0;i<n;i++) {
			System.out.printf("Dados da %dª pessoa: \n", i+1);
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			double height = sc.nextDouble();
			vect[i] = new Pessoa(name, age, height);
		}
		for(int i=0;i<vect.length; i++) {
			sumH += vect[i].getHeight();
			if(vect[i].getAge() < 16) {
				menores++;
			}	
		}
		double percentagem = ((double)menores / vect.length) * 100;
		double avg = sumH/vect.length;
		System.out.printf("Altura média : %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentagem);
		for(int i=0;i<vect.length;i++) {
			if(vect[i].getAge()< 16) {
				System.out.printf("%s\n", vect[i].getName());
			}
		}
		sc.close();
	}
}
