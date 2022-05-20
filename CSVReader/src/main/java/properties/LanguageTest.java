package properties;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.apache.commons.text.StringEscapeUtils;

public class LanguageTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String s = "Adresses trouv\\u00E9es\\u00A0\\:";

		System.out.println(s);

		System.out.println(StringEscapeUtils.unescapeJava(s));
	}

	public static String getTextString(String key, Properties prop) {
		String text = prop.getProperty(key);
		if(null != text)
		{
			text = StringEscapeUtils.unescapeJava(text);
		}
		return text;
	}

}
