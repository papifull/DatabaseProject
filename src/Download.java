import java.io.*;
import  java.net.HttpURLConnection;
import  java.net.URL;

public class Download {
    public static void download(String link,File out) {
        try {
            URL url= new URL(link);
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            double fileSize = (double)http.getContentLengthLong();
            BufferedInputStream in = new  BufferedInputStream(http.getInputStream());
            FileOutputStream fos = new FileOutputStream(out);
            BufferedOutputStream bout = new BufferedOutputStream(fos,1024);
            byte[] buffer = new byte[1024];
            double downloaded = 0.00;
            int read = 0;
            double percentDownloaded = 0.00;
            while((read = in.read(buffer,0,1024)) >=0){
                bout.write(buffer,0,read);
                downloaded += read ;
                percentDownloaded = (downloaded*100) /fileSize;
                String percent = String.format("%.4f",percentDownloaded);
                System.out.println("Download "+percent+ " % of a file ");
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String link = "https://sante.sec.gouv.sn/sites/default/files/scan%20communique%20388.pdf";
        String[] nomFichier = link.split("/");
        File out = new File("/Users/macbookair/Documents/"+nomFichier[6]);
        Download.download(link,out);
    }

}
