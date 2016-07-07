package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.sapient.exceptions.IdExcepetion;
import com.sapient.exceptions.NotFoundException;
import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

/**
 * This method contains methods interacts with DB and performs CRUD operations
 * 
 * @author ktrip5
 * @version 1.0
 */
public class EmpDaoImpl extends AbstractEmpDao implements Idao {

	/**
	 * this method adds employee
	 * @param Emp -pass emp instances
	 * @return int - returns 1 if added
	 * @throws throws IDexceptions if employee ID already exist
	 */
	@Override
	public int addEmployee(Emp emp) throws IdExcepetion {
			Connection con=getCon();
			try{
			PreparedStatement st=con.prepareStatement(Queries.addemp);
			st.setInt(1, emp.getEmpID());
			st.setString(2,emp.getEmpName() );
			st.setDouble(3, emp.getEmpsal());
			st.setString(4, emp.getDept());
			
			/*converting util date to sql date*/
			
			st.setDate(5, new java.sql.Date(emp.getDoj().getTime()));
			EmpUtil.viewLogger().trace("binded parameters to query");
			int row=st.executeUpdate();
			EmpUtil.viewLogger().debug(row +"row added");
			return row;
			
		}
		catch (SQLException e){
			EmpUtil.viewLogger().error(e.getMessage());
			throw new IdExcepetion("employee id already exist");
			
		}
		finally {
			closeCon(con);
			
		}

	}
	/**
	 * This method updates the sal;aryfor the given employee ID
	 * @param eid-Employee ID
	 * @param sal-employee slary
	 * @return returns 1 if updates
	 * @throws throws NOTFoundEcpetion if no row found
	 */

	@Override
	public int updateEmployee(int eid, double sal) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * this methiod removes an employee for the given employee ID
	 * @param eid-employee ID
	 * @return int  - returns 1 if removed
	 * @return returms IDEception if id is not found
	 * \
	 */
	@Override
	public int removeEmployee(int eid) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * This method view all employees 
	 * @return List<Emp> -returns list of Emp instances
	 * @throws throws NOTFoundEception if no row found
	 * @see viewEmployee(int), viewEmployee(String)
	 */

	@Override
	public List<Emp> viewEmployee() throws NotFoundException {
		List<Emp> elist = new ArrayList<Emp>();
		Connection con = getCon();
		Emp emp = null;
		try {
			PreparedStatement st = con.prepareStatement(Queries.viewAll);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				EmpUtil.viewLogger().trace("row found");
				emp = new Emp();
				emp.setEmpID(rs.getInt("emp_id"));
				emp.setEmpName(rs.getString("emp_name"));
				emp.setEmpsal(rs.getDouble("emp_sal"));
				emp.setDept(rs.getString("emp_dept"));
				emp.setDoj(rs.getDate("emp_doj"));
				elist.add(emp);
			}
			EmpUtil.viewLogger().debug("size" + elist.size());
		} catch (SQLException e) {
			EmpUtil.viewLogger().error(e.getMessage());
		}
		finally {
			closeCon(con);
		}

		return elist;
	}

	/**
	 * This method view all employees for  the given id
	 * @param eid- employee id
	 * @return Emp -returns list of Emp instances
	 * @throws throws NOTFoundEception if no row found
	 * @see viewEmployee(int), viewEmployee(String)
	 */
	@Override
	public Emp viewEmployee(int eid) throws NotFoundException {
		Emp emp=null;
		Connection con=getCon();
		PreparedStatement st;
		try {
			st = con.prepareStatement(Queries.viewbyid);
			st.setInt(1, eid);
			ResultSet rs = st.executeQuery();
		while(rs.next())
		{
			EmpUtil.viewLogger().trace("row found");
			emp=new Emp();
			emp.setEmpID(rs.getInt("emp_id"));
			emp.setEmpName(rs.getString("emp_name"));
			emp.setEmpsal(rs.getDouble("emp_sal"));
			emp.setDept(rs.getString("emp_dept"));
			emp.setDoj(rs.getDate("emp_doj"));
		}
	}
		catch (SQLException e) {
			EmpUtil.viewLogger().error(e.getMessage());
		}
		if(emp==null)
			throw new NotFoundException("no row found");
		EmpUtil.viewLogger().debug("row Found");
		return  emp;
	}
	/**
	 * This method view all employees for  the givendepartment
	 * @param dept- department name
	 * @return List<Emp> - returns list of Emp instances
	 * @throws throws NOTFoundEception if no row found
	 * @see viewEmployee(int), viewEmployee(String)
	 */

	@Override
	public List<Emp> viewEmployee(String dept) throws NotFoundException {
		List<Emp> elist = new ArrayList<Emp>();
		Connection con = getCon();
		Emp emp = null;
		try {
			PreparedStatement st = con.prepareStatement(Queries.viewbydept);
			st.setString(1, dept);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				EmpUtil.viewLogger().trace("row found");
				emp = new Emp();
				emp.setEmpID(rs.getInt("emp_id"));
				emp.setEmpName(rs.getString("emp_name"));
				emp.setEmpsal(rs.getDouble("emp_sal"));
				emp.setDept(rs.getString("emp_dept"));
				emp.setDoj(rs.getDate("emp_doj"));
				elist.add(emp);
			}
			EmpUtil.viewLogger().debug("size" + elist.size());
		} catch (SQLException e) {
			EmpUtil.viewLogger().error(e.getMessage());
		}
		finally {
			closeCon(con);
		}

		return elist;
	}

}
