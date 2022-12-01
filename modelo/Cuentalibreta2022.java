package modelo;

public class Cuentalibreta2022 extends Cuenta {
	
	public Cuentalibreta2022(double saldo, final double interes) {
        super( saldo, intereses, interes);

    }

    protected static double intereses;
	protected double saldo;
	
	public void Cuenta(double intereses, double saldo) {
		Cuentalibreta2022.intereses = intereses;
		this.saldo = saldo;
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
		return String.format("Nº Cuenta: %s, Titular: %s, Saldo: %s", intereses, saldo, penal);
	}
	
}