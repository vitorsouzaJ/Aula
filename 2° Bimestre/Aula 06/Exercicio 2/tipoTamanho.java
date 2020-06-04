
public enum tipoTamanho {

	
	
	tamanho34(tamanhoEnum.tamanho34),
	tamanho36(tamanhoEnum.tamanho36),
	tamanho38(tamanhoEnum.tamanho38),
	tamanho40(tamanhoEnum.tamanho40),
	tamanho42(tamanhoEnum.tamanho42),
	tamanho44(tamanhoEnum.tamanho44),
	tamanho46(tamanhoEnum.tamanho46),
	tamanhoPP(tamanhoEnum.tamanhoPP) ,
	tamanhoP(tamanhoEnum.tamanhoP) ,
	tamanhoM(tamanhoEnum.tamanhoM) ,
	tamanhoG(tamanhoEnum.tamanhoG) ,
	tamanhoGG(tamanhoEnum.tamanhoGG) ,
	tamanhoEGG(tamanhoEnum.tamanhoEGG);
	
	
	
	private tamanhoEnum TamanhoEnum;
	
	private tipoTamanho(tamanhoEnum i) {
		TamanhoEnum = i;
	}
	public tamanhoEnum getTamanhoEnum() {
		return TamanhoEnum;
		
		
	}
	
}
