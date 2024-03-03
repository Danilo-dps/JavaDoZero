public class Program {

	public static void main(String[] args) {
		
		String[] nomes = new String[] {"Maria", "Bob", "Alex"};
		
		System.out.println("Percorrendo o vetor com o FOR tradicional:");
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("__________________________________________");
		System.out.println();
		
		System.out.println("Percorrendo com o FOREACH: ");
		for(String nome : nomes) {
			System.out.println(nome);
		}

	}

}
