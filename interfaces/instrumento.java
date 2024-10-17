package interfaces;

public abstract class instrumento {
	protected String nome;
	
	
	
	public instrumento(String nome) {
		this.nome = nome;
	}
	
	
	///////////////////método
	public String exibirNome() {
		System.out.println(nome);
		return nome;

	}
}
