package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// loading the driver
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the department");
		String dept = sc.next();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, "sys as sysdba", "sapient123");
		String sql = "select * from employees where emp_dept=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, dept);
		ResultSet rs = st.executeQuery();
		// iterating the resultset
		while (rs.next()) {
			System.out.println("id =" + rs.getInt("emp_id"));
			System.out.println("name=" + rs.getString("emp_name"));
			System.out.println("salary=" + rs.getDouble("emp_sal"));
			System.out.println("dept. name=" + rs.getString("emp_dept"));
			System.out.println("doj=" + rs.getDate("emp_doj"));
		}
	}

}
