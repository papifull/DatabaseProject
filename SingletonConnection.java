package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static String url = "jdbc:mysql://localhost:3306/";
	private static String user = "root";
	private static String password ="";
	private static Connection connection;
	static {
		try {//on verifie si la connexion à la bd est bien établie
			Class.forName ("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			//System.out.println("Connexion à la base de données réussie");
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("Erreur lors de la connexion");
		    System.exit(0);
		}
		System.out.println("Connexion établie.");
	}
	public static Connection getConnexion() {
		return connection;
	}
	
	
	

}

