package lacoscondicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		int opcao;
		String nome;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
        System.out.println("--Digite 2 para ler uma Frase Motivacional--");
        System.out.println("--Digite 3 para receber uma Indicação de música--");
		opcao = leia.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("Digite o nome do seu livro favorito");
			nome = leia.next().toUpperCase();
			
					if ( nome.equals("O ALQUIMISTA")) {
						System.out.println("Livro legal");
					} else {
						System.out.println("Não gostei");
					}
			
			break;
		case 2:	
			System.out.println("Frase motivacional: Não desista do curso da Generation");
			break;
		case 3:
			System.out.println("Música: Só preciso de dinheiro pra comprar o mé");
			break;
			
			default:
			System.out.println("Opção inválida.");
			break;
		}
        
        
	}

}
 