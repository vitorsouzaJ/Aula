package HerançaPolimosrfismo;


public class SequenciaNumerica {
	
	protected int numeroInicial;
	protected int numeroSequencia;
	protected int quant ;

	
	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
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
	

	public void calculo(int numeroInicial, int numeroSequencia, int a, int quant ) {
		this.numeroSequencia = numeroSequencia;
		this.numeroInicial = numeroInicial;
		this.quant = quant;
		System.out.println("Selecionar qual sequencia numerica deseja");
		
	}
	

	
	
	
	
	
	
	}
