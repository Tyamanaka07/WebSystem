package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * 予約のDAO
 * @author edu11
 *
 */
public class BookingDAO {

	static final String URL = "jdbc:mysql://localhost/club?useSSL=false";
	static final String USER = "Java";
	static final String PASS = "pass";


	/**
	 * 予約の全検索
	 * @return 予約情報のリスト
	 */
	public ArrayList<Booking> findAll() {
		ArrayList<Booking> list = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "SELECT * FROM booking";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int bid = rs.getInt("bid");
				int pid = rs.getInt("pid");
				int tid = rs.getInt("tid");
				int uid = rs.getInt("uid");
				Timestamp bookingDate = rs.getTimestamp("bookingDate");
				String telNum = rs.getString("telNum");

				Booking b = new Booking(bid, pid, tid, uid, bookingDate, telNum);
				list.add(b);

			}
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("findAllエラー：" + e.getMessage());
		}
		return list;
	}

	/**
	 * uidによる予約の検索
	 * @return 予約情報
	 */
	public Booking findByUid(int uid) {
		Booking b = null;

		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "SElECT * FROM booking WHERE uid = ?";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, uid);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				String name = rs.getString("name");
				String adr = rs.getString("adr");

				m = new Booking(mid, name, adr);

			}
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("findAllエラー：" + e.getMessage());
		}
		return m;
	}

	/**
	 * 予約情報の追加
	 */
	public void insert(Booking b) {
		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "INSERT into Booking (name, adr) values(?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, m.getName());
			stmt.setString(2, m.getAdr());

			stmt.executeUpdate();

			stmt.close();

		} catch (SQLException e) {
			System.out.println("insertエラー：" + e.getMessage());
		}
	}

	/**
	 * 予約情報の削除
	 */
	public void delete(int uid ,int bid) {
		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "DELETE FROM booking WHERE mid=?";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, mid);

			stmt.executeUpdate();

			stmt.close();

		} catch (SQLException e) {
			System.out.println("updateエラー：" + e.getMessage());
		}
	}
}
