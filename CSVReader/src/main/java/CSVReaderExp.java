import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CSVReaderExp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Start");
		String csv = "organization.csv";
		
		try {
			Data data = null;
			CSVReader reader = new CSVReader(new FileReader(csv));
			List<String[]> r = reader.readAll();
			for(int i = 0;i<r.size();i++)
			{
				if(i == 0)
				{
					data = new Data(r.get(i));
					continue;
				}
				data.addRow(r.get(i));
			}
            
		} catch (IOException | CsvException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void readData()
	{
		
	}
}
