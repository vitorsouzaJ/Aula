
public class Main{

	public static void main(String[] args) {
		
		
		

		
		Livro A = FabricaLivro.getInstance().livroOnline();
		Livro B = FabricaLivro.getInstance().livroFisico();
		
	
		
		
	
		
		
		LivroViews view = new LivroViews();
		
		view.apresentarLivro(A);
		view.apresentarLivro(B);
		
		
		
		
	}

}
