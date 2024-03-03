public class Program {

	public static void main(String[] args) {
		
		int x = 20; // variável do tipo referência (stack)
		
		System.out.println("Pegando um tipo primitivo(stack) e atribuindo ao tipo referência(head):");
		Object obj = x; // Boxing (head)
		System.out.println(obj);
		
		System.out.println("Pegando um tipo referência(head) e atribuindo ao tipo primitivo(stack):");
		int y = (int) obj;//casting
		System.out.println(y);

		/*Wrapper São classe equivalentes aos tipos primitivos
		 * Boxing e Unboxing é feito de forma natural
		 */
		System.out.println("Wrapper classes em uso: ");
		Integer obj1 = x;
		int y2 = obj1;
		System.out.println(y2);
	}
}
