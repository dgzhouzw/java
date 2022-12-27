package org.example.java.foundational.syntax.constant;

/**
 * final常量
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 00:40
 * @since JDK17
 */
public class FinalConstant {
	public static void main(String[] args) {
		final int number = 10;
		System.out.println(number);
		// 常量的值是不能被修改的
		// number = 20;
	}
}
