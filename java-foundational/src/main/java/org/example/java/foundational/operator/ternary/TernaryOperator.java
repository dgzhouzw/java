package org.example.java.foundational.operator.ternary;

/**
 * 三元运算符的使用
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 13:18
 * @since JDK17
 */
public class TernaryOperator {

	public static void main(String[] args) {

		int left = 10;
		int right = 20;
		System.out.println("left = " + left);
		System.out.println("right = " + right);
		// 布尔表达式?结果1:结果2
		int max = left > right ? left : right;
		int min = left < right ? left : right;
		System.out.println("两个整数的最大值是" + max);
		System.out.println("两个整数的最小值是" + min);

		min = left > right ? right : left;
		System.out.println("另外一种求最小值是" + min);
	}
}
