
public class mainTamanho {
		
	public static void main(String[] args) {
		Tamanho A = new Tamanho(tipoTamanho.tamanhoM,"João");
		Tamanho B = new Tamanho(tipoTamanho.tamanhoG, "pedro");
		
		
		System.out.println(Tam(A) );
		System.out.println(Tam(B) );	
		
	}
		
		public static String Tam (Tamanho tamanho) {
			
			return  " o comprador "+tamanho.getNome()+" usa o tamanho "+ tamanho.getTamanho().getTamanhoEnum().getValor();
			
			
			
		}
		
		
		
		
	

}
