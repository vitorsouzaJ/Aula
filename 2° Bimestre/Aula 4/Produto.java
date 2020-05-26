
public class Produto {

	private String nome;
	private String valor;
	
	
	
	public Produto(String nome, String valor) {
		this.nome =  nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome =  nome;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor =  valor;
	}	
	
	
	@Override
	public String toString() {
		return "[Produto(nome = "+nome+", valor = "+valor+")]";
}
	
	@Override
		public boolean equals(Object o) {
		if (this == o) return true;
			if (o == null) return false;
				if(o instanceof Produto) {
					Produto n = (Produto)o;
					boolean flag = false;
					if(nome != null) {
						flag = nome.equals(n.nome);
					
					}else {
						flag = n.nome == null;
						
					}
					if(valor != null) {
						flag = flag && valor.equals(n.valor);
						
					}else {
						flag = flag && n.valor == null;
						
					}
					return flag;
					
				}
				return false;
	}
	
		
	
}
	
	
	
	
	
	
	
