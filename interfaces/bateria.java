package interfaces;

public class bateria extends instrumento implements InstrumentoMusical {
	public bateria(String nome) {
		super(nome);		
	}
	
	
	///////////////////////MÉTODOS
	@Override
	public void tocar() {
		System.out.println(nome+"está tocando bateria");
	}


	@Override
	public void parar() {
		System.out.println(nome+"parou de tocar bateria!");
		
	}


	@Override
	public String tipoInstrumento() {
		return "Instrumento de percussão";
		
	}
	
	

}
