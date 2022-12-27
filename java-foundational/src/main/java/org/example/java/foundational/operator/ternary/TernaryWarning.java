package org.example.java.foundational.operator.ternary;

/**
 * 三元运算符的使用注意事项
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 13:24
 * @since JDK17
 */
public class TernaryWarning {

	public static void main(String[] args) {
		// 一般情况下，三元运算符的结果类型的数据类型保持一致，也就是三元表达式的结果1结果2的数据类型需要保持一致

		// 结果1的类型是int
		// 结果2的类型是double
		// 但是由于7种数据类型(数值类型)是可以进行自动类型转换的
		// 12赋值给result变量之前自动转换成了浮点型
		double result = true ? 12 : 100.0;
		System.out.println("result = " + result);

		int value = true ? 100 : (int) 12.0;
		// 整数和浮点数在一起参与运算，结果类型是浮点类型
		System.out.println(true ? 100 : 12.0);
	}
}
