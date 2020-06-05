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
				int uid = rs.getInt("uid");
				Timestamp bookingDate = rs.getTimestamp("bookingDate");
				String telNum = rs.getString("telNum");

				Booking b = new Booking(bid, pid, uid, bookingDate, telNum);
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
				int bid = rs.getInt("bid");
				int pid = rs.getInt("pid");
				Timestamp bookingDate = rs.getTimestamp("bookingDate");
				String telNum = rs.getString("telNum");

				b = new Booking(bid, pid, uid, bookingDate, telNum);

			}
			rs.close();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("findAllエラー：" + e.getMessage());
		}
		return b;
	}

	/**
	 * 予約情報の追加
	 * @param b 予約クラス
	 */
	public void insert(Booking b) {
		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "INSERT into booking (pid, uid, bookingDate, telNum) values(?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, b.getPid());
			stmt.setInt(2, b.getUid());
			stmt.setTimestamp(3, b.getBookingDate());
			stmt.setString(4, b.getTelNum());

			stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("insertエラー：" + e.getMessage());
		}
	}

	/**
	 *予約の変更
	 * @param b 予約クラス
	 */
	public static void update(Booking b) {
		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "UPDATE booking SET bookingDate=? WHERE (bid=?)";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setTimestamp(1, b.getBookingDate());
			stmt.setInt(2, b.getBid());

			stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("updateエラー：" + e.getMessage());
		}
	}

	/**
	 * 予約情報の削除
	 */
	public void delete(int bid) {
		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "DELETE FROM booking WHERE bid=?";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, bid);

			stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("updateエラー：" + e.getMessage());
		}
	}
}
