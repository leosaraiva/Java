package view;
import java.util.Scanner;

import model.Cachorro;



public class Casa {

	public static void main(String[] args) {
		System.out.println("programa teste");
		// menu principal
		
		while (true) {
			System.out.println("MENU PRINCIPAL\n");
			Scanner scanner = new Scanner(System.in);
			System.out.print("(1)Cadastrar cão / (2)Listar cães / (3)Sair \n");
			String menuPrincipal = scanner.nextLine();
			if (menuPrincipal == "1") {
				System.out.println("CADASTRAR");
				System.out.print("Digite o nome do cão: ");
				String nome = scanner.nextLine();
				// setNomeCachorro(nome);
				System.out.print("Digite a raça do cão: ");
				String raca = scanner.nextLine();
				// setRacaCachorro(raca);
				System.out.print("Digite o sexo do cão (M / F): ");
				String sexo = scanner.nextLine();
				// setSexoCachorro(sexo);
				System.out.print("Digite a idade do cão: ");
				int idade = scanner.nextInt();
				// setIdadeCachorro(idade);
				// setEnergiaCachorro(100);
				// setNumeroFilhotes(0);
				
				break;
			}
			else if (menuPrincipal == "2") {
				System.out.println("LISTAR");
				break;
			}
			else if (menuPrincipal == "3") {
				System.out.println("Obrigado por utilizar. Até a próxima!");	
				System.exit(0);
			}
			else {
				System.out.println("Opção inválida!\n");
			}
		}
		
		
		
		
		
		
		
	}

		
		
}


