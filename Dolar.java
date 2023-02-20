package trabalho;

public class Dolar {
private double valor = 0;
	
	double valor() {
		return valor;
	}
	
	public void adicionarDolar(double moeda) {
		valor = valor() + moeda;
	}

	void removerDolar(double moeda) {
		valor = valor() - moeda;	
	}
	
	void info() {
		System.out.printf("Dolares = $%.2f%n", valor);
	}

	
	double converter() {
		
		double converterDolaresParaReais = valor() * 5.40;
		
		return converterDolaresParaReais;
		
	}

	
	}


