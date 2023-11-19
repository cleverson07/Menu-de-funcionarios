package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregado;

public class funcionarios {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		List<Empregado> ficha = new ArrayList<>();
		boolean opcaoSair = true; // alternar entre  interroper o loop ou não 
		
		while(opcaoSair) {
		System.out.println("---- QUADRO DE FUNCIONARIOS----");
		System.out.println();
		System.out.println("(1)Adicionar Funcionario");
		System.out.println("(2)Remover Funcionario");
		System.out.println("(3)mostrar salário de todos funcionarios");
		System.out.println("(4)mostrar todos funcionarios");
		System.out.println("(5)mostrar um funcionario em especifico");
		System.out.println("(6)Sair");
		int opcao = sc.nextInt();
		
		
		switch(opcao) {
			case 1: // cadastro de um novo funcionario
				System.out.println("Crie um ID ao novo Funcionario:");
				int id = sc.nextInt();
				System.out.println("Nome:");
				String name = sc.next();
				System.out.println("Data de Nascimento:");
				String nasc = sc.next();
				System.out.println("Função na empresa:");
				String funcao =sc.next();
				System.out.println("salario:");
				double salary =sc.nextDouble();
				
				ficha.add(new Empregado(id, name, nasc, funcao, salary));
				
				System.out.println("---- CADASTRO CONCLUIDO !! ----");
				System.out.println();
				System.out.println();
				break;
			
			case 2:
				System.out.println("Digite o Id do funcionario para estar removendo:");
				int idRemove = sc.nextInt();
				boolean removido = removerId(ficha, idRemove);
				if(removido) {
					System.out.println("Funcionario removido com sucesso !");
				}else {
					System.out.println("Funcionario não encontrado. Nada foi removido.");
				}
				break;
			case 3:
				for(Empregado pessoa : ficha) {
					pessoa.salarioFuncionario();
				}
				break;
			case 4:
				for(Empregado pessoa : ficha) { // para cada "pessoa" contido em "ficha" faça:
					pessoa.exibirFuncionario();
				}
				System.out.println();
				System.out.println();
				break;
			case 5:
				System.out.println("Digite o ID do funcionario que deseja procurar:");
				int buscarId = sc.nextInt();
				Empregado pessoaEncontrada = buscarPessoaId(ficha, buscarId);
				
				if(pessoaEncontrada != null) {
					System.out.println("Funcinario Encontrado!");
					pessoaEncontrada.exibirFuncionario();
				}else {
					System.out.println("Funcionario não encontrado!");
				}
				
				break;
			case 6:
				opcaoSair = false;
				System.out.println("SAINDO....");
				break;
			default:
				System.out.println("Opção invalida. Digite Novamente");
				
				
		}
	}
	
		
		
		}

	
	private static Empregado buscarPessoaId(List<Empregado> lista, int id) {
		for(Empregado pessoa : lista) {  // para cada "pessoa" contido em "lista" faça:
			if(pessoa.getId() == id) {  //se
				return pessoa;
			}
				}
		return null;  // Se não encontrar a pessoa com o ID especificado
		}
	
	private static boolean removerId(List<Empregado> lista, int id) {
		for(Empregado pessoa : lista) {
			if(pessoa.getId() == id) {
				lista.remove(pessoa);
				return true;
			}
		}
		return false;  // Se não encontrar a pessoa com o ID especificado
	}
	
	
	
	
}
