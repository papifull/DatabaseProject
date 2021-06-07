package sgbd;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class Telecharger {

	

	
	
	public static void telecharger() {
		Elements dts = null;
		Elements links = null;
		try{

			Document doc;
			doc = Jsoup.connect(
					"https://sante.sec.gouv.sn/Pr%C3%A9sentation/coronavirus-informations-officielles-et-quotidiennes-du-msas/")
					.userAgent("Mozilla/5.0").timeout(10000000).get();
			links = doc.select("a[href^=http://www.sante.gouv.sn/sites/default/c]").select("a[href$=.pdf]");
			dts = doc.select("u span strong");

		}catch(Exception e)
		{

		}

		for(int i = 0; i < dts.size(); i++) {
			System.err.println("Date: " + dts.get(i)+ " <---> " + "Lien: " + links);
		}
		
	
	}

	
	
	public static void main(String[] args) {
		telecharger() ;
	}

}
