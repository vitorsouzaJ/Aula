package HerançaPolimosrfismo;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
	//SequenciaNumerica SN = new SequenciaNumerica();
		
	SequenciaQuadratica SQ = new SequenciaQuadratica();
	SequenciaSimples SS =  new 	SequenciaSimples();
	
	//System.out.print("SequenciaNumerica = ");SN.calculo(1,2);
	//System.out.println(SN.toString());
	
	
	System.out.println("Para fazer sequencia Simples selecione 1");
	System.out.println("Para fazer sequencia Quadratica selecione 0");
	 int T = leitor.nextInt();
	 
	 
	 if (T == 1)
	 {	
		 System.out.println("informe o numero Inicial");
		 int I = leitor.nextInt();
		 
		 
			System.out.println("SequenciaSimples = ");
			SS.calculo(I,1,1,1);
	 }else if(T == 0){
		 
		 System.out.println("informe o numero Inicial");
		 int I = leitor.nextInt();
		 
		 System.out.println("SequenciaQuadratica = ");
			SQ.calculo(I,4,1,1);
		 
	 }else {
		 System.out.println("Informou codigo errado");
		 
	 }
	
	
	
	


	
		
		
		  }
		    
	}
	
		
		
		
		
		



