
import org.jsoup.Jsoup;
        import org.jsoup.nodes.Document;
        import org.jsoup.nodes.Element;
        import org.jsoup.select.Elements;

public class WebScapper {
    private  String jour;
    private  String mois;
    private  String annee;

    public void WebScrape(String jour,String mois,String annee){
        this.jour  = jour;
        this.mois  = mois;
        this.annee = annee;
    }
    /*public static String Scrap() {
        final String url = "https://sante.sec.gouv.sn/Actualites/";
        String jour = "26";
        String mois = "mars";
        String annee = "2021";
        //final String url = "https://sante.sec.gouv.sn/Actualites/coronavirus-communiqu%C3%A9-de-presse-n%C2%B0390-du-vendredi-26-mars-2021-du-minist%C3%A8re-de-la-sant%C3%A9";
        String url2 = "";
        String l = " ";
        try {
            final Document document = Jsoup.connect(url).get();
            Elements articles = document.select("span.field-content");
            // Elements articles  = document.select("span.file");
            for (Element art : articles) {
                String link = art.select("a").attr("href");
                String[] splite = link.split("-");
                /* for (String sp : splite){
                    System.out.println(sp);
                }
                if (jour.equals(splite[7]) && mois.equals(splite[8]) && annee.equals(splite[9])) {
                    url2 = "https://sante.sec.gouv.sn" + link;
                     System.out.println(url2);
                    break;
                } else
                    System.out.println("https");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        try {
            final Document doc = Jsoup.connect(url2).timeout(7000).get();
            Elements lien = doc.select("span.file");
            for (Element liens : lien) {
                 l = liens.select("a").attr("href");
                 //System.out.println(l);
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        return  l;
    }*/
    /*public static  String scrapImg(){

    }*/

    /*public static void main(String[] args) throws IOException {
        final String url = "https://sante.sec.gouv.sn/Actualites/";
        String jour = "26";
        String mois = "mars";
        String annee = "2021";
        //final String url = "https://sante.sec.gouv.sn/Actualites/coronavirus-communiqu%C3%A9-de-presse-n%C2%B0390-du-vendredi-26-mars-2021-du-minist%C3%A8re-de-la-sant%C3%A9";
        String url2="";
        try {
            final Document document = Jsoup.connect(url).get();
             Elements articles = document.select("span.field-content");
           // Elements articles  = document.select("span.file");
            for(Element art : articles){
                // on verifie la date et le numero de communique si ya un
                String  link = art.select("a").attr("href");
                String[] splite  =  link.split("-");
                if(jour.equals(splite[7]) && mois.equals(splite[8]) && annee.equals(splite[9])){
                    url2 = "https://sante.sec.gouv.sn"+link;
                    System.out.println(url2);
                    break;
                }
                else
                    System.out.println("https");
            }
        }
        catch (Exception e){
            System.out.println("error");
        }
        try {
            final Document doc = Jsoup.connect(url2).timeout(6000).get();
            Elements lien  = doc.select("span.file");
            for (Element liens : lien){
                String  l = liens.select("a").attr("href");
                System.out.println(l);
            }
        }
        catch (Exception e){
            System.out.println("error");
        }
    }
     */
    // Test pour rendre plus dope

    public static String Scrap() {
        final String url = "https://sante.sec.gouv.sn/Actualites/";
        String jour  = "26";
        String mois  = "mars";
        String annee = "2021";
        //final String url = "https://sante.sec.gouv.sn/Actualites/coronavirus-communiqu%C3%A9-de-presse-n%C2%B0390-du-vendredi-26-mars-2021-du-minist%C3%A8re-de-la-sant%C3%A9";
        String url2 = "";
        String l = " ";
        try {
            final Document document = Jsoup.connect(url).get();
            Elements articles = document.select("span.field-content");
            // Elements articles  = document.select("span.file");
            for (Element art : articles) {
                String link = art.select("a").attr("href");
                String[] splite = link.split("-");
                /* for (String sp : splite){
                    System.out.println(sp);
                } */
                if (jour.equals(splite[7]) && mois.equals(splite[8]) && annee.equals(splite[9])) {
                    url2 = "https://sante.sec.gouv.sn" + link;
                    System.out.println(url2);
                    break;
                } else
                    System.out.println("https");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        try {
            final Document doc = Jsoup.connect(url2).timeout(7000).get();
            Elements lien = doc.select("span.file");
            for (Element liens : lien) {
                l = liens.select("a").attr("href");
                //System.out.println(l);
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        return  l;
    }
    public static void main(String[] args) {
        WebScapper ws = new WebScapper();

      //  System.out.println(test);
    }
}


