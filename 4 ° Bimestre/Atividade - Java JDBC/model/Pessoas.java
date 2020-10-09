package model;


public class Pessoas {

	
	private String PessoaNome;
	private String PessoaNascimento;
	private String PessoaBairro;
	private String PessoaCidade;
	private String PessoaSexo;
	private int PessoaCPF;
	
	
	@Override
	public String toString() {
		return "Pessoas [PessoaNome=" + PessoaNome + ", PessoaNascimento=" + PessoaNascimento + ", PessoaBairro="
				+ PessoaBairro + ", PessoaCidade=" + PessoaCidade + ", PessoaSexo=" + PessoaSexo + ", PessoaCPF="
				+ PessoaCPF + "]";
	}
	public String getPessoaNome() {
		return PessoaNome;
	}
	public void setPessoaNome(String pessoaNome) {
		PessoaNome = pessoaNome;
	}
	public String getPessoaNascimento() {
		return PessoaNascimento;
	}
	public void setPessoaNascimento(String pessoaNascimento) {
		PessoaNascimento = pessoaNascimento;
	}
	public String getPessoaBairro() {
		return PessoaBairro;
	}
	public void setPessoaBairro(String pessoaBairro) {
		PessoaBairro = pessoaBairro;
	}
	public String getPessoaCidade() {
		return PessoaCidade;
	}
	public void setPessoaCidade(String pessoaCidade) {
		PessoaCidade = pessoaCidade;
	}
	public String getPessoaSexo() {
		return PessoaSexo;
	}
	public void setPessoaSexo(String pessoaSexo) {
		PessoaSexo = pessoaSexo;
	}
	public int getPessoaCPF() {
		return PessoaCPF;
	}
	public void setPessoaCPF(int pessoaCPF) {
		PessoaCPF = pessoaCPF;
	}

	
	
	
	
}
