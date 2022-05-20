package properties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class PropertyReader {
	public static void main(String[] args) throws Exception {
		String en = "files/All_Localization_new_en-US.properties";
		String fr = "files/All_Localization_new_fr-FR.properties";
		String de = "files/All_Localization_new_de-DE.properties";
		
		Properties enp = new Properties();
		enp.load(new FileReader(new File(en)));
		
		Properties frp = new Properties();
		frp.load(new FileReader(new File(fr)));
		
		Properties dep = new Properties();
		dep.load(new FileReader(new File(de)));
		
//		// Creating Workbook instances
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Localization");

        // keys 
		int rowNum = 0;
        for(Object key :enp.keySet())
        {
        	int colNum = 0;
        	Row row = sheet.createRow(rowNum++);
        	// create columns
        	Cell cell = row.createCell(colNum++);
        	cell.setCellValue((String)key);
        	// en
        	cell = row.createCell(colNum++);
        	cell.setCellValue(LanguageTest.getTextString((String)key, enp));
        	// fr
        	cell = row.createCell(colNum++);
        	cell.setCellValue(LanguageTest.getTextString((String)key, frp));
        	// de
        	cell = row.createCell(colNum++);
        	cell.setCellValue(LanguageTest.getTextString((String)key, dep));
        	
        	System.out.println(key);
        }
        
        try {
            // this Writes the workbook gfgcontribute
            FileOutputStream out = new FileOutputStream(new File("localization.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("localization written successfully on disk.");
            workbook.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Total Count = " + rowNum);
	}
	
	
}
