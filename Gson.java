import com.google.gson.Gson;
import java.util.*;

public class Gson {
	public static void main(String [] args) {
		List<tabText> list = new ArrayList<tabText>();
		
		
		System.out.println("Text :"+list);
		Gson gson = new Gson();
		String json = gson.toJson(list); //je veux la liste en json
		System.out.println("Json :"+json);
		
	}

}
/*import java.io.File;

public class CreateJSONFile {
	public static void appendJSON(String data, String file) {
		String texte = null;
		try {
			File jsonFile = new File(file);
			if (!jsonFile.exists()) {
				jsonFile.createNewFile();
				texte = "{" + "\"data\"" + ":" + "[" + data + "]" + "}";
				System.out.println(texte);
			}
			 else {
				texte = texte.substring(texte.indexOf("[") + "[".length(), texte.lastIndexOf("]"));
				texte = "{" + "\"data\"" + ":" + "[" + texte + "," + data + "]" + "}";
		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String data = "DateExtraction 2021-05-02 17:01:06  NbTest 183457  NbCascontacts 292415 NbCasCommunautaires 189 NbGuéris 135  NbDécés 0  region  kedougou  115 region  Mbour  214 region  Fatick  22";
		String file = "C:/Users/dell/Desktop/Extraction/test.json";
		appendJSON(data,file); 

		
	}

}
*/
