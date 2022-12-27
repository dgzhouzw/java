package org.example.java.foundational.syntax.variable;

/**
 * 浮点类型变量的定义和使用
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 00:24
 * @since JDK17
 */
public class FloatVariable {

	public static void main(String[] args) {
		float floatVal = 3.14F;
		double dblVal = 3.14;
		System.out.println(floatVal);
		System.out.println(dblVal);

		// 浮点数 运算有精度损失 2.0 - 1.1 = 0.8999999999999999
		System.out.println(2.0 - 1.1);

		double value = 314E-2;
		System.out.println("value = " + value);

		value = 1000.00E3;
		System.out.println("value = " + value);
	}
}
