
public enum descontosPorPeças {
	
	
	Comprou1Peça("0% desconto"),
	Comprou2Peça("0% desconto"),
	Comprou3Peça("5% de desconto"),
	Comprou4Peça("5% de desconto"),
	Comprou5Peça("5% de desconto"),
	Comprou6Peça("10% de desconto"),
	Comprou7Peça("10% de desconto");
	
	

	private String desconto;
	
	

	private descontosPorPeças(String desconto) {
		this.desconto = desconto;
	}

	public String desconto() {
		return desconto;
	}


	

}
