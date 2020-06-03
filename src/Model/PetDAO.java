package Model;
import java.util.ArrayList;

/**
 *
 * @author Nakagawa
 */
public class PetDAO {
	static final String URL =  "jdbc:mysql://localhost/m_pet?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";


	/**
	 * データベース内のデータを取得する
	 * @return ArrayList<Pet>型の変数を返す
	 */
	public ArrayList<Pet> findAll(){

	}

	/**
	 * データベース内のデータを取得する
	 * @return ArrayList<Pet>型の変数を返す
	 */
	public ArrayList<Pet> findByTid() {

	}

	/**
	 * ペット別のデータを取得する
	 * @return Pet型の変数を返す
	 */
	public Pet findByPid(int pid) {

	}

	/**
	 * 新しいペットの情報の追加を行う
	 */
	public void insert(Pet p) {

	}

	/**
	 * 既存のペットの情報の更新を行う
	 */
	public void update(int pid) {

	}

	/**
	 * 既存のペットの情報の削除を行う
	 */
	public void delete(int pid) {

	}
}
