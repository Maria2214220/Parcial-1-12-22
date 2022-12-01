package modelo;

public class Cuentaahorros extends Cuenta {
	
	public Cuentaahorros(double saldo, double interes) {
        super( saldo, interes, interes);
    
    }
	protected double saldo;
    protected double interes;
	
	public void Cuenta( double saldo, double interes) {
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
		return String.format(" Intereses: %s, Saldo: %s", interes, saldo);
	}
	
}