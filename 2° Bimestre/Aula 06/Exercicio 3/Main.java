
public class Main {
		
	public static void main(String[] args) {
		Camiseta A = new Camiseta(tipoTamanho.tamanhoM,"Jo�o",Genero.Femenino,cor.Azul,descontosPorPe�as.Comprou1Pe�a,1);
		Camiseta B = new Camiseta(tipoTamanho.tamanhoG, "pedro",Genero.Masculino,cor.Rosa,descontosPorPe�as.Comprou2Pe�a,2);
		Camiseta C = new Camiseta(tipoTamanho.tamanho36, "Flavia",Genero.Unissex,cor.Preto,descontosPorPe�as.Comprou3Pe�a,3);
		Camiseta D = new Camiseta(tipoTamanho.tamanhoEGG, "Julia",Genero.Unissex,cor.Verde,descontosPorPe�as.Comprou5Pe�a,5);
		Camiseta E = new Camiseta(tipoTamanho.tamanho42, "Aline",Genero.Masculino,cor.Laranja,descontosPorPe�as.Comprou6Pe�a,6);
		
		
		
		System.out.println(Cam(A) );
		System.out.println(Cam(B) );	
		System.out.println(Cam(C) );
		System.out.println(Cam(D) );
		System.out.println(Cam(E) );
		
	}
		
		public static String Cam (Camiseta camiseta) {
			
			return  " o Usuario "+camiseta.getNome()+" comprou "+camiseta.getPe�as()+" Pe�as de camiseta do tamanho "
					+camiseta.getTamanho().getTamanhoEnum().getValor()+ " do genero "+
					camiseta.getGenero()+ " com a cor "+ camiseta.getCor()+ 
					" e obteve "+camiseta.getDescontosPorPe�as().desconto();
			
			
			
		}
		
		
		
		
	

}
