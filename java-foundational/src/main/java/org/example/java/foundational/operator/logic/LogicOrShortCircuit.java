package org.example.java.foundational.operator.logic;

/**
 * 短路或的短路的特性
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 12:43
 * @since JDK17
 */
public class LogicOrShortCircuit {

	public static void main(String[] args) {
		int left = 10;
		int right = 20;
		// 短路或 运算规则：||左右两边只要有一个true，那么运算结果就是true
		boolean flag = ++left > 10 || right-- < 20;
		System.out.println("left = " + left);
		System.out.println("right = " + right);
		System.out.println("flag = " + flag);
	}
}
