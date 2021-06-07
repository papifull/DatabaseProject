package service;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import pojo.Communique;

public class LireJson {
	public Communique [] recupererFichierMensuel(File fichierMens)	{//le lien du fichier mensuel est fourni en parametre
		JSONObject ficJsonMens = new JSONObject(fichierMens); //on cree un jsonObjet à partir du fichier mensuel
	    JSONArray communiqueArray = ficJsonMens.optJSONArray("communiques"); //un arraylist pour stocker l'ensemble des communiqués du mois
	    int j = communiqueArray.length();
	    Communique [] lesComMens = new Communique[j];
	    for (int i = 0; i < j; i++) {
	    	JSONObject communiqueObject = communiqueArray.getJSONObject(i);
	    	//JSONObject communiqueObject = communiqueObjt.parse(new FileReader(fichierMens));
	    	Date date = null;
	    	try {//on recupère la date qui est en format txte au niveau du fichier et on le convertit en date
				date = new SimpleDateFormat("dd/MM/yyyy").parse(communiqueObject.getString("date"));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	String format = communiqueObject.getString("format"); //image ou pdf
	    	int nombreTest = communiqueObject.getInt("NbTest");
	    	int nombreNouvCas = communiqueObject.getInt("NbNouveauxCas");
	    	int nombreCasCont = communiqueObject.getInt("NbCasContacts");
	    	int nombreCasCom = communiqueObject.getInt("NbCasCommunautaires");
	    	int nombreGueris = communiqueObject.getInt("NbGueris");
	    	int nombreDeces = communiqueObject.getInt("NbDeces");
			Communique com = new Communique(date,format,nombreTest,nombreNouvCas,nombreCasCont,nombreCasCom,nombreGueris,nombreDeces );
	    	lesComMens[i]= com;	    	
	    }
	    return lesComMens;
	}
}
