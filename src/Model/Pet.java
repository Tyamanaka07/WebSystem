package Model;

import java.sql.Date;

/**
 * ペットの構成
 * @author edu11
 *
 */
public class Pet {

	/**
	 * ペットID
	 */
	private int pid;

	/**
	 * 種類ID
	 */
	private int tid;

	/**
	 * ペットの誕生日
	 */
	private Date birthDate;

	/**
	 * ペットの性別
	 */
	private String sex;

	/**
	 * ペットの値段
	 */
	private int price;

	/**
	 * ペットの説明
	 */
	private String description;


	/**
	 * コンストラクター
	 * @param pid ペットID
	 * @param tid 種類ID
	 * @param birthDate ペットの誕生日
	 * @param sex ペットの性別
	 * @param price ペットの値段
	 * @param description ペットの説明
	 */
	public Pet(int pid, int tid, Date birthDate, String sex, int price, String description) {
		super();
		this.pid = pid;
		this.tid = tid;
		this.birthDate = birthDate;
		this.sex = sex;
		this.price = price;
		this.description = description;
	}


	/**
	 * ペットIDのgetter
	 * @return ペットID
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * sidのsetter
	 * @param pid ペットID
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * 種類IDのgetter
	 * @return 種類ID
	 */
	public int getTid() {
		return tid;
	}

	/**
	 * 種類IDのsetter
	 * @param tid 種類ID
	 */
	public void setTid(int tid) {
		this.tid = tid;
	}

	/**
	 * ペットの誕生日のgetter
	 * @return ペットの誕生日
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * ペットの誕生日のsetter
	 * @param birthDate ペットの誕生日
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * ペットの性別のgetter
	 * @return  ペットの性別
	 */
	public String getSex() {
		return sex;
	}

	/**
	 *  ペットの性別のsetter
	 * @param sex  ペットの性別
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * ペットの値段のgetter
	 * @return ペットの値段
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * ペットの値段のsetter
	 * @param price ペットの値段
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * ペットの説明のgetter
	 * @return ペットの説明
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * ペットの説明のsetter
	 * @param description ペットの説明
	 */
	public void setDescription(String description) {
		this.description = description;
	}


}
