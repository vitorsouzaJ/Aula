package HerançaPolimosrfismo;


public class SequenciaNumerica {
	
	protected int numeroInicial;
	protected int numeroSequencia;
	protected int quantidadeNumerosGerados ;

	
	public int getQuantidadeNumerosGerados () {
		return quantidadeNumerosGerados ;
	}

	public void setQuant(int quantidadeNumerosGerados) {
		this.quantidadeNumerosGerados  = quantidadeNumerosGerados;
	}

	public int getNumeroInicial() {
		return numeroInicial;
	}

	public void setNumeroInicial(int numeroInicial) {
		this.numeroInicial = numeroInicial;
	}

	
	public int getNumeroSequencia() {
		return numeroSequencia;
	}

	public void setNumeroSequencia(int numeroSequencia) {
		this.numeroSequencia = numeroSequencia;
	}
	

	public void calculo(int numeroInicial, int numeroSequencia, int a, int quantidadeNumerosGerados ) {
		this.numeroSequencia = numeroSequencia;
		this.numeroInicial = numeroInicial;
		this.quantidadeNumerosGerados = quantidadeNumerosGerados;
		System.out.println("Selecionar qual sequencia numerica deseja");
		
	}
	

	
	
	
	
	
	
	}
