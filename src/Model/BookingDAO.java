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
 * @author 中川伶丞
 *
 */
public class BookingDAO {

	static final String URL = "jdbc:mysql://localhost/pet_sysdb?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";


	/**
	 * 予約の全検索
	 * @return 予約情報のリスト
	 */
	public ArrayList<Booking> findAll() {
		ArrayList<Booking> list = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "SELECT * FROM m_booking";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int bid = rs.getInt("bid");
				int pid = rs.getInt("pid");
				String tname = rs.getString("tname");
				int uid = rs.getInt("uid");
				String uname = rs.getString("uname");
				Timestamp bookingDate = rs.getTimestamp("bookingDate");
				String telNum = rs.getString("telNum");
				String f_path = rs.getString("f_path");

				Booking b = new Booking(bid, pid, tname, uid, uname, bookingDate, telNum, f_path);
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
	 * 予約IDによる予約の検索
	 * @return 予約情報
	 */
	public Booking findByBid(int bid) {
		Booking b = null;

		try (Connection con = DriverManager.getConnection(URL, USER, PASS);) {

			String sql = "SELECT * FROM m_booking WHERE bid = ?";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, bid);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {

				int pid = rs.getInt("pid");
				String tname = rs.getString("tname");
				int uid = rs.getInt("uid");
				String uname = rs.getString("uname");
				Timestamp bookingDate = rs.getTimestamp("bookingDate");
				String telNum = rs.getString("telNum");
				String f_path = rs.getString("f_path");

				b =  new Booking(bid, pid, tname, uid, uname, bookingDate, telNum, f_path);

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

			String sql = "INSERT into m_booking (pid, tname, uid, uname,bookingDate, telNum, f_path) values(?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, b.getPet().getPid());
			stmt.setString(2, b.getType().getTname());
			stmt.setInt(3, b.getUser().getUid());
			stmt.setString(4, b.getUser().getUname());
			stmt.setTimestamp(5, b.getBookingDate());
			stmt.setString(6, b.getTelNum());
			stmt.setString(7, b.getPet().getF_path());

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

			String sql = "UPDATE m_booking SET bookingDate=? WHERE (bid=?)";
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

			String sql = "DELETE FROM m_booking WHERE bid=?";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, bid);

			stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("updateエラー：" + e.getMessage());
		}
	}
}
