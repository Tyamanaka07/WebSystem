package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

	/**
	 * 種類のDAO
	 * @author edu06
	 *
	 */
public class TypeDAO {
	static final String URL =  "jdbc:mysql://localhost/pet_sysdb?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";

	/**
	 * 種類の全検索
	 * @return ペット種類のリスト
	 */
	public ArrayList<Type> findAll() {
		ArrayList<Type> tlist = new ArrayList<Type>();
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){


			String sql = "SELECT * FROM m_pet;";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				int tid = rs.getInt("tid");
				String tname = rs.getString("tname");


				Type t = new Type(tid, tname);
				tlist.add(t);
			}

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("findAllエラー：" + e.getMessage());
		}
		return tlist;
	}

	/**
	 * tidによる種類の検索
	 * @return 種類情報
	 */

	public Type findByTid(int tid) {
		Type t = null;
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){


			String sql = "SELECT * FROM m_type WHERE tid = ?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, tid);

			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				String tname = rs.getString("tname");


				t = new Type(tid,tname);
			}

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("findByTid：" + e.getMessage());
		}
		return t;
	}

	/**
	 * ペット種類の追加
	 */
	public void insert(Type t) {

	}

	/**
	 * ペット種類の削除
	 */
	public void delete(int tid) {

	}
}
