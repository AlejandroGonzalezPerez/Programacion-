import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;

public class DB {
	Connection conexion = null; //maneja la conexión
	Statement instruccion = null;// instrucción de consulta
	ResultSet conjuntoResultados = null;// maneja los resultados
	private JComboBox<DB> listadoCoches ;
	
	public DB(JComboBox<Coche>listadoCoches) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			// establece la conexión a la base de datos
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/apuestas","root","tonphp");
			// crea objeto Statement para consultar la base de datos
			instruccion = (Statement) conexion.createStatement();
			}catch( SQLException excepcionSql ){
			excepcionSql.printStackTrace();
			}// fin de catch
	}
	
	public void leerCoches(JComboBox Coche){
	
	
		public void insertarCoche(String Matriculacoche, int Horaentrada, int Horasalida, int Euros, String Observaciones){
			try{
				instruccion = (Statement) conexion.createStatement();
				
			}catch (SQLException e){
				e.printStackTrace();
			}
			try{
				String id;
				String sql="INSERT INTO 'parking'. 'controlcoches'(`id`, `matricula`, `horaentrada`, `horasalida`, `precio`, `observaciones`)VALUES ("+"'"+id+"','"+Matriculacoche+"', '"+Horaentrada+"','"+Horasalida+"', '"+Euros+"','"+Observaciones+"')"; 
				instruccion.executeUpdate(sql);
			
			}catch (SQLException e){
				e.printStackTrace();
			}
		}}
		public void leerDelincuentes() {

	}	

}
