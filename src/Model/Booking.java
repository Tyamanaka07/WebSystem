package Model;

import java.sql.Timestamp;

/**
 * 予約の構成
 * @author 中川伶丞
 *
 */
public class Booking {

	/**
	 * 予約ID
	 */
	private int bid;

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
	 * 予約したペットのユーザー
	 */
	private User user;


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
	 * ユーザーのgetter
	 * @return ユーザー
	 */
	public User getUser() {
		return user;
	}

	/**
	 * ユーザーIDのsetter
	 * @param uid ユーザーID
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 *コンストラクター
	 * @param bid 予約ID
	 * @param bookingDate 予約した日時
	 * @param telNum ユーザーの電話番号
	 */
	public Booking(int bid, Timestamp bookingDate, String telNum) {
		super();
		this.bid = bid;
		this.bookingDate = bookingDate;
		this.telNum = telNum;
	}

	/**
	 *コンストラクター
	 * @param bid 予約ID
	 * @param bookingDate 予約した日時
	 * @param telNum ユーザーの電話番号
	 * @param pet 予約されたペット
	 * @param type 予約されたペットの種類
	 * @param user 予約したユーザー
	 */
	public Booking(int bid, Timestamp bookingDate, String telNum, Pet pet, Type type, User user) {
		super();
		this.bid = bid;
		this.bookingDate = bookingDate;
		this.telNum = telNum;
		this.pet = pet;
		this.type = type;
		this.user = user;
	}



}
