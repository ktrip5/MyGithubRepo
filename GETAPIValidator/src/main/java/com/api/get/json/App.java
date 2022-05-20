package com.api.get.json;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {
	public static void main(String[] args) {

		Map<String, String> hMap = new HashMap<String, String>();
		HttpResponse response = null;
		HttpClient client = HttpClientBuilder.create().build();
		String apiURI = "https://countriesnow.space/api/v0.1/countries/capital";

		HttpGet get = new HttpGet(apiURI);
		try {
			response = client.execute(get);
			String JSONstr = EntityUtils.toString(response.getEntity(), "UTF-8");
			JSONObject object = null;
			try {
				object = (JSONObject) new JSONParser().parse(JSONstr);
			} catch (ParseException e) {

				e.printStackTrace();
			}
			JSONArray dataArray = (JSONArray) object.get("discount");

			for (int i = 0; i < dataArray.size(); i++) {
				JSONObject jObject = (JSONObject) dataArray.get(i);

				String country = (String) jObject.get("name");
				String capital = (String) jObject.get("capital");
				hMap.put(country, capital);
				System.out.println("Country is -> "+ country + " and capital is -> "+ capital);

			}

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
