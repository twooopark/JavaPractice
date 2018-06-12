package jdbc;

import java.sql.*;

public class ConnectionTest {
	public static void main(String[] args) {
		try {
			// 초기화
			Connection conn = null;
			Statement stmt = null;
			ResultSet rs = null;
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			// 2. Connection 얻기
			conn = DriverManager.getConnection(dbUrl, "bituser", "bituser");
//			// 3. Statement 생성
//			stmt = conn.createStatement();
//			// 4. SQL 준비
//			String sql = "SELECT e.department_id, d.department_name, e.first_name "+
//						"FROM hr.departments d, hr.employees e "+
//						"WHERE d.department_id = e.department_id";
//			rs = stmt.executeQuery(sql);

//			// 3. SQL 준비
			String sql = "UPDATE hr.new_emp SET first_name=? " +
						"WHERE employee_id=?";

//			// 4. PreparedStatement 준비
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "StevenTest");
			pstmt.setInt(2,100);
			
			
			// 5. 업데이트 결과 수신 및 처리
			rs = pstmt.executeQuery();
			System.out.println(pstmt.executeUpdate());
//			while (rs.next())
//				System.out.println(rs.getInt(1) +" |\t"+ rs.getString(2) +" |\t"+ rs.getString(3));

			// Close
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
			if(conn != null)
				conn.close();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
		}
	}
}
