package trabalho;

public class Euro {
private double valor = 0;
	
	double valor() {
		return valor;
	}
	
	public void adicionarEuro(double moeda) {
		valor = valor() + moeda;
	}

	void removerEuro(double moeda) {
		valor = valor() - moeda;	
	}
	
	void info() {
		System.out.printf("Euro = $%.2f%n", valor);
	}

	
	double converter() {
		
		double converterEuroParaReais = valor() * 5.60;
		
		return converterEuroParaReais;
		
	}
}

