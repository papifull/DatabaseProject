package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.Communique;

public class ComLoader {
	public boolean loadComToBd (Communique newCom) {//Cette méthode permet à le user d'ajouter un new communique qui est fourni en paramètre
		   //fichierSource correspond au nom du fichier json année_mois
		boolean load = false;
		try {
			Connection connexion = SingletonConnection.getConnexion();
			PreparedStatement ps = connexion.prepareStatement("INSERT INTO communique(date, format, nombreTest, nombreNouvCas, nombreCasCont, nombreCasCom, nombreGueris, nombreDeces)\r\n"
			+" VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setDate(1, (Date) newCom.getDate());
			ps.setString(2, newCom.getFormat());
			ps.setInt(3, newCom.getNombreTest());
			ps.setInt(4, newCom.getNombreNouvCas());
			ps.setInt(5, newCom.getNombreCasCont());
			ps.setInt(6, newCom.getNombreCasCom());
			ps.setInt(7, newCom.getNombreGueris());
			ps.setInt(8, newCom.getNombreDeces());
			ResultSet rs = ps.executeQuery();
			
			load = true;
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return load;
	}
	
	public ArrayList<Communique> getListCom(){
		ArrayList<Communique> communiques = new ArrayList<Communique>();
		 
		
		return communiques;
	}
}
