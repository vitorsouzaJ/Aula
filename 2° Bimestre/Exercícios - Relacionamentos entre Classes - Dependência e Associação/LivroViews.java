
public class LivroViews {

	
	
	


	
	public void apresentarLivro(Livro l) {
		System.out.println("|===============================================|");
		System.out.println("||||||||||||||||||||||LIVROS|||||||||||||||||||||");
		System.out.println("|===============================================|");
		System.out.println("|Formato:             "+  l.getFormato());
		System.out.println("|Tamanho do Arquivo   "+ l.getNomeLivro());
		System.out.println("|Números de paginas:  "+ l.getNumeroPaginas());
		System.out.println("|Vendido Por          "+ l.getVendidoPor());
		System.out.println("|Idioma:              "+ l.getIdioma());
		Autor vetor[] = l.getAutor();
		for(Autor a : vetor){
			  
			System.out.println("|Naturalidade: "+ a );
		}		
		System.out.println("|Publicado em:    "+ l.getEditoraLivro().getEditoraPrint());
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|                                               |");
		System.out.println("|-----------------------------------------------|");

		System.out.println();
		System.out.println();
		System.out.println();

		
		
	}

	
	}
