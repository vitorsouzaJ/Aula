
public class Livro {
	
	private String formato;
	private String nomeLivro;
	private int numeroPaginas;
	private String vendidoPor;
	private String idioma;
	
	private Autor autor[];
	private EditoraLivro editoraLivro;
	
	
	
	public Livro()
			{
		
			}
	
	
	
	
	public Livro(String formato, String nomeLivro, int numeroPaginas,
			String vendidoPor, String idioma,
			Autor autor[], EditoraLivro editoraLivro) {
		super();
		this.formato = formato;
		this.nomeLivro = nomeLivro;
		this.numeroPaginas = numeroPaginas;
		this.vendidoPor = vendidoPor;
		this.idioma = idioma;
		this.autor = autor;
		this.editoraLivro = editoraLivro;
		
	}
	
	
	
	
	
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public String getVendidoPor() {
		return vendidoPor;
	}
	public void setVendidoPor(String vendidoPor) {
		this.vendidoPor = vendidoPor;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public Autor[] getAutor() {
		return autor;
	}


	public void setAutor(Autor[] autor) {
		this.autor = autor;
	}




	public EditoraLivro getEditoraLivro() {
		return editoraLivro;
	}
	
	
	
	public void setEditoraLivro(EditoraLivro editoraLivro) {
		this.editoraLivro = editoraLivro;
	}
		

	
	
}



