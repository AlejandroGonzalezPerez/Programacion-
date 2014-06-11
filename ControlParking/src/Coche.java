
public class Coche {
	private int ID;
	private String Matriculacoche;
	private int Horaentrada;
	private int Horasalida;
	private int Euros;
	private String Observaciones;
	

	public Coche() {
		ID=0;
		Matriculacoche="";
		Horaentrada=0;
		Horasalida=0;
		Euros=0;
		Observaciones="";
	}
	public void setID(int CojeID) {
		ID=CojeID;
	}
	public int getID() {
		return ID;
	}
	public void setMatriculacoche(String CojeMatriculacoche) {
		Matriculacoche=CojeMatriculacoche;
	}
	public String getMatriculacoche() {
		return Matriculacoche;
	}
	public void setHoraentrada(int CojeHoraentrada) {
		Horaentrada=CojeHoraentrada;
	}
	public int getHoraentrada() {
		return Horaentrada;
	}
	public void setHorasalida(int CojeHorasalida) {
		Horasalida=CojeHorasalida;
	}
	public int getHorasalida() {
		return Horasalida;
	}
	public void setEuros(int CojeEuros) {
		Euros=CojeEuros;
	}
	public int getEuros() {
		return Euros;
	}
	public void setObservaciones(String CojeObservaciones) {
		Observaciones=CojeObservaciones;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public String toString(){
		return Matriculacoche+" ";
}
	}

