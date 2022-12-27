package org.example.java.foundational.operator.arithmetic;

/**
 * 算术运算符
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 10:06
 * @since JDK17
 */
public class ArithmeticOperator {
	public static void main(String[] args) {

		int left = 20;
		int right = 3;
		System.out.println("left = " + left);
		System.out.println("right = " + right);

		// 算术运算 + - * / %的使用
		System.out.printf("%d + %d = %d \n", left, right, (left + right));
		System.out.printf("%d - %d = %d \n", left, right, (left - right));
		System.out.printf("%d * %d = %d \n", left, right, (left * right));
		// 被除数 / 除数 = 商 ... 除数
		// 除法(/)就是求商
		System.out.printf("%d / %d = %d \n", left, right, (left / right));
		// 求余(%) 求余数
		System.out.printf("%d %% %d = %d \n", left, right, (left % right));

		char ch = 'a';
		int result = ch + left + right;
		System.out.printf("%d + %d + %d = %d\n", (int) ch, left, right, result);
	}
}
