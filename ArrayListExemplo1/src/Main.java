import java.util.ArrayList;

 public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Contato> listaContatos = new ArrayList<Contato>();
		Contato c1 = new Contato ("João", 1234);
		listaContatos.add(c1);
		Contato c2 = new Contato ("Ana", 2234);
		listaContatos.add(c2);
		
		for(int i=0; i< listaContatos.size();i++) {
			System.out.println(listaContatos.get(i).getNome());
		}
	}

}
