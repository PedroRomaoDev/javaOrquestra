package interfaces;

public class violao extends instrumento implements InstrumentoMusical, afiavel {
	public violao(String nome) {
		super(nome);		
	}
	
	
	///////////////////////MÉTODOS
	@Override
	public void tocar() {
		System.out.println(nome+"está tocando violão!");
	}


	@Override
	public void parar() {
		System.out.println(nome+"parou de tocar violão!");
		
	}
	
	@Override
	public void afinar() {
		System.out.println("O violão está afinado");
		
	}


	@Override
	public String tipoInstrumento() {
		return "Instrumento de cordas";
		
	}
	

}
