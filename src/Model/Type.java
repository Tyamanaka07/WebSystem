package Model;

/**
 * ペットの種類の構成
 * @author edu11
 *
 */
public class Type {
	private int tid;
	private String tname;


	/**
	 * ペットの種類IDのgetter
	 * @return ペットの種類ID
	 */
	public int getTid() {
		return tid;
	}

	/**
	 * ペットの種類IDのsetter
	 * @param tid ペットの種類ID
	 */
	public void setTid(int tid) {
		this.tid = tid;
	}

	/**
	 * ペットの種類の名前のgetter
	 * @return ペットの種類の名前
	 */
	public String getTname() {
		return tname;
	}

	/**
	 * 種類の名前のsetter
	 * @param tname ペットの種類の名前
	 */
	public void setTname(String tname) {
		this.tname = tname;
	}

	/**
	 * コンストラクター
	 * @param tid ペットの種類ID
	 * @param tname ペットの種類の名前
	 */
	public Type(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}


}
