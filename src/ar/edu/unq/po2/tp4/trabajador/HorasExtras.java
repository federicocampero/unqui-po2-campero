package ar.edu.unq.po2.tp4.trabajador;

public class HorasExtras extends Ingreso {
	
	private int cantidadDeHoras;

	public HorasExtras(int mes, String concepto, double montoPercibido, int cantidadDeHoras) {
		super(mes, concepto, montoPercibido);
		this.cantidadDeHoras = cantidadDeHoras;
	}
	
	@Override
	public double getMontoNetoDelMes() {
		
		return this.getMontoBrutoDelMes();
	}
	
	@Override
	public double getImpuestoAPagarPorMes() {
		return 0;
	}
	
	@Override
	public double getMontoBrutoDelMes() {
		// TODO Auto-generated method stub
		return super.getMontoBrutoDelMes();
	}
	
	

}
