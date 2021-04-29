package view;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Cachorro;



public class Casa {

	public static void main(String[] args) {

		// menu principal

		List<Cachorro> listaCaes = new ArrayList<>();



		while (true) {
			System.out.println("MENU PRINCIPAL\n");
			Scanner scanner = new Scanner(System.in);
			System.out.print("(1)Cadastrar cão / (2)Listar cães / (3)Sair \n");
			String menuPrincipal = scanner.nextLine();
			if (menuPrincipal.equals("1")) {
				System.out.println("CADASTRAR");
				Cachorro cao = new Cachorro();
				System.out.print("Digite o nome do cão: ");
				String nome = scanner.nextLine();
				cao.setNomeCachorro(nome);
				System.out.print("Digite a raça do cão: ");
				String raca = scanner.nextLine();
				cao.setRacaCachorro(raca);
				System.out.print("Digite o sexo do cão (M / F): ");
				String sexo = scanner.nextLine();
				cao.setSexoCachorro(sexo);
				System.out.print("Digite a idade do cão: ");
				int idade = scanner.nextInt();
				cao.setIdadeCachorro(idade);
				cao.setEnergiaCachorro(100);
				cao.setNumeroFilhotes(0);
				listaCaes.add(cao);
			//	break;
			}
			else if (menuPrincipal.equals("2")) {
				System.out.println("LISTAR");
				System.out.println(listaCaes);
			//	break;
			}
			else if (menuPrincipal.equals("3")) {
				System.out.println("Obrigado por utilizar. Até a próxima!");	
				System.exit(0);
			}
			else {
				System.out.println("Opção inválida!\n");
			}
		}
		
		
		
		
		
		
		
	}

		
		
}


