
public class Camiseta {

	private tipoTamanho tamanho;
	private String nome;
	private Genero Genero;
	private cor cor;
	private descontosPorPeças descontosPorPeças;
	private int peças;
	
	
	
	


	
	
	public Camiseta(tipoTamanho tamanho, String nome, Genero genero, cor cor,
			descontosPorPeças descontosPorPeças, int peças) {
		super();
		this.tamanho = tamanho;
		this.nome = nome;
		Genero = genero;
		this.cor = cor;
		this.descontosPorPeças = descontosPorPeças;
		this.peças = peças;
	}
	public descontosPorPeças getDescontosPorPeças() {
		return descontosPorPeças;
	}
	public void setDescontosPorPeças(descontosPorPeças descontosPorPeças) {
		this.descontosPorPeças = descontosPorPeças;
	}
	public int getPeças() {
		return peças;
	}
	public void setPeças(int peças) {
		this.peças = peças;
	}

	public tipoTamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(tipoTamanho tamanho) {
		this.tamanho = tamanho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Genero getGenero() {
		return Genero;
	}
	public void setGenero(Genero Genero) {
		this.Genero = Genero;
	}
	
	public cor getCor() {
		return cor;
	}
	public void setCor(cor cor) {
		this.cor = cor;
	}
	







}
