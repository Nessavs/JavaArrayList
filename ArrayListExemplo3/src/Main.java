		import java.util.ArrayList;
		import java.util.Scanner;

		public class Main {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
				int op;
				String nome = null;
				int matricula = 0;
			    while(true) {
			    	System.out.println("Menu");
			    	System.out.println("1- Cadastrar");
			    	System.out.println("2 - Listar todos");
			    	System.out.println("3 - Buscar Matrícula Par/Excluí-la ");
			    	System.out.println("4 - Excluir todos");
			    	System.out.println("5 - Sair do programa");
			    	
			    	Scanner leia = new Scanner(System.in);
			    	op = leia.nextInt();
			    	
			    	if(op==1) {
						Aluno d= new Aluno(nome ,matricula);
						System.out.println("Digite o nome do aluno: ");
						nome = leia.next();
						System.out.println("Digite a matricula ");
						matricula = leia.nextInt();
						d.setMatricula(matricula);
						d.setNome(nome);
						listaAluno.add(d);
					}
			    	else if(op==2) {
			    		if(listaAluno.size()==0)
			    			System.out.println("Lista vazia!!");
			    		else
			    		for(int i =0; i < listaAluno.size(); i++) {
			    			System.out.println(listaAluno.get(i).getNome());
			    		}
			    	}
			    	else if(op==3) {
			    		if(listaAluno.size()==0)
			    			System.out.println("Lista vazia !");
			    		else {
			    		System.out.println("Digite o nome do aluno a ser buscado");
			    		nome = leia.next();
			    		for(int i=0; i < listaAluno.size(); i++) 
			    			if(listaAluno.get(i).getMatricula()%2==0) {
			    				System.out.println("Matricula  encontrada!");	
			    				listaAluno.remove(i);
								System.out.println("Matrícula excluída!");
			    				}
			    		}
			    	}
			    	else if(op==4) {
			    		listaAluno.clear();
			    		
			    	}
			    	else if(op==5) {
			    		break;
			    		
			    	}
			    	
			    }

			}
	}