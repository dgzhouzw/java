package org.example.java.foundational.syntax.conversion;

/**
 * 强制类型转换
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/27 08:52
 * @since JDK17
 */
public class NarrowConversion {
	public static void main(String[] args) {
		// 取值范围较小的数据类型 变量名 = (取值范围较小的数据类型) 取值范围较大的数据类型的数值
		double salary = 10000.0;
		System.out.println("salary = " + salary);
		int intSalary = (int) salary;
		System.out.println("intSalary = " + intSalary);
	}
}
