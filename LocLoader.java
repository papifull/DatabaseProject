package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LocLoader {

	public boolean loadLocToBd(String idloc) {
		boolean load = false;
		
		try {
			Connection connexion = SingletonConnection.getConnexion();
			PreparedStatement ps1 = connexion.prepareStatement("SELECT * FROM localite WHERE idloc = ?");
			ps1.setString(1, idloc);
			PreparedStatement ps = connexion.prepareStatement("INSERT INTO Localite(idloc, nomloc, niveauadm) VALUES(?, ?, ?)");
			//les autres champs sont remplis automatiquement grâce aux trigger
			
			load = true;
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return load;
	}
}
