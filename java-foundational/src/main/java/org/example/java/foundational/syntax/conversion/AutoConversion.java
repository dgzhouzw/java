package org.example.java.foundational.syntax.conversion;

/**
 * 7种基本数据类型的自动类型转换
 * 第一个自动类型转换的规则  byte < short < int < long < float < double
 * 第二个自动类型转换的规则 char < int < long < float < double
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 07:25
 * @since JDK17
 */
public class AutoConversion {

	public static void main(String[] args) {
		// 获取Float类型的最大值赋值给变量fltMax
		float fltMax = Float.MAX_VALUE;
		System.out.println("fltMax" + fltMax);
		System.out.printf("单精度浮点类型的float表示的最大值是%.2f\n", fltMax);

		// 获取Long类型的最大值
		long longMax = Long.MAX_VALUE;
		System.out.println("long类型的最大值是" + longMax);

		long longVar = 100L;
		System.out.println("longVar = " + longVar);

		float fltVar;
		// long自动转换成float
		fltVar = longVar;
		System.out.println("fltVar = " + fltVar);

		// char的表示范围
		char charMin = Character.MIN_VALUE;
		char charMax = Character.MAX_VALUE;
		System.out.println("char表示的最小值是" + (int) charMin);
		System.out.println("char表示的最大值是" + (int) charMax);

		// char自动转换成int
		int intVar = 100;
		intVar = charMax;
		// 编译错误
		// charMax = intvar;
		System.out.println("intVar = " + intVar);

		// short和char不能进行自动类型转换
		short shortVar = 100;
		// charMax = shortVar;
		// shortVar = charMax;
	}
}
