package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ユーザーのDAO
 * @author 中川伶丞
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

	/**
	 * uidによる予約の検索
	 * @return 予約情報のリスト
	 */
	public User findByUid(int uid) {
		User u = null;

		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "SELECT * FROM m_user WHERE uid = ?";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, uid);

			ResultSet rs = stmt.executeQuery();

			if(rs.next()) {
				String uname = rs.getString("uname");
				String password = rs.getString("password");

				u = new User(uid, uname, password);


			}
			stmt.close();

		} catch (SQLException e) {
			System.out.println("findByUidエラー：" + e.getMessage());
		}
		return u;
	}
}
