package org.example.java.foundational.syntax;

/**
 * 标识符的命名规则和命名规范
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/26 23:19
 * @since JDK17
 */
public class Identifier {

}

/**
 * 类的命名规范
 */
class UserInfo {

	/**
	 * 常量名的命名规范
	 */

	private static final String DEFAULT_PASSWORD = "111111";
	/**
	 * 变量名的命名规范
	 */
	private Long id;
	/**
	 * 变量名的命名规范
 	 */
	private String userName;

	/**
	 * 方法名的命名规范
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 方法名的命名规范
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
