package trabalho;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		Cofrinho cofrinho = new Cofrinho();
		
		while(true) {
		
			try {
			
				System.out.printf("Menu %n"
						+ "1 - Adicionar moedas %n"
						+ "2 - Remover moedas %n"
						+ "3 - Listar moedas %n"
						+ "4 - Converter todo o dinheiro para reais %n"
						+ "0 - Sair %n");
				
				int acao = scanner.nextInt();
				
				// Metados de adicionar, remover, listar, conversor e encerrar programa
				
				if(acao == 1) { 
					
					System.out.printf("%nCom qual moeda você deseja trabalhar? %n"
							+ "1 - Dolar %n"
							+ "2 - Euro %n"
							+ "3 - Real %n");
					int tipoMoeda = scanner.nextInt();
					
					System.out.printf("%nQuantas moedas você deseja adicionar?%n"
							+ "Separar casas decimais com vírgula!%n");
					double adicionarMoeda = scanner.nextDouble();
					
					cofrinho.adicionarMoedas(tipoMoeda, adicionarMoeda);
					
				} else if(acao == 2) { 
					
					System.out.printf("%nCom qual moeda você deseja trabalhar? %n"
							+ "1 - Dolar %n"
							+ "2 - Euro %n"
							+ "3 - Real %n");
					int tipoMoeda = scanner.nextInt();
					
					System.out.printf("%nQuantas moedas você deseja remover?%n"
							+ "Separar casas decimais com vírgula!%n");
					double removerMoeda = scanner.nextDouble();
					
					cofrinho.removerMoedas(tipoMoeda, removerMoeda);
				
					
				} else if(acao == 3) { 
					
					System.out.println(); 
					cofrinho.listagemMoedas();
				
					
				} else if(acao == 4) { 
					
					System.out.println(); 
					cofrinho.totalConvertido();
				
					
				} else if(acao == 0) { 
					
					break;
					
				} else {
					
					System.out.println("Opção inválida");
				}
				
				System.out.println(); 
				
			} catch(InputMismatchException e) {
				
				
				System.out.printf("%nSeparar casas decimais com vírgula!%n");
				break; 
			}
		}
		
		scanner.close();
		
		System.out.println(); 
		
		System.out.println("Programa encerrado");
	}

}