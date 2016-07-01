package com.sapient.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Demo4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "sys as sysdba", "sapient123");
		//the callable statement maintains the memory of output parameters in registers
		CallableStatement st = con.prepareCall("{call(?,?,?,?)}");
		st.setInt(1, 1002);
		st.registerOutParameter(2, Types.NUMERIC);
		st.registerOutParameter(2, Types.VARCHAR);
		st.registerOutParameter(3, Types.VARCHAR);
		st.execute();
		//
		System.out.println(st.getDouble(2));
		System.out.println(st.getString(3));
		System.out.println(st.getString(4));
		con.close();
	}

}
