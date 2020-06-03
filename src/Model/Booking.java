package Model;

import java.sql.Timestamp;

/**
 * 予約の構成
 * @author edu11
 *
 */
public class Booking {

	/**
	 * 予約ID
	 */
	private int bid;

	/**
	 * ペットID
	 */
	private int pid;

	/**
	 * ユーザーID
	 */
	private int uid;

	/**
	 * 予約した日時
	 */
	private Timestamp bookingDate;

	/**
	 * ユーザーの電話番号
	 */
	private String telNum;


	/**
	 * 予約IDのgetter
	 * @return 予約ID
	 */
	public int getBid() {
		return bid;
	}

	/**
	 * 予約IDのsetter
	 * @param bid 予約ID
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}

	/**
	 * ペットIDのgetter
	 * @return ペットID
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * ペットIDのsetter
	 * @param pid ペットID
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * ユーザーIDのgetter
	 * @return ユーザーID
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * ユーザーIDのsetter
	 * @param uid ユーザーID
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}

	/**
	 * 予約した日時のgetter
	 * @return 予約した日時
	 */
	public Timestamp getBookingDate() {
		return bookingDate;
	}

	/**
	 * 予約した日時のsetter
	 * @param bookingDate 予約した日時
	 */
	public void setBookingDate(Timestamp bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * ユーザーの電話番号のgetter
	 * @return ユーザーの電話番号
	 */
	public String getTelNum() {
		return telNum;
	}

	/**
	 * ユーザーの電話番号のsetter
	 * @param telNum ユーザーの電話番号
	 */
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}


	/**
	 *コンストラクター
	 * @param bid 予約ID
	 * @param pid ペットID
	 * @param uid ユーザーID
	 * @param bookingDate 予約した日時
	 * @param telNum ユーザーの電話番号
	 */
	public Booking(int bid, int pid, int uid,  Timestamp bookingDate, String telNum) {
		super();
		this.bid = bid;
		this.pid = pid;
		this.uid = uid;
		this.bookingDate = bookingDate;
		this.telNum = telNum;
	}



}
