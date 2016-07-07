package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sapient.util.EmpUtil;

/**
 * abstract class having methods for getting connection and closing connection
 * 
 * @author ktrip5
 *
 */

public class AbstractEmpDao {

	static {
		String driver = EmpUtil.getBundle().getString("driver");
		EmpUtil.viewLogger().trace(driver);
		try {
			Class.forName(driver);
			EmpUtil.viewLogger().debug("driver loaded ");
		} catch (ClassNotFoundException e) {
			EmpUtil.viewLogger().error(e.getMessage());
		}

	}

	/**
	 * return connection instance based on the dbdetails configured in
	 * properties file
	 * 
	 * @return
	 */

	public Connection getCon() {
		Connection con = null;
		String url = EmpUtil.getBundle().getString("url");
		String uname = EmpUtil.getBundle().getString("uname");
		String pwd = EmpUtil.getBundle().getString("pwd");
		EmpUtil.viewLogger().trace(url + " " + uname + " " + pwd);
		try {
			con = DriverManager.getConnection(url, uname, pwd);
			EmpUtil.viewLogger().debug("db connection established");
		} catch (SQLException e) {
			EmpUtil.viewLogger().error("db connection fails");
			e.printStackTrace();
		}
		return con;

	}

	/**
	 * this method closes the connection 
	 * @param con
	 */

	public void closeCon(Connection con) {
		if (con != null) {
			EmpUtil.viewLogger().trace("connection not null");
		}
		try {
			con.close();
			EmpUtil.viewLogger().debug("db connection closed");
		} catch (SQLException e) {

			EmpUtil.viewLogger().error("db connection fails to close");

		}
		EmpUtil.viewLogger().trace("connection is null");

	}
}
