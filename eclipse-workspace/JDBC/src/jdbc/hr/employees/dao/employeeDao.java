package jdbc.hr.employees.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import jdbc.hr.employees.vo.employeeVo;

public class employeeDao implements IemployeeDao{
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dbUrl, "hr", "hr");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	@Override
	public List<employeeVo> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<employeeVo> list = new ArrayList<>();
		
		try {
			conn = this.getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT employee_id, first_name, last_name, salary FROM employees";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Long employeeId = rs.getLong(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				Float salary = rs.getFloat(4);
				
				employeeVo emp = new employeeVo();
				
				emp.setEmployeeId(employeeId);
				emp.setFirstName(firstName);
				emp.setLastName(lastName);
				emp.setSalary(salary);
				
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public List<employeeVo> getListbyName(String keyword) {
		return null;
	}
	

}
