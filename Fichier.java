package pojo;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import service.LireJson;
//on a telechargé le jar qui contient les classes json
//import java.awt.EventQueue;
//import java.sql;


public class Fichier {//correspond aux fichiers de stockage des communiqués du mois
	private String nom; //année_mois
	private Communique [] listeCommunique; 
	private Date dateExtraction;
	private File fichierMens;
	
	public Fichier(String nom, Communique[] listeCommunique, Date dateExtraction) {
		super();
		this.nom = nom;
		this.listeCommunique = listeCommunique;
		this.dateExtraction = dateExtraction;
	}

	public Fichier(String nom, Date dateExtraction, File fichierMens) {
		super();
		this.nom = nom;
		this.dateExtraction = dateExtraction;
		this.fichierMens = fichierMens;
	}

	public Fichier(String nom, File fichierMens) {
		super();
		this.nom = nom;
		this.fichierMens = fichierMens;
	}

	public File getFichierMens() {
		return fichierMens;
	}

	public void setFichierMens(File fichierMens) {
		this.fichierMens = fichierMens;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Communique[] getListeCommunique() {
		LireJson json = new LireJson();
		return json.recupererFichierMensuel(this.fichierMens);
	}

	public void setListeCommunique(Communique[] listeCommunique) {
		this.listeCommunique = listeCommunique;
	}

	public Date getDateExtraction() {
		return dateExtraction;
	}

	public void setDateExtraction(Date dateExtraction) {
		this.dateExtraction = dateExtraction;
	}
	
	
	
	
	
}



