package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ユーザーのDAO
 * @author edu11
 *
 */
public class UserDAO {

	static final String URL = "jdbc:mysql://localhost/pet_sysdb?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";


	/**
	 * ユーザー名とパスワードによるユーザーのログイン
	 * @return ユーザー
	 */
	public User login(String uname, String password) {
		User u = null;

		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "SELECT * FROM pet_sysdb.m_user WHERE uname=? and password=?;";


			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, uname);
			stmt.setString(2, password);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				int uid = rs.getInt("uid");
				u = new User(uid, uname, password);

			}
			stmt.close();

		} catch (SQLException e) {
			System.out.println("loginエラー：" + e.getMessage());
		}
		return u;

	}
}
