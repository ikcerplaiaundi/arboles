package arboles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GestorArboles {
	private static final String HOST = "localhost";
	private static final String BBDD = "primera";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	public static void run() throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://" + HOST + "/" + BBDD;
		Connection con = DriverManager.getConnection(url, USERNAME, PASSWORD);
		Statement st = con.createStatement();
		Scanner scan = new Scanner(System.in);
		int opciones;
		String[] partes;
		do {
			
			System.out.println("1 insertar árbol\r\n" 
					+ "2 eliminar árbol\r\n" 
					+ "3 modificar información del árbol\r\n"
					+ "4 visualizar árboles\r\n" 
					+ "5 salir");
			opciones = 0;
			opciones = Integer.parseInt(scan.nextLine());
			switch (opciones) {
			case 1: {
				try {
				System.out.println("insertar árbol int id, String nombreComun,String nombreCientifuico,String habitat,int altura,String origen");
				partes=scan.nextLine().split(",");
				st.execute("INSERT INTO `arboles`( `nombre_comun`, `nombre_cientifico`, `habitat`, `altura`, `origen`) VALUES ('"+partes[1]+"','"+partes[2]+"','"+partes[3]+"','"+partes[4]+"','"+partes[5]+"')");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			case 2: {
				try {
				System.out.println("insertar árbol \" int id a eliminar \"");
				partes=scan.nextLine().split(",");
				String sentDELETE="DELETE FROM arboles WHERE id ='"+partes[0]+"'";
				st.executeUpdate(sentDELETE);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			case 3: {
				try {
				System.out.println("insertar árbol int id, String nombreComun,String nombreCientifuico,String habitat,int altura,String origen");
				partes=scan.nextLine().split(",");
				String sentUpdate="UPDATE arboles SET `nombre_comun`='"+partes[1]+"',`nombre_cientifico`='"+partes[2]+"',`habitat`='"+partes[3]+"',`altura`='"+partes[4]+"',`origen`='"+partes[5]+"' WHERE id='"+partes[0]+"'";
				st.executeUpdate(sentUpdate);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			case 4: {
				try {
				String sentSELECT="SELECT * FROM `arboles` WHERE 1";
				ResultSet resultado=st.executeQuery(sentSELECT);
				while(resultado.next()) {
					System.out.println(resultado.getString(5));
				}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			case 5: {
				System.out.println("seguro s / n");
				partes=scan.nextLine().split(",");
				if(partes[0]=="n") {
					opciones=4;
				}
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opciones);
			}
		} while (opciones != 5);
	}
}
