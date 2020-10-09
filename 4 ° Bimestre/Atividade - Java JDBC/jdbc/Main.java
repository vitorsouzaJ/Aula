
package jdbc;





import dao.PessoasDAO;
import model.Pessoas;

public class Main {
	
	

	public static void main(String[] args) {
		
		PessoasDAO dao = new PessoasDAO();

		Pessoas pessoas = new Pessoas();
		pessoas.setPessoaNome("vitor");
		pessoas.setPessoaNascimento("2001-10-13");
		pessoas.setPessoaBairro("bom retiro");
		pessoas.setPessoaCidade("Joinivlle");
		pessoas.setPessoaSexo("M");
		
		System.out.println("-------------INSERIR-------------------");
		
		pessoas.setPessoaCPF(1);
		dao.insert(pessoas);

		pessoas.setPessoaCPF(2);
		dao.insert(pessoas);

		pessoas.setPessoaCPF(3);
		dao.insert(pessoas);
		
		Pessoas P = dao.getById(1);
		System.out.println(P);
		Pessoas P1 = dao.getById(2);
		System.out.println(P1);
		Pessoas P2 = dao.getById(3);
		System.out.println(P2);
		

		
	
		
		pessoas.setPessoaNome("zeca");
		pessoas.setPessoaNascimento("1999-04-05");
		pessoas.setPessoaBairro("Costa e Silva");
		pessoas.setPessoaCidade("Joinivlle");
		pessoas.setPessoaSexo("M");
		
		
		System.out.println("----------UPTADE----------------------");

		pessoas.setPessoaCPF(3);
		dao.updateById(pessoas);
		
		Pessoas P3 = dao.getById(3);
		System.out.println(P3);
		
		Pessoas P4 = dao.getById(2);
		System.out.println(P4);
		
		Pessoas P7 = dao.getById(1);
		System.out.println(P7);
		
		
		System.out.println("----------DELETAR---------------------");
		
		pessoas.setPessoaCPF(1);
		dao.deleteById(pessoas);
		

	
		Pessoas P5 = dao.getById(2);
		System.out.println(P5);
		
		Pessoas P6 = dao.getById(3);
		System.out.println(P6);
		
		
		
	}
}