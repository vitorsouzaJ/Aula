
public class FabricaLivro {
	
	
	private static FabricaLivro instance;
	
	private FabricaLivro() {}
	
	
	public static synchronized FabricaLivro getInstance() {
		if (instance == null) {
			instance = new FabricaLivro();
		}
		return instance;
	}
	
	
	
	
	public Livro livroOnline() {
		EditoraLivro editoraA =  new EditoraLivro("Pottermore Publishing","08/12/2015", 1);
		
		
		
		Autor atorLivroA[] = new Autor[1];
		atorLivroA[0] = new Autor("J.K. Rowling", "1965", "Yate, Reino Unido");
		
	
				
		return new Livro("ebook","Harry Potter e a Ordem da Fenix",
				703, "Google Play-Livros", "portugues",atorLivroA, editoraA);
		
		
	}
	
	public Livro livroFisico() {
		EditoraLivro editoraB =  new EditoraLivro("Rocco","08/06/2001", 1);
		
		Autor atorLivroB[] = new Autor[1];
		atorLivroB[0] = new Autor("J.K. Rowling", "1965", "Yate, Reino Unido");
		
		
		

		
		
		return new Livro("Livro","Harry Potter e o cálice de fogo",
				640, "Amazon", "portugues",atorLivroB, editoraB);
		
		
		
	}
	
	
	

}
