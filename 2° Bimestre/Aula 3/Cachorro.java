
public class Cachorro {
	
	private String nome;
	private int idade;
	private String raca;
	private String cor;
	private String sexo;
	
	
	

	public void setNome(String nome) {
		this.nome =  nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void setCor(String cor) {
		this.cor =  cor;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getRaca() {

		return raca;
	}
	
	public String getCor(){
		return cor;
	}
	
	
	public String getSexo() {
		return sexo;
	}
	
	
	public void apresentarDog() {
		System.out.println("eu tenho um cachorro chamado "+nome+ 
				" ela é uma "+sexo+", tem "+idade+ " meses é da raça "
				+raca+" e tem a cor "+cor);
	}
	
	
	
	
	
	
	
	

}
