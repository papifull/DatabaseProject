import java.io.File; 
  
import net.sourceforge.tess4j.*;
import net.sourceforge.tess4j.TesseractException; 
  
public class Recuperation_pdf {

	public static void main(String[] args) 
	    { 
	        Tesseract tesseract = new Tesseract(); 
	        try {
	            tesseract.setDatapath("Users/macbookair/Documents/ProjetBaseDeDonnees/Tess4J/tessdata");
	            tesseract.setLanguage("eng");
	            // chemin du dossier de données tess
	            // a l'interieur du fichier extrait
	            String text = tesseract.doOCR(new File("Users/macbookair/Documents/ProjetBaseDeDonnees/Tess4J/COMMUNIQUE.pdf"));
	  
	            // chemin du  fichier image 
	            System.out.print(text); 
	        } 
	        catch (TesseractException e) { 
	            e.printStackTrace(); 
	        } 
	    } 
	
}
