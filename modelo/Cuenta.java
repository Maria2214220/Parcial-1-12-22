package modelo;

public class Cuenta extends Banco {
	
	protected double saldo;
	protected double interes;
	protected double penal;
	
	public Cuenta( double saldo, double interes, double penal) {
		this.saldo = saldo;
		this.interes = interes;
		this.penal = penal;
	}
	
	public void depositar(double monto) {
		saldo += monto;
	}
	
	public boolean retirar(double importe) {
		if (importe > saldo)
			return false;
		else {
			saldo -= importe;
			return true;
		}
	}

	@Override
	public String toString() {
		return String.format("Nº Cuenta: %s, Titular: %s, Saldo: %s", saldo, interes);
	}
	
}