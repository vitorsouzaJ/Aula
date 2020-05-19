
public class MainCachorro {

	public static void main(String[] args) {
		
	Cachorro n =  new Cachorro();
		
	n.setNome("Rex");
	n.setIdade(18);
	n.setRaca("Golden retriever");
	n.setCor("dourado");
	n.setSexo("femea");	
	n.apresentarDog();
	
	System.out.println();
	
	Cachorro m =  new Cachorro();
	m.setNome("bolinha");
	m.setIdade(10);
	m.setRaca("Poodle");
	m.setCor("Branco");
	m.setSexo("femea");	
	
	
	System.out.println("eu tenho um cachorro chamado "+m.getNome()+ 
			" ela é uma "+m.getSexo()+", tem "+m.getIdade()+ " meses é da raça "
			+m.getRaca()+" e tem a cor "+ m.getCor());
	
	
		
		
		
	}
}
