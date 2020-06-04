
public enum tamanhoEnum {
	

	tamanho34("34"),
	tamanho36("36"),
	tamanho38("38"),
	tamanho40("40"),
	tamanho42("42"),
	tamanho44("44"),
	tamanho46("46"),
	tamanhoPP("PP") ,
	tamanhoP("P") ,
	tamanhoM("M") ,
	tamanhoG("G") ,
	tamanhoGG("GG") ,
	tamanhoEGG("EGG" );

	
	private String valor;
	
	

	private tamanhoEnum(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}


	
	
}
	
