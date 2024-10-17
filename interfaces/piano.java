package interfaces;

public class piano extends instrumento implements InstrumentoMusical, afiavel{
	public piano(String nome) {
		super(nome);		
	}
	
	
	///////////////////////MÉTODOS
	@Override
	public void tocar() {
		System.out.println(nome+"está tocando piano!");
	}


	@Override
	public void parar() {
		System.out.println(nome+"parou de tocar piano!");
		
	}

	@Override
	public void afinar() {
		System.out.println("O piano de está afiadinho kk");
		
	}

	@Override
	public String tipoInstrumento() {
		return "Instrumento de corda";
		
	}


	
	

}
