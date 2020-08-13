package HerançaPolimosrfismo;

import java.util.Scanner;

public class SequenciaSimples extends SequenciaNumerica {
	Scanner leitor = new Scanner(System.in);
	
	@Override
	public void calculo(int numeroInicial, int numeroSequencia, int a, int quant ) {
		
		 
		this.numeroSequencia = numeroSequencia;
		this.numeroInicial = numeroInicial ;
		this.quant = quant;

		 
		 
	if (a == 1 ) {
		for(int i = numeroInicial ; i <= i+1; ++i){
			System.out.println("--------------------------");
			
		System.out.println("Quantidade de números gerados = "+quant);	
		System.out.println("Numero atual = "+numeroInicial);
		numeroInicial+=numeroSequencia;
		
		System.out.println("Próximo número da sequência = "+numeroInicial);
		quant+=1;
		System.out.println("------      -----");
		System.out.println("Para continuar digite 1");
		System.out.println("Para Reinicar digite 0");	
		 a = leitor.nextInt();
		 if (a == 0) {
			 System.out.println("===========================");			 
			 numeroInicial = this.numeroInicial;
			 quant = this.quant;
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
		
	

