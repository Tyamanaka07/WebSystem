package Model;

public class User {
	/**
	 * ユーザーID
	 */
	private int uid;

	/**
	 * ユーザー名
	 */
	private String uname;

	/**
	 * パスワード
	 */
	private String password;


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
	 * パスワードのgetter
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードのsetter
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * コンストラクター
	 * @param uid ユーザーID
	 * @param uname ユーザー名
	 * @param password パスワード
	 */
	public User(int uid, String uname, String password) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
	}


}
