package Model;

import java.sql.Date;
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
	 * ペットID
	 */
	private int pid;

	/**
	 * 生年月日
	 */
	private Date birthDate;

	/**
	 * 性別
	 */
	private String sex;


	/**
	 * ペットの種類
	 */
	private String tname;

	/**
	 * ユーザーID
	 */
	private int uid;

	/**
	 * ユーザーの名前
	 */

	private String uname;
	/**
	 * 予約した日時
	 */
	private Timestamp bookingDate;

	/**
	 * ユーザーの電話番号
	 */
	private String telNum;

	/**
	 * 予約ID
	 */
	private String f_path;

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
	 * 予約IDのgetter
	 * @return 予約ID
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
	 * 生年月日のgetter
	 * @return 生年月日
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * 生年月日のsetter
	 * @param birthDate 生年月日
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * 性別のgetter
	 * @return 性別
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 性別のsetter
	 * @param sex 性別
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 種類のgetter
	 * @return 種類
	 */
	public String getTname() {
		return tname;
	}

	/**
	 * 種類のsetter
	 * @param tname 種類
	 */
	public void setTname(String tname) {
		this.tname = tname;
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
	 * ユーザー名のgetter
	 * @return ユーザー名
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * ユーザー名のsetter
	 * @param uname ユーザー名
	 */
	public void setUname(String uname) {
		this.uname = uname;
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
	 * 画像のgetter
	 * @return 画像パス
	 */
	public String getF_path() {
		return f_path;
	}

	/**
	 * 画像のsetter
	 * @param f_path 画像パス
	 */
	public void setF_path(String f_path) {
		this.f_path = f_path;
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
	public Booking(int bid, int pid, Date birthDate, String sex, String tname, int uid, String uname, Timestamp bookingDate, String telNum, String f_path) {
		super();
		this.bid = bid;
		this.pid = pid;
		this.birthDate = birthDate;
		this.sex = sex;
		this.tname = tname;
		this.uid = uid;
		this.uname = uname;
		this.bookingDate = bookingDate;
		this.telNum = telNum;
		this.f_path = f_path;
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
