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
	 * 種類ID
	 */
	private int tid;

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
	 * 予約したペット
	 */
	private Pet pet;


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
	 * ペットIDのgetter
	 * @return ペットID
	 */
	public int getTid() {
		return tid;
	}

	/**
	 * ペットIDのsetter
	 * @param pid ペットID
	 */
	public void setTid(int tid) {
		this.tid = tid;
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
	 * ペットのgetter
	 * @return ペット
	 */
	public Pet getPet() {
		return pet;
	}

	/**
	 * ペットのsetter
	 * @return ペット
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}


	/**
	 *コンストラクター
	 * @param bid 予約ID
	 * @param pid ペットID
	 * @param tid 種類ID
	 * @param uid ユーザーID
	 * @param bookingDate 予約した日時
	 * @param telNum ユーザーの電話番号
	 */
	public Booking(int bid, int pid, int tid, int uid,  Timestamp bookingDate, String telNum) {
		super();
		this.bid = bid;
		this.pid = pid;
		this.tid = tid;
		this.uid = uid;
		this.bookingDate = bookingDate;
		this.telNum = telNum;
	}



}
