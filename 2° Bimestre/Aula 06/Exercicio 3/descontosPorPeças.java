
public enum descontosPorPe�as {
	
	
	Comprou1Pe�a("0% desconto"),
	Comprou2Pe�a("0% desconto"),
	Comprou3Pe�a("5% de desconto"),
	Comprou4Pe�a("5% de desconto"),
	Comprou5Pe�a("5% de desconto"),
	Comprou6Pe�a("10% de desconto"),
	Comprou7Pe�a("10% de desconto");
	
	

	private String desconto;
	
	

	private descontosPorPe�as(String desconto) {
		this.desconto = desconto;
	}

	public String desconto() {
		return desconto;
	}


	

}
