package in.ineuron.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.ineuron.dto.Student;
import in.ineuron.util.JdbcUtil;

//Persistence logic using JDBC API
public class StudentDaoImpl implements IStudentDao {

	Connection connection = null;
	PreparedStatement pstmt = null;

	@Override
	public String addStudent(String sname, Integer sage, String saddress) {

		String sqlInsertQuery = "insert into student(`name`,`age`,`address`)values(?,?,?)";
		try {
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);

			if (pstmt != null) {

				pstmt.setString(1, sname);
				pstmt.setInt(2, sage);
				pstmt.setString(3, saddress);

				int rowAffected = pstmt.executeUpdate();
				if (rowAffected == 1) {
					return "success";
				}
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

		return "failure";
	}

	@Override
	public Student searchStudent(Integer sid) {
		return null;
	}

	@Override
	public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
		return null;
	}

	@Override
	public String deleteStudent(Integer sid) {
		return null;
	}

}
