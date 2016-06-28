package com.sapient.client;

import com.sapient.beans.Mtable;

public class MtableClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mtable tbl = new Mtable();
		try {
			tbl.setNum(5);
			tbl.display(3,9);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
