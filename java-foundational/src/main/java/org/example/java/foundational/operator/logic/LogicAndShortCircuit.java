package org.example.java.foundational.operator.logic;

/**
 * 短路与
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 12:38
 * @since JDK17
 */
public class LogicAndShortCircuit {
	public static void main(String[] args) {

		int left = 10;
		int right = 20;

		boolean flag = left++ > 10 && right-- < 20;
		System.out.println("left = " + left);
		System.out.println("right = " + right);
		System.out.println("flag = " + flag);
	}
}
