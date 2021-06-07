public class Extract_de recuperation_{
public static void extractFromPdf(String pdfPath, String fichierMensuel, boolean JSONOrXML, String date,
			String dateExt, JLabel pb, JButton owner) throws Exception {
		PDDocument document = null;
		try {
			document = PDDocument.load(new File(pdfPath));
			StringBuilder out = new StringBuilder();
			String text;
			ITesseract _tesseract = new Tesseract();
			_tesseract.setLanguage("fra");
			_tesseract.setDatapath(Config.workspace + File.separator + "appconf" + File.separator + "tessdata");
			File dir = new File(new File(pdfPath).getParent());
			File[] filesTemp = dir.listFiles();
			File[] files = new File[filesTemp.length];
			for (int i = 0; i < filesTemp.length; i++) {
				if (filesTemp[i].getAbsolutePath().endsWith(".png"))
					files[i] = filesTemp[i];
			}
			for (int page = 0; page < document.getNumberOfPages(); page++) {

				String result = _tesseract.doOCR(ImageIO.read(files[page]));

				out.append(result);

			}
			text = out.toString().substring(out.toString().indexOf("COMMUNIQUE")).trim();
			if (JSONOrXML == false) {

				appendXML(new Filtrage(text).getXML(date, dateExt, pdfPath), fichierMensuel);
			} else {
				appendJSON(new Filtrage(text).getJSON(date, dateExt, pdfPath), fichierMensuel);
			}

		} catch (FileNotFoundException e) {
			pb.setBounds(24, 220, 0, 0);
			JOptionPane.showMessageDialog(owner, "Le fichier n'est pas telecharger localement");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(owner, "Erreur d'extraction");
		} finally {
			document.close();
		}
	}
}