public class Main {
	
	public static void main(String[] args) {
		
		Produto A = new Produto("Moto G5s","R$800,00");
		Produto B = new Produto("iPhone 11 Pro Max","R$8499,00");
		Produto C = new Produto("Samsung Galaxy S10","R$2789,07");
		
		//imprimir por meio do get
		System.out.println("Celuar "+A.getNome()+ " custa "+A.getValor());
		System.out.println("Celuar "+B.getNome()+ " custa "+B.getValor());
		System.out.println("Celuar "+C.getNome()+ " custa "+C.getValor());
		
		System.out.println();
		System.out.println("======================");
		System.out.println();
		
		Produto D = A;
		B.setNome("Samsung Galaxy S10");
		B.setValor("R$2789,07");
		
		//Imprimir pelo toString
		System.out.println("Imprimir o Celular A "+A);
		System.out.println("Imprimir o Celular B "+B);
		System.out.println("Imprimir o Celular C "+C);
		System.out.println("Imprimir o Celular D "+D);
		
		System.out.println();
		System.out.println("======================");
		System.out.println();
		
		
		//comparaçao ==
		System.out.println("A == B ? "+(A == B) );
		System.out.println("A == C ? "+(A == C) );
		System.out.println("C == B ? "+(C == B) );
		System.out.println("A == D ? "+(A == D) );
		System.out.println("B == D ? "+(B == D) );
		System.out.println("C == D ? "+(C == D) );
		
		System.out.println();
		System.out.println("======================");
		System.out.println();
		
		//comparação equals
		System.out.println("A equals B ? "+(A.equals( B)));
		System.out.println("A equals C ? "+(A.equals( C)));
		System.out.println("C equals B ? "+(C.equals( B)));
		System.out.println("A equals D ? "+(A.equals( D)));
		System.out.println("B equals D ? "+(B.equals( D)));
		System.out.println("C equals D ? "+(C.equals( D)));
	
		
	
		

	}

}
