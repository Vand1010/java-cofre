package trabalho;

public class Cofrinho {
	Dolar dolar = new Dolar(); 
	Euro euro = new Euro();  
	Real real = new Real(); 
	
	
	// lista com as moedas e metodos de adicionar e remover moedas.
	
	public void adicionarMoedas(int tipoMoeda, double moeda) {
		if(tipoMoeda == 1) { 
			
			dolar.adicionarDolar(moeda);
		} else if (tipoMoeda == 2) { 
			
			euro.adicionarEuro(moeda);
		} else if (tipoMoeda == 3) { 
		
			real.adicionarReal(moeda);
		} else { 
			System.out.println("Valor inválido. Tente novamente");
		}
	}
	

	public void removerMoedas(int tipoMoeda, double moeda) {
		if(tipoMoeda == 1) { 
			dolar.removerDolar(moeda);
		} else if(tipoMoeda == 2) { 
			
			euro.removerEuro(moeda);
		} else if(tipoMoeda ==3) { 
			
			real.removerReal(moeda);
		} else { 
			System.out.println("Valor inválido. Tente novamente");
		}
	}
	
	public void listagemMoedas() {
		dolar.info();
		euro.info();
		real.info();
	}
	
	// Metodo de converter moedas para real
	public void totalConvertido() {
		double totalConvertido = dolar.converter() + euro.converter()
			+ real.converter();
		
		System.out.printf("Total convertido em reais: "
				+ "R$%.2f%n", totalConvertido);
	}
}


