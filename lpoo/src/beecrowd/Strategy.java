package beecrowd;

public class Strategy {
	
	public interface TaxStrategy {
	    double calculateTax(double income);
	}
	
	public class IncomeTaxStrategy implements TaxStrategy {
	    @Override
	    public double calculateTax(double income) {
	        return income * 0.25; // Supondo 25% de imposto de renda
	    }
	}

	public class VATStrategy implements TaxStrategy {
	    @Override
	    public double calculateTax(double income) {
	        return income * 0.20; // Supondo 20% de IVA
	    }
	}
	
	public class TaxCalculator {
	    private TaxStrategy strategy;

	    public TaxCalculator(TaxStrategy strategy) {
	        this.strategy = strategy;
	    }

	    public void setStrategy(TaxStrategy strategy) {
	        this.strategy = strategy;
	    }

	    public double calculate(double income) {
	        return strategy.calculateTax(income);
	    }
	}

}
