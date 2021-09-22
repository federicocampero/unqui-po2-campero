package ar.edu.unq.po2.tp4.trabajador;

public class HorasExtras extends Ingreso {
	
	private int cantidadDeHoras;

	public HorasExtras(int mes, String concepto, double montoPercibidoDelMes, int cantidadDeHoras) {
		super(mes, concepto, montoPercibidoDelMes);
		this.cantidadDeHoras = cantidadDeHoras;
	}
	
	@Override
	public double getMontoImponibleDelMes() {
		return 0;
	}
	
	@Override
	public double getImpuestoAPagarPorMes() {
		return 0;
	}
	
	@Override
	public double getMontoPercibidoDelMes() {
		return montoPercibidoDelMes;
	}
	
	

}
