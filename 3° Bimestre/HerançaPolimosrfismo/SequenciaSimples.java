package Heran�aPolimosrfismo;

import java.util.Scanner;

public class SequenciaSimples extends SequenciaNumerica {
	Scanner leitor = new Scanner(System.in);
	
	@Override
	public void calculo(int numeroInicial, int numeroSequencia, int a, int quantidadeNumerosGerados ) {
		
		 
		this.numeroSequencia = numeroSequencia;
		this.numeroInicial = numeroInicial ;
		this.quantidadeNumerosGerados = quantidadeNumerosGerados;

		 
		 
	if (a == 1 ) {
		for(int i = numeroInicial ; i <= i+1; ++i){
			System.out.println("--------------------------");
			
		System.out.println("Quantidade de n�meros gerados = "+quantidadeNumerosGerados);	
		System.out.println("Numero atual = "+numeroInicial);
		numeroInicial+=numeroSequencia;
		
		System.out.println("Pr�ximo n�mero da sequ�ncia = "+numeroInicial);
		quantidadeNumerosGerados+=1;
		System.out.println("------      -----");
		System.out.println("Para continuar digite 1");
		System.out.println("Para Reinicar digite 0");	
		 a = leitor.nextInt();
		 if (a == 0) {
			 System.out.println("===========================");			 
			 numeroInicial = this.numeroInicial;
			 quantidadeNumerosGerados = this.quantidadeNumerosGerados;
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
		
	

