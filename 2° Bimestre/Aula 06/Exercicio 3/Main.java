
public class Main {
		
	public static void main(String[] args) {
		Camiseta A = new Camiseta(tipoTamanho.tamanhoM,"João",Genero.Femenino,cor.Azul,descontosPorPeças.Comprou1Peça,1);
		Camiseta B = new Camiseta(tipoTamanho.tamanhoG, "pedro",Genero.Masculino,cor.Rosa,descontosPorPeças.Comprou2Peça,2);
		Camiseta C = new Camiseta(tipoTamanho.tamanho36, "Flavia",Genero.Unissex,cor.Preto,descontosPorPeças.Comprou3Peça,3);
		Camiseta D = new Camiseta(tipoTamanho.tamanhoEGG, "Julia",Genero.Unissex,cor.Verde,descontosPorPeças.Comprou5Peça,5);
		Camiseta E = new Camiseta(tipoTamanho.tamanho42, "Aline",Genero.Masculino,cor.Laranja,descontosPorPeças.Comprou6Peça,6);
		
		
		
		System.out.println(Cam(A) );
		System.out.println(Cam(B) );	
		System.out.println(Cam(C) );
		System.out.println(Cam(D) );
		System.out.println(Cam(E) );
		
	}
		
		public static String Cam (Camiseta camiseta) {
			
			return  " o Usuario "+camiseta.getNome()+" comprou "+camiseta.getPeças()+" Peças de camiseta do tamanho "
					+camiseta.getTamanho().getTamanhoEnum().getValor()+ " do genero "+
					camiseta.getGenero()+ " com a cor "+ camiseta.getCor()+ 
					" e obteve "+camiseta.getDescontosPorPeças().desconto();
			
			
			
		}
		
		
		
		
	

}
