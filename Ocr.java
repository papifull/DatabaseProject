import java.io.File;

import net.sourceforge.tess4j.Tesseract; 
import net.sourceforge.tess4j.TesseractException; 

public class Ocr {

	
	    public Ocr() {}
	    
		//public void  RecupOcr(String File) 
		
	    		public static void main(String[] args) {
			 
		        try { 
		        	Tesseract tesseract = new Tesseract();
		        	//String text1; 
		            tesseract.setDatapath("C:\\Users\\HP\\Desktop\\prog-eclipse\\Tess4J\\tessdata"); 
		            
		            tesseract.setLanguage("eng");
		            // chemin du dossier de données tess
		            // a l'interieur du fichier extrait
		            String text1 
		                = tesseract.doOCR(new File("C:\\Users\\HP\\Desktop\\prog-eclipse\\Tess4J\\COMMUNIQUE.pdf")); 
		  
		            //chemin du  fichier pdf
		            System.out.print(text1); 
		            //String[] tabText = text1.split(" ");
		            //System.out.println(tabText[46]);
		          /*  int i = 0;
		         for(String tab : tabText) {
		            	System.out.println(i+" "+ tab);
		            	i++;
		            */
		        } 
		        catch (TesseractException e) { 
		            e.printStackTrace(); 
		        }
		        
				//return text1;
		        }
		// declarer tableau de string 
		//String[] tabtext= text1.split(" ");
		// on utilise le text qu'on converti en tableau par upload(split) text.split 
		
		
}






//System.out.println(nombremots_naive(chaine));
