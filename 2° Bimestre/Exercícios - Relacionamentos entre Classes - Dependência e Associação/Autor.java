


public class Autor {
	
	
	private String nomeAutor;
	private String anoNascimento;
	private String naturalidade;
	
	

	
	
	
	
	public Autor(String nomeAutor, String anoNascimento, String naturalidade) {
		super();
		this.nomeAutor = nomeAutor;
		this.anoNascimento = anoNascimento;
		this.naturalidade = naturalidade;
	}
	
	
	
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public String getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	
	
	
@Override
	public String toString() {
		System.out.println("|Nome do Autor: " + nomeAutor);
		System.out.println("|Ano do nascimento: " + anoNascimento   );
		return naturalidade;

}

	

	
	
	
}
	
	
	
