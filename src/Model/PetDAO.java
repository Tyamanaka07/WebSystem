package Model;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nakagawa
 */
public class PetDAO {
	static final String URL =  "jdbc:mysql://localhost/m_pet?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";


	/**
	 * データベース内のデータを取得する
	 * @return ArrayList<Pet>型の変数を返す
	 */
	public ArrayList<Pet> findAll(){
		ArrayList<Pet> plist = new ArrayList<Pet>();
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){


			String sql = "SELECT * FROM m_pet;";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				int pid = rs.getInt("pid");
				int tid = rs.getInt("tid");
				Date birthDate = rs.getDate("birthDate");
				String sex = rs.getString("sex");
				int price = rs.getInt("price");
				String description = rs.getString("description");


				Pet p = new Pet(pid, tid, birthDate, sex, price, description);
				plist.add(p);
			}

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("findAllエラー：" + e.getMessage());
		}
		return plist;
	}


	/**
	 * データベース内のデータを取得する
	 * @return ArrayList<Pet>型の変数を返す
	 */
<<<<<<< HEAD
	public ArrayList<Pet> findByTid() {
=======
	public Pet findByTid(int tid) {
		Pet p = null;
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){
>>>>>>> branch 'master' of https://github.com/Tyamanaka07/WebSystem.git


			String sql = "SELECT * FROM m_pet WHERE tid = ?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, tid);

			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				int pid = rs.getInt("pid");
				Date birthDate = rs.getDate("birthDate");
				String sex = rs.getString("sex");
				int price = rs.getInt("price");
				String description = rs.getString("description");


				p = new Pet(pid, tid, birthDate, sex, price, description);
			}

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("findBySid：" + e.getMessage());
		}
		return p;
	}

	/**
	 * ペット別のデータを取得する
	 * @return Pet型の変数を返す
	 */
	public Pet findByPid(int pid) {
		Pet p = null;
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){


			String sql = "SELECT * FROM m_pet WHERE pid = ?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, pid);

			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				int tid = rs.getInt("tid");
				Date birthDate = rs.getDate("birthDate");
				String sex = rs.getString("sex");
				int price = rs.getInt("price");
				String description = rs.getString("description");


				p = new Pet(pid, tid, birthDate, sex, price, description);
			}

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("findBySid：" + e.getMessage());
		}
		return p;
	}

	/**
	 * 新しいペットの情報の追加を行う
	 */
	public void insert(Pet p) {
		try {
			Connection con = DriverManager.getConnection (URL,USER,PASS);

			String sql = "INSERT INTO m_pet (birthDate,sex,price,description) VALUES(?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setDate(1,p.getBirthDate());
			stmt.setString(2,p.getSex());
			stmt.setInt(3,p.getPrice());
			stmt.setString(4,p.getDescription());

			stmt.executeUpdate();

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("insertエラー：" + e.getMessage());
		}
	}

	/**
	 * 既存のペットの情報の更新を行う
	 */
	public void update(Pet p) {
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){

			String sql = "UPDATE m_pet SET birthDate = ? ,sex = ? ,price = ? ,description = ? WHERE pid = ?;";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setDate(1, p.getBirthDate());
			stmt.setString(2, p.getSex());
			stmt.setInt(3, p.getPrice());
			stmt.setString(4, p.getDescription());
			stmt.setInt(5, p.getPid());


			stmt.executeUpdate();

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("updateエラー：" + e.getMessage());
		}
	}

	/**
	 * 既存のペットの情報の削除を行う
	 */
	public void delete(int pid) {
		try (Connection con = DriverManager.getConnection (URL,USER,PASS);){

			String sql = "DELETE FROM m_pet WHERE pid = ?;";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, pid);

			stmt.executeUpdate();

			stmt.close();

		}
		catch(SQLException e) {
			System.out.println("updateエラー：" + e.getMessage());
		}
	}
}
