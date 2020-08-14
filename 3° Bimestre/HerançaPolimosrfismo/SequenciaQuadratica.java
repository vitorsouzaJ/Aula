package HerançaPolimosrfismo;

import java.util.Scanner;

public class SequenciaQuadratica extends SequenciaNumerica{
	
	Scanner leitor = new Scanner(System.in);

	@Override
	public void calculo(int numeroInicial, int numeroSequencia, int a, int quant ) {
		this.numeroSequencia = numeroSequencia;
		this.numeroInicial = numeroInicial;
		this.quantidadeNumerosGerados = quantidadeNumerosGerados;
		
		
		
		if (a == 1 ) {
			for(int i = numeroInicial ; i <= i+4; ++i){
				System.out.println("--------------------------");
				
			System.out.println("Quantidade de números gerados = "+quant);	
			System.out.println("Numero atual = "+numeroInicial);
			numeroInicial+=numeroSequencia;
			numeroSequencia = 4  + numeroSequencia;
			
			
			System.out.println("Próximo número da sequência = "+numeroInicial);
			quant+=1;
			System.out.println("------      -----");
			System.out.println("Para continuar digite 1");
			System.out.println("Para Reinicar digite 0");	
			 a = leitor.nextInt();
			 if (a == 0) {
				 System.out.println("===========================");			 
				 numeroInicial = this.numeroInicial;
				 quant = this.quantidadeNumerosGerados;
				 numeroSequencia = this.numeroSequencia;
				 
				 
				 
			 }else if (a == 1) {
				 a=1;
				 }else {
					 System.out.println("Informou codigo errado");
					 break;
				 }
			
				}	
		}
	}
	}