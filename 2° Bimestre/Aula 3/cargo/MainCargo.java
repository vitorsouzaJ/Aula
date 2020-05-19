
public class MainCargo {
	
	public static void main(String[] args) {
		
		
		Cargo p = new Cargo();
		
		p.setNome("Vitor Souza de Jesus");
		p.setDescricao("Auxiliar de Qualidade");
		p.setPisoSalarial(1533.64);
		p.setCargaHoraria(8.30);
		
		System.out.println("Meu Nome é "+ p.getNome()+ " trabalho como " 
		+ p.getDescricao()+ ", meu piso salarial é de "+ p.getPisoSalarial()+
		" e minha carga horaria é de " + p.getCargaHoraria()+ " horas");

	}

}
