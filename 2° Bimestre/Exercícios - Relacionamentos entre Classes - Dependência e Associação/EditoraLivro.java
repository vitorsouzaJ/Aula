


public class EditoraLivro {
	
	
	
	private String nomeEditora;
	private String lacamentoLivro;
	private int edicao;
	
	
	
	
	
	public EditoraLivro () {}
	
	
	public EditoraLivro(String nomeEditora, String lacamentoLivro, int edicao) {
		super();
		this.nomeEditora = nomeEditora;
		this.lacamentoLivro = lacamentoLivro;
		this.edicao = edicao;
	}
	
	
	
	public String getNomeEditora() {
		return nomeEditora;
	}
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	public String getLacamentoLivro() {
		return lacamentoLivro;
	}
	public void setLacamentoLivro(String lacamentoLivro) {
		this.lacamentoLivro = lacamentoLivro;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	
	public String getEditoraPrint() {
		System.out.println("|Editora do livro: "+nomeEditora+"			");
		System.out.println("|Edição "+ edicao+"					");
		return lacamentoLivro;
				
		
	}
	
	

	
	
	
	}
	



