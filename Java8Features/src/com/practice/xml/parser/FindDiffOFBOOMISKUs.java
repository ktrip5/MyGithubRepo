package com.practice.xml.parser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FindDiffOFBOOMISKUs {

	public static void main(String[] args) throws IOException {
		File file1 = new File("C:\\Users\\ktripathi\\eclipse-workspace\\Java8Features\\Output\\BOOMISKU.txt");
		File file2 = new File("C:\\Users\\ktripathi\\eclipse-workspace\\Java8Features\\Output\\UATSKU.txt");

		Set<String> hSetBoomiSKUs = new TreeSet<String>();
		Set<String> hSetUATSKUs = new TreeSet<String>();
		String SKU = null;

		try {
			BufferedReader br1 = new BufferedReader(new FileReader(file1));
			BufferedReader br2 = new BufferedReader(new FileReader(file2));
			try {
				while ((SKU = br1.readLine()) != null) {
					hSetBoomiSKUs.add(SKU);
				}
				while ((SKU = br2.readLine()) != null) {
					hSetUATSKUs.add(SKU);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				br1.close();
				br2.close();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		findSKUInBOOMINotInISH(hSetBoomiSKUs, hSetUATSKUs, "BOOMISKUsNOTInISH.txt");
	}

	private static void findSKUInBOOMINotInISH(Set<String> hSetBoomiSKUs, Set<String> hSetUATSKUs, String fileName) {
		Set<String> copyOfhSetBoomiSKUs = new TreeSet<>();
		copyOfhSetBoomiSKUs = hSetBoomiSKUs;
		copyOfhSetBoomiSKUs.removeAll(hSetUATSKUs);
		Set<String> diffInBOOMISKUs = new TreeSet<String>();
		boolean flag = false;

		for (String boomiSKU : copyOfhSetBoomiSKUs) {
			for (String uatSKU : hSetUATSKUs) {
				if (boomiSKU.equals(uatSKU)) {
					flag = true;
					break;
				}
			}
			if (!flag)
				diffInBOOMISKUs.add(boomiSKU);
		}
		writing(diffInBOOMISKUs, fileName);

	}

	public static void writing(Set<String> set, String fileName) {
		try {
			File statText = new File("C:\\Users\\ktripathi\\eclipse-workspace\\Java8Features\\Output\\" + fileName);
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
