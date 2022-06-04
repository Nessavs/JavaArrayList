import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
		int op;
		String nome;
		int CH;
		while(true) { //executa infinitamente
			System.out.println("Menu");
			System.out.println("1- Cadastrar");
			System.out.println("2- Listar todas");
			System.out.println("3- Buscar específico");
			System.out.println("4- Alterar");
			System.out.println("5- Excluir");
			System.out.println("6- excluir todas");
			System.out.println("7- Sair");
			
			Scanner leia = new Scanner(System.in);
			op = leia.nextInt();
			
			if(op==1) {
				Disciplina d= new Disciplina();
				System.out.println("Digite o nome da disciplina: ");
				nome = leia.next();
				System.out.println("Digite a carga horária da disciplina: ");
				CH = leia.nextInt();
				d.setCH(CH);
				d.setNome(nome);
				listaDisciplinas.add(d);
			}
			else if (op == 2) {
				if(listaDisciplinas.size()==0) 
					System.out.println("Lista Vazia!");
				else
					for(int i = 0; i < listaDisciplinas.size();i++)
						System.out.println(listaDisciplinas.get(i).getNome());
			}
			else if(op==3) {
					if(listaDisciplinas.size() == 0) 
						System.out.println("Lista Vazia!");
					else
						System.out.println("Digite o nome da disciplina a ser buscada: ");
						nome = leia.next();
						for(int i = 0; i < listaDisciplinas.size();i++)
							if(listaDisciplinas.get(i).getNome().equals( nome)){
								System.out.println("Disciplina encontrada!");
							}
				}
			else if(op==4) {
				if(listaDisciplinas.size() == 0) 
					System.out.println("Lista Vazia!");
				else
					System.out.println("Digite o nome da disciplina a ser alterada: ");
					nome = leia.next();
					for(int i = 0; i < listaDisciplinas.size();i++)
						if(listaDisciplinas.get(i).getNome().equals( nome)){
							System.out.println("Digite o novo nome: ");
							nome=leia.next();
							listaDisciplinas.get(i).setNome(nome);
						}	
			}
			else if(op==5) {
				if(listaDisciplinas.size() == 0) 
					System.out.println("Lista Vazia!");
				else
					System.out.println("Digite o nome da disciplina a ser excluída: ");
					nome = leia.next();
					for(int i = 0; i < listaDisciplinas.size();i++)
						if(listaDisciplinas.get(i).getNome().equals( nome)){
							listaDisciplinas.remove(i);
							System.out.println("Disciplina excluída!");
						}
			}
			else if(op==6) {
			listaDisciplinas.clear();
			}
			else if(op==7) {
				System.out.println("Programa finalizado");
					break;
			}
		}
	}

}
