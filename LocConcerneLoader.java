package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojo.Communique;
import pojo.Localite;

public class LocConcerneLoader {
	public boolean loadLocConToBd(Communique newCom ) {
		boolean load = false;
		for(int i = 0 ; i < newCom.getLocalitesConcernes().size(); i++) {	
			Localite loc = newCom.getLocalitesConcernes().get(i);
			try {
				Connection connexion = SingletonConnection.getConnexion();
				PreparedStatement ps = connexion.prepareStatement("INSERT INTO localitesconcernes(date, idloc) VALUES (?, ?)");
				ps.setDate(1, (Date) newCom.getDate());
				ps.setString(2, loc.getNomLoc());
				ResultSet rs = ps.executeQuery();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
		return load;
	}

}
