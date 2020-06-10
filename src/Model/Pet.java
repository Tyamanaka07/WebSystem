//作成者 中川伶丞

package Model;

import java.sql.Date;

/**
 * ペットの構成
 *
 */
public class Pet {

	/**
	 * ペットID
	 */
	private int pid;


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
	 * ペットの写真
	 */
	private String f_path;

	/**
	 * 予約したペットの種類
	 */
	private Type type;

	/**
	 * コンストラクター
	 * @param pid ペットID
	 * @param birthDate ペットの誕生日
	 * @param sex ペットの性別
	 * @param price ペットの値段
	 * @param description ペットの説明
	 * @param f_path 画像のパス
	 */

	public Pet(int pid, Date birthDate, String sex, int price, String description, String f_path) {
		super();
		this.pid = pid;
		this.birthDate = birthDate;
		this.sex = sex;
		this.price = price;
		this.description = description;
		this.f_path = f_path;
	}
	/**
	 * コンストラクター
	 * @param pid ペットID
	 * @param tid 種類ID
	 * @param birthDate ペットの誕生日
	 * @param sex ペットの性別
	 * @param price ペットの値段
	 * @param description ペットの説明
	 * @param f_path 画像のパス
	 */
	public Pet(int pid, Date birthDate, String sex, int price, String description, String f_path, Type type) {
		super();
		this.pid = pid;

		this.birthDate = birthDate;
		this.sex = sex;
		this.price = price;
		this.description = description;
		this.f_path = f_path;
		this.type = type;

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
	/**
	 * ペットの写真のgetter
	 * @return 	画像のパス
	 */
	public String getF_path() {
		return f_path;
	}

	/**
	 * ペットの説明のsetter
	 * @param f_path 画像のパス
	 */
	public void setF_path(String f_path) {
		this.f_path = f_path;
	}

	/**
	 * ペットの種類のgetter
	 * @param ペットの種類
	 */

	public Type getType() {
		return type;
	}

	/**
	 * ペットの種類のsetter
	 * @param  type ペットの種類
	 */

	public void setType(Type type) {
		this.type = type;
	}


}
