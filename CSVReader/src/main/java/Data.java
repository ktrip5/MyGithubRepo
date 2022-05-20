import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

	private final List<String> headers;
	private final List<Map<String,String>> data;
	
	public Data(String... headers) {
		this.headers = Arrays.asList(headers);
		this.data = new ArrayList<>();
	}

	public List<String> getHeaders() {
		return headers;
	}
	
	public void addRow(String... data) throws Exception
	{
		Map<String,String> dataMap = new HashMap<>();
		if(data.length != this.headers.size())
		{
			throw new Exception("Size of data array should be same to headers: header size = " + this.headers.size());
		}
		for(int i = 0; i<data.length ; i++)
		{
			dataMap.put(this.headers.get(0), data[0]);
		}
		this.data.add(dataMap);
	}

	public List<Map<String, String>> getData() {
		return data;
	}
}
