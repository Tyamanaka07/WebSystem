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
	 * 予約したペットの種類
	 */
	private Type type;


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
	 * ペットの種類のgetter
	 * @return ペット
	 */
	public Type getType() {
		return type;
	}

	/**
	 * ペットの種類のsetter
	 * @return ペットの種類
	 */
	public void setType(Type type) {
		this.type = type;
	}


	/**
	 *コンストラクター
	 * @param bid 予約ID
	 * @param uid ユーザーID
	 * @param bookingDate 予約した日時
	 * @param telNum ユーザーの電話番号
	 */
	public Booking(int bid, int uid,  Timestamp bookingDate, String telNum) {
		super();
		this.bid = bid;
		this.uid = uid;
		this.bookingDate = bookingDate;
		this.telNum = telNum;
	}

	/**
	 *コンストラクター
	 * @param bid 予約ID
	 * @param uid ユーザーID
	 * @param bookingDate 予約した日時
	 * @param telNum ユーザーの電話番号
	 * * @param pet 予約したペット
	 * * @param type 予約したペットの種類
	 */
	public Booking(int bid, int uid,  Timestamp bookingDate, String telNum, Pet pet, Type type) {
		super();
		this.bid = bid;
		this.uid = uid;
		this.bookingDate = bookingDate;
		this.telNum = telNum;
		this.pet = pet;
		this.type = type;
	}



}
