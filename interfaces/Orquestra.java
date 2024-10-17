package interfaces;

public class Orquestra {
	public static void main(String[] args) {
		
		//CRIANDO INSTRUMENTOS COM DIFERENTES ATRIBUTOS ESPECÍFICOS
		violao violao1 = new violao("SEBASTIÃO ");	
		piano piano1 = new piano("AFEGANISTÃO ");
		bateria bateria1 = new bateria("SÉRGIO ");
	
		//MÉTODOS
		violao1.exibirNome();
		violao1.afinar();
		violao1.tipoInstrumento();
		violao1.tocar();
		violao1.parar();

		piano1.exibirNome();
		piano1.afinar();
		piano1.tipoInstrumento();
		piano1.tocar();
		piano1.parar();
		
		bateria1.exibirNome();
		bateria1.tipoInstrumento();
		bateria1.tocar();
		bateria1.parar();
	}

}
