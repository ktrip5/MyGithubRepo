package com.practice.xml.parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ReadXMLwithTags {

	public static void main(String[] args) {

		Set<String> hahSet = new HashSet<>();
		File folder = new File("C:\\Users\\ktripathi\\eclipse-workspace\\Java8Features\\Input");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			if (file.isFile()) {

				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

				try {

					dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
					DocumentBuilder db = dbf.newDocumentBuilder();
					Document doc = db.parse(new File(file.getPath()));
					doc.getDocumentElement().normalize();

					NodeList list = doc.getElementsByTagName("product");

					for (int temp = 0; temp < list.getLength(); temp++) {

						Node node = list.item(temp);

						if (node.getNodeType() == Node.ELEMENT_NODE) {

							Element element = (Element) node;

							String id = element.getAttribute("sku");
							hahSet.add(id);

						}
					}

				} catch (ParserConfigurationException | SAXException | IOException e) {
					e.printStackTrace();
				}
			}

		}
		ReadXMLwithTags.writing(hahSet);
	}

	public static void writing(Set<String> set) {
		try {
			// Whatever the file path is.
			File statText = new File("C:\\Users\\ktripathi\\eclipse-workspace\\Java8Features\\Output\\UATSKU.txt");
			FileOutputStream is = new FileOutputStream(statText);
			OutputStreamWriter osw = new OutputStreamWriter(is);
			Writer w = new BufferedWriter(osw);
			Iterator<String> itr = set.iterator();
			while (itr.hasNext()) {
				w.write(itr.next() + "\r\n");

			}

			w.close();
		} catch (IOException e) {
			System.err.println("Problem writing to the file UATSKU.txt");
		}
	}

}
