package model;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Cachorro {
	
	
	// atributos
	private String nomeCachorro, racaCachorro, sexoCachorro;
	private int idadeCachorro, numeroFilhotes, energiaCachorro;
	
	
	// construtor
	
	public Cachorro(String nome, String raca, String sexo, int idade,
			int filhotes, int energia) {
		this.nomeCachorro = nome;
		this.racaCachorro = raca;
		this.sexoCachorro = sexo;
		this.idadeCachorro = idade;
		this.numeroFilhotes = filhotes;
		this.energiaCachorro = energia;
	}
	
	public Cachorro(){
		
	}


	// metodos
	
	// getters e setters
	
	public String getNomeCachorro() {
		return nomeCachorro;
	}


	public void setNomeCachorro(String nomeCachorro) {
		this.nomeCachorro = nomeCachorro;
	}


	public String getRacaCachorro() {
		return racaCachorro;
	}


	public void setRacaCachorro(String racaCachorro) {
		this.racaCachorro = racaCachorro;
	}


	public String getSexoCachorro() {
		return sexoCachorro;
	}


	public void setSexoCachorro(String sexoCachorro) {
		this.sexoCachorro = sexoCachorro;
	}


	public int getIdadeCachorro() {
		return idadeCachorro;
	}


	public void setIdadeCachorro(int idadeCachorro) {
		this.idadeCachorro = idadeCachorro;
	}


	public int getNumeroFilhotes() {
		return numeroFilhotes;
	}


	public void setNumeroFilhotes(int numeroFilhotes) {
		this.numeroFilhotes = numeroFilhotes;
	}


	public int getEnergiaCachorro() {
		return energiaCachorro;
	}


	public void setEnergiaCachorro(int energiaCachorro) {
		this.energiaCachorro = energiaCachorro;
	}


		
	// outros metodos
	
	public String toString() {
		return "\nNome: " + nomeCachorro + "\nRaça: " + racaCachorro + "\nSexo: "
				+ sexoCachorro + "\nIdade: " + idadeCachorro + "\nEnergia: " + energiaCachorro
				+ "\nNúmero de filhotes: " + numeroFilhotes;
	}
	
	public void comer() {
		if (this.energiaCachorro <= 50) {
			while(true) {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Digite a comida a ser alimentada:		(R)ação / (C)arne / (L)egumes: ");
				String comida = scanner.nextLine();
				if (comida.equals("R")) {
					System.out.printf("%s comeu ração e aumentou sua energia em 50.\n", this.nomeCachorro);
					this.energiaCachorro = this.energiaCachorro + 50;
					break;
				}
				else if (comida.equals("C")) {
					System.out.printf("%s comeu carne e aumentou sua energia em 40.\n", this.nomeCachorro);
					this.energiaCachorro = this.energiaCachorro + 40;
					break;
				}
				else if (comida.equals("L")) {
					System.out.printf("%s comeu legumes e aumentou sua energia em 30.\n", this.nomeCachorro);
					this.energiaCachorro = this.energiaCachorro + 30;
					break;
				}
				else {
					System.out.println("Opção inválida!");
				}
			}
		}
		else {
			System.out.printf("A energia de %s deve ser inferior a 50!", this.nomeCachorro);
		}
		System.out.printf("A energia atual de %s é %d.\n", this.nomeCachorro, this.energiaCachorro);
	}
	
	public void brincar() {
		if (this.energiaCachorro >= 40) {
			while(true) {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Digite a brincadeira a ser feita:		(B)uscar bolinha / (S)altar / (G)irar pelo chão: ");
				String brincadeira = scanner.nextLine();
				if (brincadeira.equals("B")) {
					System.out.printf("%s buscou a bolinha e diminuiu sua energia em 30.\n", this.nomeCachorro);
					this.energiaCachorro = this.energiaCachorro - 30;
					break;
				}
				else if (brincadeira.equals("S")) {
					System.out.printf("%s saltou e diminuiui sua energia em 20.\n", this.nomeCachorro);
					this.energiaCachorro = this.energiaCachorro - 20;
					break;
				}
				else if (brincadeira.equals("G")) {
					System.out.printf("%s girou pelo chão e diminuiu sua energia em 10.\n", this.nomeCachorro);
					this.energiaCachorro = this.energiaCachorro - 10;
					break;
				}
				else {
					System.out.println("Opção inválida!");
				}
				System.out.printf("A energia de %s atual é %d", this.nomeCachorro, this.energiaCachorro);
			}
		}
	}
	
	public boolean podeCruzar(Cachorro parceiro) {
		if ((!this.sexoCachorro.equals(parceiro.getSexoCachorro())) &&
				(this.idadeCachorro >= 1 && this.idadeCachorro >=9) && 
				(parceiro.getIdadeCachorro() >= 1 && parceiro.getIdadeCachorro() >=9) && 
				(this.racaCachorro.equals(parceiro.getRacaCachorro())) &&
				(this.energiaCachorro >= 80) && (parceiro.getEnergiaCachorro() >= 80)){
		    System.out.printf("Todas as condições foram atendidas! %s e %s podem cruzar :)", this.nomeCachorro, parceiro.getNomeCachorro());  
			return true;
		}
		else if (this.sexoCachorro.equals(parceiro.getSexoCachorro()))  {
			System.out.printf("%s e %s devem ser de sexos diferentes!", this.nomeCachorro, parceiro.getNomeCachorro());
			return false;
		}
		
		else if (this.idadeCachorro >= 1 && this.idadeCachorro <=9) {
			System.out.printf("A idade de %s deve estar entre 1 e 9 anos!", this.nomeCachorro);
			return false;
		}
		
		else if (parceiro.getIdadeCachorro() <= 1 && parceiro.getIdadeCachorro() <=9) {
			System.out.printf("A idade de %s deve estar entre 1 e 9 anos!", parceiro.getNomeCachorro());
			return false;
		}
		
		else if (!this.racaCachorro.equals(parceiro.getRacaCachorro())) {
			System.out.printf("%s e %s devem ser da mesma raça!", this.nomeCachorro, parceiro.getNomeCachorro());
			return false;
		}
		else if (this.energiaCachorro < 80) {
			System.out.printf("A energia de %s deve ser maior que 80!", this.nomeCachorro);
			return false;
		}
		else if (parceiro.getEnergiaCachorro() < 80) {
			System.out.printf("A energia de %s deve ser maior que 80!", parceiro.getNomeCachorro());
			return false;
		}
		
		else {
			return false;
		}
	}
	
		public int randomizarFilhotes() {
			return ThreadLocalRandom.current().nextInt(3, 10);
		
	}
	
	public void cruzarParceiro(Cachorro parceiro) {
		if (podeCruzar(parceiro)) {
			this.energiaCachorro = this.energiaCachorro - 50;
			parceiro.setEnergiaCachorro(parceiro.getEnergiaCachorro() - 50);
			int filhotesCasal = randomizarFilhotes();
			this.numeroFilhotes = this.numeroFilhotes + filhotesCasal;
			parceiro.setNumeroFilhotes(parceiro.getNumeroFilhotes() + filhotesCasal);
			System.out.printf("%s e %s geraram %d filhotes.", this.nomeCachorro, parceiro.getNomeCachorro(), filhotesCasal);
			
		}
		else {
			System.out.printf("%s e %s não podem cruzar. Tente novamente!", this.nomeCachorro, parceiro.getNomeCachorro());
		}
	}
}
