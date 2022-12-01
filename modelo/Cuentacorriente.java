package modelo;

public class Cuentacorriente extends Cuenta {
	
	public Cuentacorriente( double saldo) {
        super( saldo, saldo, saldo);
        
    }

	protected double saldo;
	
	public void Cuenta( double saldo) {
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
		return String.format(" Saldo: %s", saldo);
	}
	
}