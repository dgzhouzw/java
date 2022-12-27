package org.example.java.foundational.operator.relation;

/**
 * 关系运算符
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 12:05
 * @since JDK17
 */
public class RelationOperator {

	public static void main(String[] args) {
		// 关系运算符的结果类型是布尔类型，要么是true，要么是false

		// 大于和小于
		System.out.println("10 > 20 = " + (10 > 20));
		System.out.println("10 < 20 = " + (10 < 20));

		// 等于和不等于
		System.out.println("10 == 10 = " + (10 == 10));
		System.out.println("10 != 20 = " + (10 != 20));

		// 大于或等于 和 小于或等于
		System.out.println("10 <= 20 = " + (10 <= 20));
		System.out.println("10 >= 10 = " + (10 >= 10));
	}
}
